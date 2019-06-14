using System.Collections;
using System.Collections.Generic;
using UnityEngine;
public class BulletMove : MonoBehaviour {
    private GameObject targetObject;
    private Vector3 targetPos; 
    public GameObject GetTarget
    {
        set { targetObject = value; }
        get { return targetObject ; }
    }
	
	void Update () {
        ShootEnemy();

    }

    private void ShootEnemy()
    {
        if (targetObject != null)
        {
            targetPos = targetObject.transform.position + Vector3.up * 3;
            transform.LookAt(targetPos);
            if (Vector3.Distance(transform.position, targetPos) > 0.5f)
            {
                transform.Translate(Vector3.forward * Time.deltaTime * 20);
            }
            else
            {
                //掉血
                Destroy(gameObject);//销毁子弹
                //Destroy(targetObject);
                targetObject.GetComponent<EnemyAI>().Damage(90);
            }
        }
        else
            Destroy(gameObject);
      
    }
}
