package org.MI2F.akbarharis_projekuts;

import java.util.ArrayList;

public class DataGame {
    private static String[] namaGame = {
            "GTA V",
            "PUBG",
            "BATLE FIELD 2",
            "CSGO",
            "OVERWATCH",
            "PALADINS",
            "RED DEAD RENDEMPTION",
            "RESIDENT EVIL III",
            "POINT BLANK",
            "WAR THUNDER",
            "WORLD WAR Z",
            "STAR WARS JEDI FALLEN ORDER"

    };

    private static String[] detailGame = {
            "GAME MANTAP DENGAN GRAFIK BAGUS",
            "GAME MANTAP DENGAN GRAFIK BAGUS",
            "GAME MANTAP DENGAN GRAFIK BAGUS",
            "GAME MANTAP DENGAN GRAFIK BAGUS",



    };

    private static String[] hargaGame = {
            "Rp. 200.000",
            "Rp. 200.000",
            "Rp. 200.000",
            "Rp. 200.000",

    };

    private static String[] gambarGame = {
            "https://i0.wp.com/www.amd-id.com/wp-content/uploads/2015/04/11-1024x576.jpg?resize=940%2C528",
            "https://upload.wikimedia.org/wikipedia/id/3/3d/PlayerUnknown%27s_Battlegrounds_Steam_Logo.jpg",
            "https://awsimages.detik.net.id/community/media/visual/2018/05/28/6382cba1-b09f-4692-8c6c-58800e624f42.jpeg?w=700&q=90",
            "https://esportsnesia.com/wp-content/uploads/2018/05/Apa-Itu-CSGO.jpg",
            "https://s1.bukalapak.com/img/621100817/w-1000/Kaset_DVD_PC_Game_Overwatch_Origins_Edition_Original.jpg",
            "https://d26bwjyd9l0e3m.cloudfront.net/wp-content/uploads/2016/09/Paladins-Featured-1.jpg",
            "https://ecs7.tokopedia.net/img/cache/700/product-1/2018/10/27/4744191/4744191_818073d1-45fa-44f3-87dc-5dc2fd86b327_1500_1500.jpg",
            "https://i2.wp.com/pemmzchannel.com/wp-content/uploads/2020/04/Resident-Evil-3.jpg?fit=1280%2C720&ssl=1",
            "https://technologue.id/wp-content/uploads/2016/10/PBM.png",
            "https://static.warthunder.com/upload/image/!%202018/12%20December/Major%20Update/1_85_news_italy_eng_6b12355d3c97a4447bb560c4eca2f700.jpg",
            "https://d26bwjyd9l0e3m.cloudfront.net/wp-content/uploads/2013/06/World-War-Z-Review-Featured.jpg",
            "https://cdn-products.eneba.com/resized-products/VrHnf2r1IX2yFJkyfSD94fiKQ5ynw05QHA_kxak6Rck_390x400_1x-0.jpeg",



    };

    static ArrayList<Game> getListData() {
        ArrayList<Game> list = new ArrayList<>();
        for (int position = 0; position < namaGame.length; position++) {
            Game game = new Game();
            game.setNama_game(namaGame[position]);
            game.setDetail_game(detailGame[position]);
            game.setPhoto(gambarGame[position]);
            game.setHarga(hargaGame[position]);
            list.add(game);
        }
        return list;
    }
}
