using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GameManage : MonoBehaviour {
    private Transform[] wayPoint;//路径数组
    private GameObject[] enemyArray;//怪物数组
    private Transform creatPoint;//出生点
    private int enemyCount;//怪物波数
    private int enemyNumber;//每波怪物数
    private float times;//每波间隔
    private float timer;//一波之中的生成间隔
    private int count;//剩下怪物数
    private bool isFinish;//怪物全部生产完了
    private GameObject gameover;
    void Start()
    {
        creatPoint = GameObject.Find("CreatPoint").transform;
        enemyCount = 5;
        enemyNumber = 5;
        times = 3;
        timer = 0.5f;
        count = 0;
        StartCoroutine(EnemyIncubator());
        isFinish = false;
        gameover = GameObject.Find("UICanvas").transform.GetChild(0).gameObject;
    }
    public Transform[] GetWayPoint
    {
        set { wayPoint = value; }
        get { return wayPoint;  } 
    }
    public int GetCount
    {
        set { count = value; }
        get { return count ; }
    }
    public GameObject GetGameOver
    {
        set { gameover = value; }
        get { return gameover ; }
    }
    void Awake()
    {
        //可以得到的全部子物体的transform组件，但是父物体自己也会被算进来
        wayPoint = GameObject.Find("EVE").transform.GetChild(0).transform.GetComponentsInChildren<Transform>();
        enemyArray = Resources.LoadAll<GameObject>("Prefabs/Enemys");
    }
	
	void Update () {
        if (isFinish && 0 == count)
        {
            gameover.SetActive(true);
            gameover.transform.GetChild(0).GetComponent<UnityEngine.UI.Text>().text = "你赢了!";
        }
          
	}

    private IEnumerator EnemyIncubator()//生产怪物
    {
        for (int i = 0; i < enemyCount; i++)
        {
            for (int j = 0; j < enemyNumber; j++)
            {
                GameObject.Instantiate(enemyArray[Random.Range(0, enemyArray.Length-1)],
                    creatPoint.position, creatPoint.rotation);
                if (i == enemyCount || j == enemyNumber) {
                    GameObject.Instantiate(enemyArray[enemyArray.Length], creatPoint.position, creatPoint.rotation);
                }
                count++;
                yield return new WaitForSeconds(timer);
            }
            yield return new WaitForSeconds(times);
        }
        isFinish = true;
        StopCoroutine(EnemyIncubator());
    }






}
