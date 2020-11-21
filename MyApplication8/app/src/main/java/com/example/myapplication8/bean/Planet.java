package com.example.myapplication8.bean;

import com.example.myapplication8.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = {R.drawable.shuazi, R.drawable.zhi, R.drawable.rnw,
    R.drawable.meitong, R.drawable.zhiben, R.drawable.yanxian,
    R.drawable.zanzi,R.drawable.shu};
    private static String[] nameArray = {
            "化妆刷", "洗脸巾", "RNW洗面奶", "美瞳", "至本洗面奶", "眼线笔","簪子","口袋书"
    };
    private static String[] descArray = {
            "MSQ/魅丝蔻私人定制14支青萝化妆刷套装全套散粉眼影刷子美妆工具",
            "【三包装】洗脸巾一次性纯棉加厚洁面巾抽取式卸妆洗面棉柔巾擦脸",
            "【官方旗舰】韩国RNW氨基酸洗面奶洁面乳女深层清洁毛孔控油官网",
            "辣辣同款】海俪恩彩色隐形近视眼镜女Girls月抛2片白茶灰翻糖棕",
            "至本特安修护洁面泡150ml温和洁净易起泡沫氨基酸男女洁面乳慕斯",
            "漫野眼线液笔many防水汗防晕染新手胶软毛纤细速干棕色女初学者",
            "发簪日系和风少女簪子流苏步摇马尾发钗盘发汉服头饰发饰",
            "后浪正版现货包邮 642件可写的小事 袖珍版创意笔记本口袋本 "
    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}
