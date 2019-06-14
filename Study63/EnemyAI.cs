using System.Collections;
using System.Collections.Generic;
using UnityEngine;
public enum EnemyType//敌人类型
{
    ZOMBIEONE,
    ZOMBIETWO,
    ZOMBIETRREE,
    ZOMBIEFOUR,
    ZOMBIEFIVE
}

public class EnemyAI : MonoBehaviour {
    public EnemyType type;
    private GameManage script;
    private int wayPointIndex;
    private Vector3 targetPos;
    private Animator ani;
    private int hp;
    private GameObject dieEffect;
    private UIControl cos;
	void Start () {
        cos = GameObject.Find("UICanvas").GetComponent<UIControl>();
        script = GameObject.Find("GameManage").GetComponent<GameManage>();
        wayPointIndex = 1;
        targetPos = Vector3.zero;
        ani = GetComponent<Animator>();
        hp = 100;
        dieEffect = Resources.Load<GameObject>("Prefabs/Die");
	}
    void Update()
    {
        Move();
    }
    private void Move()//移动
    {
        targetPos = script.GetWayPoint[wayPointIndex].position;
        targetPos.y = transform.position.y;
        transform.LookAt(targetPos);
        if (Vector3.Distance(transform.position, targetPos) >= 0.05f)
        {
            transform.Translate(Vector3.forward * Time.deltaTime * 1.5f);
            if (type == EnemyType.ZOMBIEFIVE || type == EnemyType.ZOMBIEFOUR)
                ani.SetBool("WalkOne", true);
            else
                ani.SetBool("WalkTwo", true);
        }
        else
        {
            if (wayPointIndex < script.GetWayPoint.Length - 1)
                wayPointIndex++;
            else
            { //走到终点的后续操作
                ani.SetBool("WalkOne", false);
                ani.SetBool("WalkTwo", false);
                GameObject.Find("GameManage").GetComponent<GameManage>().GetGameOver.SetActive(true);
                GameObject.Find("GameManage").GetComponent<GameManage>().GetGameOver.transform.GetChild(0).GetComponent<UnityEngine.UI.Text>().text = "你输了!";
                Stop();
            }  
        }
      
    }

    public void Damage(int hp)//受伤
    {
        if (this.hp > 0)
        {
            this.hp -= hp;
            if (this.hp <= 0)
            {
                this.hp = 0;
                cos.add(100);
                //死亡
                GameObject.Find("GameManage").GetComponent<GameManage>().GetCount--;
                GameObject e = Instantiate(dieEffect,transform.position + Vector3.up * 2,Quaternion.identity);
                Destroy(e, 1.5f);
                Destroy(gameObject);
            }
        }
    }
    private void Stop()
    {
        GameObject[] enemy = GameObject.FindGameObjectsWithTag("Enemy");
        foreach (var o in enemy)
        {
            o.GetComponent<EnemyAI>().enabled = false;
        }
    }
}
