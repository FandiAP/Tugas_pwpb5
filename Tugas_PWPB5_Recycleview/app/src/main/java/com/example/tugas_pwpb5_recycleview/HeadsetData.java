package com.example.tugas_pwpb5_recycleview;

import java.util.ArrayList;

public class HeadsetData{
    public static String[] [] data = new String[][] {
            {"Rexus Vonix F55", "Rexus" , "Rp 209.000" , "Vonix F55 hadir sebagai headset yang terkenal bandel dan nyaman digunakan. Meski mengandalkan driver speaker berdiameter 40mm, kualitas suara yang dihadirkan tak kalah dengan headset unggulan lainnya. Kenyamanan headset ini diperoleh dari penggunaan earcup lonjong yang mengikuti bentuk telinga sehingga melingkupi telinga secara sempurna." ,"https://www.goodgamingshop.com/wp-content/uploads/2018/06/21430268_908845185939738_3461448560278383555_n-600x600.jpg "},
            {"Rexus Vonix F65", "Rexus" , "Rp 160.000" , "Rexus gaming headset Vonix F65 merupakan headset  dengan desain yang modern, dengan kualitas suara khas Rexus seri Vonix yang khas, dengan karakteristik clear dan detil. Desain yang modern itu terlilhat dalam bentuk kubah speaker yang berbentuk pentagonal dengan mikrofon yang bisa dilipat dan tersimpan rapi saat tidak digunakan. Desain keren itu disempurnakan dengan permukaan black doff yang membuat headset ini tampil memukau." ,"https://ecs7.tokopedia.net/img/cache/700/product-1/2018/8/23/30067209/30067209_6c64970b-372f-4c7b-ac19-42e1cc368911_1000_1000.jpeg"},
            {"Rexus Vonix F19", "Rexus", "Rp 155.000" , "Rexus headset F19 atau dikenal dengan sebutan Vonix F19 adalah headset gaming yang dilengkapi oleh speaker dan microfon yang memiliki fungsi dan spesifikasi berbeda. Rexus Vonix F19 ditawarkan kepada Anda yang ingin memilki headset dengan kualitas dan kinerja terbaik dengan harga yang relative terjangkau." ,"https://mall.wikiobralan.com/id/1050/products/original/bfdd098966f68c982478cdd3e49354f7.jpg"},
            {"Sades G Power SA-708", "Sades", "Rp 250.000" , "Headset ini sangat bagus untuk anda yang ingin memiliki pengalaman bermain game yang indah tetapi dengan budget yang terbatas. Dengan connectornya yaitu 3.5mm bisa dipakai di gadet mana saja seperti laptop, smartphone, tablet, dan masih banyak lagi. Meskipun speakernya yang sedikit kurang besar, tetapi itu tidak mengurangi kualitas suaranya Saya berani menyarankan headset ini untuk anda yang memiliki budget terbatas." ,"https://i.ytimg.com/vi/KW7JRZWMZwA/hqdefault.jpg"},
            {"Sades SA-901", "Sades", "Rp 270.000" , "Headset dari Sades yang bernama Sades Wolfang SA-901 ini sangat layak untuk dipakai. Cocok untuk orang yang sedang mencari headset murah dengan peforma maksimal untuk gaming. Demikianlah akhir dari review kami ini" ,"https://s1.bukalapak.com/img/677108061/w-1000/sades_901_6.jpg"},

    };

    public  static ArrayList<Headset> getListData(){
        ArrayList<Headset> list = new ArrayList<>();
        for (String[] adata: data){
            Headset headset = new Headset();
            headset.setName(adata[0]);
            headset.setFrom(adata[3]);
            headset.setPhoto(adata[4]);
            list.add(headset);
        }
        return  list;
    }
}
