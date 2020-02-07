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
            R.drawable.ahmad_dahlan,
            R.drawable.ahmad_yani,
            R.drawable.bung_tomo,
            R.drawable.gatot_subroto,
            R.drawable.ki_hadjar_dewantara,
            R.drawable.mohammad_hatta,
            R.drawable.sudirman,
            R.drawable.sukarno,
            R.drawable.supomo,
            R.drawable.tan_malaka
    };

    static ArrayList<katalog> getListData() {
        ArrayList<katalog> list = new ArrayList<>();
        for (int position = 0; position < KatalogNames.length; position++) {
            katalog katalog = new katalog();
            katalog.setName(KatalogNames[position]);
            katalog.setDetail(KatalogDetails[position]);
            katalog.setPhoto(KatalogImages[position]);
            list.add(katalog);
        }
        return list;
    }
}