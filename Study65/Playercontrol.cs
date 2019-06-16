using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Playercontrol : MonoBehaviour {
    private Vector2 dir;
   public int hp = 3;
    private Animator ani;
    private bool isGround;
    private Boxcontrol box;
    private Transform boxTrans;
	void Start () {
        ani = GetComponent<Animator>();
        boxTrans = transform.GetChild(0);
	}
	void Update () {
        float horizontal = Input.GetAxis("Horizontal");
        if (horizontal != 0)
        {
            ani.SetBool("IsRun", true);
            transform.localScale = new Vector3(horizontal > 0 ? 1 : -1, 1, 1);
            transform.Translate(Vector2.right * horizontal * Time.deltaTime);
        }else
        {
            ani.SetBool("IsRun", false);
        }
        if (Input.GetKeyDown(KeyCode.I) && isGround)
        {
            GetComponent<Rigidbody2D>().AddForce(Vector2.up * 200);
        }
        if (Input.GetKeyDown(KeyCode.U))
            {
            if (boxTrans.childCount == 0 && box != null)
            {
                box.transform.SetParent(boxTrans);
                box.transform.localPosition = Vector2.zero;
                AudioManager.Instance.playSound("getbox");
                ani.SetFloat("IsBox", 1);
            }
            else if (boxTrans.childCount > 0)
            {
                boxTrans.GetComponentInChildren<Boxcontrol>().Move(transform.localScale.x);
                AudioManager.Instance.playSound("boxmove");
                ani.SetFloat("IsBox", 0);
                ani.SetTrigger("attack");
                boxTrans.GetChild(0).SetParent(null);
            }
            }
	}
    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.collider.tag == "Ground" && GetComponent<Rigidbody2D>().velocity.y <= 0) ;
        {
            isGround = true;
            ani.SetBool("IsJump", false);
            AudioManager.Instance.playSound("jumpend");
        }
        if (collision.collider.tag == "enemy")

        {
            hp -= 1;
            if (hp == 0)
            {
                GetComponent<Rigidbody2D>().AddForce(Vector2.up * 150);
                Destroy(GetComponent<Collider2D>());
                Destroy(gameObject, 1.5f);
                AudioManager.Instance.playSound("boxhit");
                
            }
        }
    }
    private void OnCollisionExit2D(Collision2D collision)
    {
        if (collision.collider.tag == "Ground")
        {
            isGround = false;
            ani.SetBool("IsJump", true);
        }
    }
    private void OnTriggerEnter2D(Collider2D collision)
    {
        if (collision.tag == "Box") ;
        {
            box = collision.GetComponent< Boxcontrol > ();
        }
    }
    private void OnTriggerExit2D(Collider2D collision)
    {
        if (collision.tag == "Box") ;
        {
            box = null;
        }   
    }
}

