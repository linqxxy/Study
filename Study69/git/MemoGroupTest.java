package com.linqxxy.git;

import java.time.LocalDateTime;

public class MemoGroupTest {
    public static void main(String[] args) {
//        MemoGroup memoGroup=new MemoGroup();
//        memoGroup.setName("你好世界");
//        memoGroup.setCreatedTime(LocalDateTime.now());
//        boolean result=MemoGroupUtil.createMemoGroup(memoGroup);
//        if (result){
//            System.out.println("便签创建成功");
//        }else {
//            System.out.println("便签创建失败");
//        }
//        MemoGroup memoGroup1=  MemoGroupUtil.queryMemoGroupById(1).get(0);
//        boolean result=MemoGroupUtil.updateMemoGroup(memoGroup1,"Java");
//        if (result){
//            System.out.println("数据更新成功");
//        }else {
//            System.out.println("数据更新失败");
//        }
//        int ret=MemoGroupUtil.deleteMemoGroupByName("你好世界");
//        System.out.println("删除了"+ret+"条数据");
        MemoGroup memoGroup=new MemoGroup();
        memoGroup.setId(21);
        memoGroup.setName("吃饭了没");
        memoGroup.setCreatedTime(LocalDateTime.now());
        MemoInfo memoInfo=new MemoInfo();
        memoInfo.setId(30);
        memoInfo.setGroupId(memoGroup.getId());
        memoInfo.setTitle("Java");
        memoInfo.setContent("---");
        memoInfo.setCreatedTime(LocalDateTime.now());
        boolean ret =MemoGroupUtil.createMemoInfo(memoGroup,memoInfo);
        if (ret){
            System.out.println("memoInfo创建成功");
        }else {
            System.out.println("memoInfo创建失败");
        }
    }
}
