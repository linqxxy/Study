using System.Collections;
using System.Collections.Generic;
using UnityEngine;
public enum TowerType
{
    NORMAL,//普通炮
    LASER,//激光炮
}
[RequireComponent(typeof(Rigidbody))]
[RequireComponent(typeof(SphereCollider))]
public class TowerAI : MonoBehaviour {
    private TowerType type;
    private GameObject targetEnemy;//攻击的目标敌人
    private List<GameObject> enemys;
    private Transform turrets;//可以旋转的炮管
    private Transform firePos;//开火口(生成子弹的地方)
    private GameObject bulletPrefab;
    private LineRenderer line;
    private float times;//计时器
    private bool canAttack;//能否攻击
    private AudioManage audioScirpt;
    public int upgradeIndex;//已升级过的次数
    public TowerType GetTypes
    {
        set { type = value; }
        get { return type; } 
    }
	void Start () {
        turrets = transform.GetChild(0);
        firePos = transform.GetChild(0).GetChild(0);
        enemys = new List<GameObject>();
        canAttack = false;
        times = 0;
        bulletPrefab = Resources.Load("Prefabs/Bullet") as GameObject;
        line = GetComponent<LineRenderer>();
        GetComponent<SphereCollider>().isTrigger = true;
        GetComponent<SphereCollider>().radius = 10;
        GetComponent<Rigidbody>().useGravity = false;
        audioScirpt = GameObject.Find("AudioManage").GetComponent<AudioManage>();
	}
	void Update () {
        if (canAttack)
        {
            times += Time.deltaTime;
            //锁定目标怪物
            Attack();
        }
        if (enemys.Count > 0 && targetEnemy != null)
        {
            LookAtTarget();
        }
        else
        {
            canAttack = false;
        }
        if (times >= 2)
        {
            TowerReflet();//实际的攻击
            times = 0;
        }
	}

    private void LookAtTarget()//朝向敌人
    {
        Vector3 targets = targetEnemy.transform.position;
        targets.y = turrets.position.y;
        turrets.LookAt(targets);
    }

    public void OnTriggerEnter(Collider other)//触发检测(进入碰撞范围时触发一次)(来判断怪物进入攻击范围没)
    {
        if (other.tag == "Enemy" && !enemys.Contains(other.gameObject))
        {
            enemys.Add(other.gameObject);//加入能攻击的怪物列表
            canAttack = true;
        }
    }

    public void OnTriggerExit(Collider other)//触发检测(离开碰撞范围时触发一次)判断怪物跑离攻击范围没
    {
        if (other.tag == "Enemy")
        {
            enemys.Remove(other.gameObject);
        }
    }

    private void Attack()//攻击
    {
        if (enemys.Count > 0 && enemys[0] == null)//第一个元素为空，那我们就重新刷新下列表，拿到刷新后的第一个元素
        {
            UpdateList();
        }
        if (enemys.Count > 0)//有怪物可以攻击
        {
            //第一个元素不为空，并且在攻击范围内
            if (enemys[0] != null && enemys.Contains(enemys[0]))
            {
                //可以攻击了
                targetEnemy = enemys[0];
                LookAtTarget();
            }
            else
            {
                //继续刷新列表
                UpdateList();
            }
        }
        else
        {
            //没怪物不攻击
            canAttack = false;
        }
    }

    private void UpdateList()//更新怪物列表
    {
        List<int> temp = new List<int>();//临时列表，来存放空元素索引
        for (int i = 0; i < enemys.Count; i++)
        {
            if (enemys[i] == null)
                temp.Add(i);
        }

        for (int j = 0; j < temp.Count; j++)
        {
            enemys.RemoveAt(temp[j] - j);
        }
    }

    private void TowerReflet()//炮台的反映(实际做出的攻击动作)
    {
        Debug.Log(targetEnemy.name);
        if (targetEnemy != null)
        {
            if (type == TowerType.NORMAL)//普通炮
            {
                CreatBullet();
            }
            else
            {
                CreatLaser();
            }
        }
    }

    private void CreatBullet()//生成子弹
    {
        GameObject bullet = Instantiate(bulletPrefab, firePos.position, firePos.rotation);
        if (bullet.GetComponent<BulletMove>() == null)
            bullet.AddComponent<BulletMove>();
        bullet.GetComponent<BulletMove>().GetTarget = targetEnemy;
        audioScirpt.PlayAudioClip(this.tag, firePos.position, 1f);
    }
    private void CreatLaser()//发射激光
    {
        line.enabled = true;
        line.startWidth = 0.1f;
        line.SetPosition(0, firePos.position);
        line.SetPosition(1, targetEnemy.transform.position + Vector3.up * 3);
        audioScirpt.PlayAudioClip(this.tag, firePos.position, 1f);
        targetEnemy.GetComponent<EnemyAI>().Damage(50);
        StartCoroutine(CloseLine());
    }
    private IEnumerator CloseLine()
    {
        yield return new WaitForSeconds(0.1f);
        line.enabled = false;
        StopCoroutine(CloseLine());
    }
}
