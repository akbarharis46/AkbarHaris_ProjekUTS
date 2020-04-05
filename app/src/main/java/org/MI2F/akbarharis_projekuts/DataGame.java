package org.MI2F.akbarharis_projekuts;

import java.util.ArrayList;

public class DataGame {
    private static String[] namaGame = {
            "GTA V",
            "PUBG",
            "BATLE FIELD 2",
            "CSGO",

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
            "https://upload.wikimedia.org/wikipedia/commons/c/c1/GTA_V_logo.png",
            "https://upload.wikimedia.org/wikipedia/commons/c/c1/GTA_V_logo.png",
            "https://upload.wikimedia.org/wikipedia/commons/c/c1/GTA_V_logo.png",
            "https://upload.wikimedia.org/wikipedia/commons/c/c1/GTA_V_logo.png",

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
