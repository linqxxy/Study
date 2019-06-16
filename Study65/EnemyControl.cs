using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class EnemyControl : MonoBehaviour
{
    private Playercontrol player;
    private float speed = 0.7f;
    private int hp = 1;
    private Vector2 dir;
    void Start()
    {

    }

    void Update()
    {
        if (dir != Vector2.zero)
        {
            transform.Translate((Vector2.up + dir) * 2 * Time.deltaTime);
            player = GameObject.FindWithTag("player").GetComponent<Playercontrol>();
        }

    }
    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.collider.tag == "Box") 
            {
                Destroy(GetComponent<Rigidbody2D>());
                Destroy(GetComponent<Collider2D>());
                Destroy(gameObject, 3f);
            dir = new Vector2(collision.collider.transform.localScale.x, 0);
            AudioManager.Instance.playSound("boxhit");
            }
    }
}
