package com.example.myapplication12.bean;

import com.example.myapplication12.R;

import java.util.ArrayList;

public class GoInfo {
    public int pic_id;
    public String title;
    public String desc;
    public boolean bPressed;
    public int id;
    private static int seq = 0;

    public GoInfo(int pic_id, String title, String desc) {
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"登录", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoInfo> getDefaultGrid() {
        ArrayList<GoInfo> gridArray = new ArrayList<GoInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }



    private static int[] stagImageArray = {R.drawable.c1, R.drawable.c2, R.drawable.c3
            , R.drawable.c4, R.drawable.c5, R.drawable.c6, R.drawable.c7
            , R.drawable.c8, R.drawable.c9, R.drawable.c10, R.drawable.c11
            , R.drawable.c12, R.drawable.c13, R.drawable.c14, R.drawable.c15
            , R.drawable.c16, R.drawable.c17, R.drawable.c18, R.drawable.c19
            , R.drawable.c20, R.drawable.c21, R.drawable.c22, R.drawable.c23};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "算了吧", "大声点",
            "嘘嘘", "嗯嗯", "呼呼", "呵呵", "哈哈", "嘿嘿", "嘻嘻", "嗷嗷", "喔喔"};

    public static ArrayList<GoInfo> getDefaultStag() {
        ArrayList<GoInfo> stagArray = new ArrayList<GoInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }





}
