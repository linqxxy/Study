using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class cameraControl : MonoBehaviour {

    public Transform target;
    public float minx,miny;
    public float maxx,maxy;
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
        Vector3 v = transform.position;
        v.x = target.position.x;
        v.y = target.position.y;
        if (v.x > maxx)
        {
            v.x = maxx;
        }
        if (v.x < minx)
        {
            v.x = minx;
        }
        if (v.y > maxy)
        {
            v.y = maxy;
        }
        if (v.y < miny)
        {
            v.y= miny;
        }
        transform.position = v;
	}
}
