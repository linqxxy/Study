using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.EventSystems;
public class CreatTower : MonoBehaviour {
    private GameObject worldCanvas;//选炮台UI
    private GameObject firstSelect;//第一页UI(选那个炮台)
    private GameObject nextSelect;//第二页UI(创建，升级，出售等)
    private GameObject selectTower;//选择的炮台
    private string selectTowerTag;//当前炮台的标签
    private GameObject[] towers;
    private GameObject temp;//这个是用来保存点击的那个地基的
    private int tempIndex;
    private UIControl script;
	void Start () {
        worldCanvas = transform.Find("WorldCanvas").gameObject;
        selectTower = null;
        firstSelect = transform.Find("WorldCanvas").GetChild(0).GetChild(0).gameObject;
        nextSelect = transform.Find("WorldCanvas").GetChild(0).GetChild(1).gameObject;
        towers = Resources.LoadAll<GameObject>("Prefabs/Towers");
        selectTowerTag = "Untagged";
        tempIndex = 0;
        script = GameObject.Find("UICanvas").GetComponent<UIControl>();
    }
    void Update()
    {
        if (Input.GetMouseButtonDown(0))
            SelectBase();

    }
    //选择一个地基(可以建造炮台，升级炮台，出售炮台)
    private void SelectBase()
    {
        Ray ray = Camera.main.ScreenPointToRay(Input.mousePosition);
        RaycastHit hit;
        if (Physics.Raycast(ray, out hit) && (EventSystem.current.IsPointerOverGameObject() == false))
        {
            CloseWorldCanvas();
            temp = null;
            if (hit.transform.tag == "GroundWork")//这是个地基，可以创建炮台
            {
                ShowWorldCanvas(hit.transform);
                temp = hit.transform.gameObject;
                if (hit.transform.childCount != 0)//这个地基上面有炮台
                {
                    //UI显示
                    nextSelect.SetActive(true);
                    firstSelect.SetActive(false);
                 
                }
                else//这个地基没有创建过炮台
                {
                   
                }
               
            }
        }
    }

    //通过名字在所有的炮台中找到需要的炮台
    private GameObject TargetTower(GameObject[] array ,string name)
    {
        GameObject tempTower = null;
        foreach (var tower in array)
        {
            if (tower.name == name)
            {
                tempTower = tower;//选择的炮台就是传进来名字叫name的炮台
            }
        }
        return tempTower;
    }
    //实例化炮台
    private void InstantiateTower(GameObject towerss, string tags)
    {
        GameObject tower = Instantiate(towerss);
        tower.transform.parent = temp.transform;
        tower.transform.localPosition = Vector3.up * 1f;
        tower.transform.localRotation = Quaternion.identity;
        if (tower.GetComponent<TowerAI>() == null)
            tower.AddComponent<TowerAI>();
        //tower.layer = 8;
        tower.tag = tags;
        tower.GetComponent<TowerAI>().upgradeIndex = tempIndex;
        switch (tower.tag)
        {
            case "A":
                tower.GetComponent<TowerAI>().GetTypes = TowerType.NORMAL;
                break;
            case "B":
                tower.GetComponent<TowerAI>().GetTypes = TowerType.NORMAL;
                break;
            case "C":
                tower.GetComponent<TowerAI>().GetTypes = TowerType.NORMAL;
                break;
            case "D":
                tower.GetComponent<TowerAI>().GetTypes = TowerType.LASER;
                tower.AddComponent<LineRenderer>();
                break;
        }
        tempIndex = 0;
        temp = null;  
    }
    //显示选炮台UI
    private void ShowWorldCanvas(Transform pos)
    {
        worldCanvas.SetActive(true);
        worldCanvas.transform.localPosition = new Vector3(pos.position.x, 0, pos.position.z);
        worldCanvas.transform.eulerAngles = new Vector3(50, 0, 0);
    }
    //关闭选炮台UI
    public void CloseWorldCanvas()
    {
        worldCanvas.SetActive(false);
        nextSelect.SetActive(false);
        firstSelect.SetActive(true);
    }
    //下面四个是按钮的注册事件，用来得到点击的炮台种类
    public void TowerA(bool isOn)
    {
        if (isOn)
        {
            selectTower = TargetTower(towers, "Tow_BaseCannon");
            selectTowerTag = "A";
            nextSelect.SetActive(true);
        }
    }
    public void TowerB(bool isOn)
    {
        if (isOn)
        {
            selectTower = TargetTower(towers, "Tow_BaseMortar");
            selectTowerTag = "B";
            nextSelect.SetActive(true);
        }
    }
    public void TowerC(bool isOn)
    {
        if (isOn)
        {
            selectTower = TargetTower(towers, "Tow_BaseGatling");
            selectTowerTag = "C";
            nextSelect.SetActive(true);
        }
    }
    public void TowerD(bool isOn)
    {
        if (isOn)
        {

            selectTower = TargetTower(towers, "Tow_BaseLaser");
            selectTowerTag = "D";
            nextSelect.SetActive(true);
        }
    }
    //创建炮台事件
    public void BuildTower(bool isOn)
    {
        if (isOn) 
        {
            if (selectTower != null && 0 == temp.transform.childCount)
            {
                if (!script.Cost(300)) {  return; }
                InstantiateTower(selectTower, selectTowerTag);
                CloseWorldCanvas();
            }
            else
            {
                //这个地基已经有炮台了！
            }
        }
    }
    //升级炮台事件
    public void UpdateTower(bool isOn)
    {
        if (isOn)
        {
            if (temp != null && temp.transform.childCount != 0 && temp.transform.GetChild(0).GetComponent<TowerAI>().upgradeIndex < 2)
            {
                temp.transform.GetChild(0).GetComponent<TowerAI>().upgradeIndex++;
                tempIndex = temp.transform.GetChild(0).GetComponent<TowerAI>().upgradeIndex;
                GameObject towers = InstantiateUpdateTower(temp.transform.GetChild(0).tag, tempIndex);
                Destroy(temp.transform.GetChild(0).gameObject);
                InstantiateTower(towers,towers.tag);
                CloseWorldCanvas();
            }
            else
            {
            }
        }
    }
    //出售炮台事件
    public void SellTower(bool isOn)
    {
        if (isOn)
        {
            script.add(50);
        }
    }
    //关闭选择UI事件
    public void CloseSelect(bool isOn)
    {
        if (isOn)
        {
            worldCanvas.SetActive(false);
            firstSelect.SetActive(true);
            nextSelect.SetActive(true);
        }
    }
    //得到需要升级的炮台种类
    private GameObject InstantiateUpdateTower(string tag, int number)
    {
        GameObject tower = null;
        switch (tag)
        {
            case "A":
                if (1 == number)
                    tower = TargetTower(towers, "Tow_UpgradeOneCannon");
                else
                    tower = TargetTower(towers, "Tow_UpgradeTwoCannon");
                break;
            case "B":
                if (1 == number)
                    tower = TargetTower(towers, "Tow_UpgradeOneMortar");
                else
                    tower = TargetTower(towers, "Tow_UpgradTwoMortar");
                break;
            case "C":
                if (1 == number)
                    tower = TargetTower(towers, "Tow_UpGradeOneGatling");
                else
                    tower = TargetTower(towers, "Tow_UpgradeTwoGatling");
                break;
            case "D":
                if (1 == number)
                    tower = TargetTower(towers, "Tow_UpgradeOneLaser");
                else
                    tower = TargetTower(towers, "Tow_UpgradTwoLaser");

                break;
        }
        tower.tag = tag;
        
        return tower;
    }
}
