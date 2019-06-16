using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Boxcontrol : MonoBehaviour {
    public float speed = 0;
    
	void Start () {
		
	}
	
	
	void Update () {
        transform.Translate(Vector2.right * speed * 2 * Time.deltaTime);
	}
    public void Move(float dir)
    {
        speed = dir;
        Destroy(gameObject,3f);
    }
}
