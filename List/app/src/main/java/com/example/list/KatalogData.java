package com.example.list;

import java.util.ArrayList;

public class KatalogData {
    private static String[] KatalogNames = {
            "Exclusive WR0278",
            "Exclusive WR0272",
            "Exclusive WR0064",
            "Exclusive WR0156",
            "Exclusive WR0150",
            "Exclusive WR0104",
            "Exclusive WR0092",
            "Exclusive WR0084",
            "Exclusive WR0088",
            "Exclusive WR0206"
    };

    private static String[] KatalogDetails = {
            "Cincin kawin dengan 12 berlian kecil 0,085 karat dan 1 berlian besar 0,1 sampai 0,18 karat",
            "Berbentuk menyerupai sebuah mahkota putri raja, cincin ini tentunya punya tampilan mewah dan elegan dengan tatahan sepuluh berlian 0,05 karat pada sisi-sisinya dan 0,05 sampai 0,06 karat berlian pada bagian tengahnya",
            "Cincin kawin cantik dengan taburan 30 berlian",
            "Cincin dengan 18 berlian 0,10 karat tampak terhubung kepada berlian 0,14 karat yang menjadi center dari cincin kawin ini",
            "Cincin kawin seperti untaian-untaian tali yang diikat menjadi satu yang akan tampak begitu indah di jemari Anda",
            "Cincin dengan menggunakan dua bahan dengan warna yang berbeda membuat cincin kawin ini tampak mewah",
            "Cincin dengan dua belas berlian berkualitas tinggi dengan grade F dan tingkatan Vvs ditata rapi pada band cincin dan menyempurnakan kilau pada keseluruhan cincin yang terbuat dari emas putih dengan finishing glossy dan doff",
            "Cincin kawin maskulin dengan garis-garis tegas yang dipertontonkan pada cincin",
            "Cincin dengan desain exclusive untuk anda yang mencintai segala kemewahan dalam sebuah perhiasan",
            "Cincin dengan bentukan round diamond yang nyaris sempurna tanpa cacat sangat cocok dipadukan dengan desain cincin band tebal dengan ukiran mewah"
    };

    private static int[] KatalogImages = {
            R.drawable.c1,
            R.drawable.c2,
            R.drawable.c3,
            R.drawable.c4,
            R.drawable.c5,
            R.drawable.c6,
            R.drawable.c7,
            R.drawable.c8,
            R.drawable.c9,
            R.drawable.c10
    };

    private static int[] KatalogHeader = {
            R.drawable.head1,
            R.drawable.head2,
            R.drawable.head3,
            R.drawable.head4,
            R.drawable.head5,
            R.drawable.head6,
            R.drawable.head7,
            R.drawable.head8,
            R.drawable.head9,
            R.drawable.head10
    };

    private static String[] KatalogPrice = {
            "Rp. 20.896.825",
            "Rp. 11.079.750",
            "Rp. 17.794.750",
            "Rp. 21.494.375",
            "Rp. 36.800.750",
            "Rp. 23.559.875",
            "Rp. 17.945.625",
            "Rp. 10.276.500",
            "Rp. 15.274.500",
            "Rp. 13.929.375"
    };

    private static String[] KatalogLogam = {
            "Rose Gold, Yellow Gold, White Gold, Paladium, Platina, Silver",
            "Rose Gold, Yellow Gold, White Gold, Paladium, Platina, Silver",
            "Rose Gold, Yellow Gold, White Gold, Paladium, Platina, Silver",
            "Rose Gold, Yellow Gold, White Gold, Paladium, Platina, Silver",
            "Rose Gold, Yellow Gold, White Gold, Paladium, Platina, Silver",
            "Rose Gold, Yellow Gold, White Gold, Paladium, Platina, Silver",
            "Rose Gold, Yellow Gold, White Gold, Paladium, Platina, Silver",
            "Rose Gold, Yellow Gold, White Gold, Paladium, Platina, Silver",
            "Rose Gold, Yellow Gold, White Gold, Paladium, Platina, Silver",
            "Rose Gold, Yellow Gold, White Gold, Paladium, Platina, Silver"
    };

    private static String[] KatalogDiamond = {
            "0.265-0.185, Swarovski, Polos",
            "0.11-0.1, Swarovski, Polos",
            "0.27-0.27, Swarovski, Polos",
            "0.29-0.24, Swarovski, Polos",
            "0.27-0.48, Swarovski, Polos",
            "0.26-0.21, Swarovski, Polos",
            "0.23-0.22, Swarovski, Polos",
            "0.36-0.58, Swarovski, Polos",
            "0.31-0.31, Swarovski, Polos",
            "0.08-0.05, Swarovski, Polos"
    };

    static ArrayList<katalog> getListData() {
        ArrayList<katalog> list = new ArrayList<>();
        for (int position = 0; position < KatalogNames.length; position++) {
            katalog katalog = new katalog();
            katalog.setName(KatalogNames[position]);
            katalog.setDetail(KatalogDetails[position]);
            katalog.setPhoto(KatalogImages[position]);
            katalog.setHeader(KatalogHeader[position]);
            katalog.setPrice(KatalogPrice[position]);
            katalog.setLogam(KatalogLogam[position]);
            katalog.setDiamond(KatalogDiamond[position]);
            list.add(katalog);
        }
        return list;
    }
}