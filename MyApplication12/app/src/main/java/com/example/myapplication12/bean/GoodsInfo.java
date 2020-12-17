package com.example.myapplication12.bean;


import com.example.myapplication12.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "化妆刷", "洗脸巾", "RNW洗面奶", "美瞳", "至本洗面奶", "眼线笔","簪子","口袋书"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "MSQ/魅丝蔻私人定制14支青萝化妆刷套装全套散粉眼影刷子美妆工具",
            "【三包装】洗脸巾一次性纯棉加厚洁面巾抽取式卸妆洗面棉柔巾擦脸",
            "【官方旗舰】韩国RNW氨基酸洗面奶洁面乳女深层清洁毛孔控油官网",
            "辣辣同款】海俪恩彩色隐形近视眼镜女Girls月抛2片白茶灰翻糖棕",
            "至本特安修护洁面泡150ml温和洁净易起泡沫氨基酸男女洁面乳慕斯",
            "漫野眼线液笔many防水汗防晕染新手胶软毛纤细速干棕色女初学者",
            "发簪日系和风少女簪子流苏步摇马尾发钗盘发汉服头饰发饰",
            "后浪正版现货包邮 642件可写的小事 袖珍版创意笔记本口袋本 "
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {159, 20, 89, 54, 55, 59,17,20};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.shuazi_s, R.drawable.zhi_s, R.drawable.rnw_s,
            R.drawable.meitong_s, R.drawable.zhiben_s, R.drawable.yanxian_s,
            R.drawable.zanzi_s,R.drawable.shu_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.shuazi, R.drawable.zhi, R.drawable.rnw,
            R.drawable.meitong, R.drawable.zhiben, R.drawable.yanxian,
            R.drawable.zanzi,R.drawable.shu
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
