using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class AudioManage : MonoBehaviour {
    public AudioClip towerAShootClip;
    public AudioClip towerBShootClip;
    public AudioClip towerCShootClip;
    public AudioClip towerDShootClip;
    void Start () { 
		
	}
    public void PlayAudioClip(string towerTag, Vector3 pos, float volume)
    {
        AudioClip clip = null;
        switch (towerTag)
        {
            case "A":
                clip = towerAShootClip;
                break;
            case "B":
                clip = towerBShootClip;
                break;
            case "C":
                clip = towerCShootClip;
                break;
            case "D":
                clip = towerDShootClip;
                break;
        }
        AudioSource.PlayClipAtPoint(clip, pos, volume);
    }
	void Update () {
		
	}
}
