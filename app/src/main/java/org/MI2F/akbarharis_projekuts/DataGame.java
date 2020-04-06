package org.MI2F.akbarharis_projekuts;

import java.util.ArrayList;

public class DataGame {
    private static String[] namaGame = {
            "GTA V",
            "PUBG",
            "BATLE FIELD V",
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
            "Grand Theft Auto V (Disingkat GTA V) adalah game aksi dan petualangan yang dikembangkan oleh Rockstar North dan di terbitkan oleh Rockstar Games. Game ini terbit pada tanggal 17 september 2013 untuk console Playstation 3 dan Xbox 360. Game ini adalah game kelima belas dari seluruh game GTA. Pengembang permainan ini, Rockstar Games membuat Grand Theft Auto V bisa dimainkan di PlayStation 4, Xbox One, dan juga di PC.Grand Theft Auto V berlatar belakang negara bagian fiktif di Amerika Serikat yakni San Andreas (Di dunia nyata California Selatan). Sebelumnya San Andreas telah menjadi tempat berlatarnya Grand Theft Auto: San Andreas.",
            "PlayerUnknown's Battlegrounds (sering disingkat PUBG) adalah sebuah permainan dengan genre battle royale, yang para pemainnya bisa bermain dengan 100 orang sekaligus secara daring. Di dalam permainan ini pemain bisa bermain solo, tim 2 orang, dan tim 4 orang, serta bisa mengundang teman untuk bergabung ke dalam permainan sebagai tim.",
            "Battlefield V adalah game video penembak orang pertama yang dikembangkan oleh EA DICE dan diterbitkan oleh Electronic Arts. Battlefield V adalah angsuran keenam belas dalam seri Battlefield. Itu dirilis di seluruh dunia untuk Microsoft Windows, PlayStation 4, dan Xbox One pada 20 November 2018. Mereka yang memesan di muka Edisi Deluxe dari permainan diberikan akses awal ke permainan pada 15 November 2018, [2] dan Origin Access Pelanggan premium di PC menerima akses ke game pada 9 November 2018. [3] Permainan ini didasarkan pada Perang Dunia II dan merupakan kelanjutan tematik dari prekursornya yang berbasiskan Perang Dunia I Battlefield 1.",
            "Counter Strike: Global Offensive adalah game dengan mode FPS (First-Person Shooting) yang dikembangkan oleh Valve Corporation dan Hidden Path Entertainment. Kedua perusahaan ini juga merupakan perusahaan yang mengembangkan Counter Strike: Source. Counter Strike: GO merupakan permainan keempat di dalam waralaba Counter Strike, tidak termasuk Counter Strike Neo dan Online. Counter Strike Global Offensive dirilis pada tanggal 21 Agustus, 2012 dan dapat dimainkan pada Microsoft Windows, OS X, Xbox Live Arcade dan Playstation Network versi Amerika.",
            "Overwatch adalah penembak orang pertama multiplayer berbasis tim yang dikembangkan dan diterbitkan oleh Blizzard Entertainment. Digambarkan sebagai \"penembak pahlawan\", Overwatch menetapkan pemain menjadi dua tim yang terdiri dari enam, dengan masing-masing pemain memilih dari daftar lebih dari 30 karakter, yang dikenal sebagai \"pahlawan\", masing-masing dengan gaya permainan yang unik yang dibagi menjadi tiga peran umum yang sesuai dengan tujuan mereka. Pemain dalam tim bekerja bersama untuk mengamankan dan mempertahankan titik kontrol pada peta atau mengawal muatan di seluruh peta dalam waktu terbatas..",
            "Paladins adalah permainan tembak-menembak orang-pertama (First-person Shooter) yang dikembangkan oleh Hi-Rez Studios. Paladins dibuat dengan tema fiksi ilmiah dan pengaturan fantasi Champions yang penuh warna. Setiap Champions memiliki cara menembak yang unik dan sesuai kemampuan mereka sendiri. Pertempuran di Paladins berbasis tembak menembak antar regu. Di dalam game pemain bisa menyusun kumpulan kartu untuk menambah kemampuan champions.[1]",
            "Red Dead Redemption 2 adalah game aksi-petualangan 2018 yang dikembangkan dan diterbitkan oleh Rockstar Games. Gim ini adalah entri ketiga dalam seri Red Dead dan merupakan prekuel dari game Red Dead Redemption 2010. Kisah ini berlatar tahun 1899 dalam representasi fiksi dari Barat, Midwestern, dan Amerika Serikat Selatan dan mengikuti pelanggar hukum Arthur Morgan, anggota geng Van der Linde. Arthur harus berurusan dengan penurunan Wild West sementara berusaha untuk bertahan melawan pasukan pemerintah, geng saingan, dan musuh lainnya. Cerita ini juga mengikuti sesama anggota geng John Marston, protagonis dari Red Dead Redemption.",
            "Resident Evil 3 adalah permainan video horor sintasan yang dikembangkan dan diterbitkan oleh Capcom. Permainan ini adalah buatan ulang dari permainan Resident Evil 2 tahun 1998. Pemain bermain sebagai perwira polisi junior bernama Leon S. Kennedy dan seorang mahasiswa Claire Redfield ketika mereka berusaha melarikan diri dari Kota Raccoon selama kiamat zombi. Permainan ini dirilis di seluruh dunia untuk PlayStation 4, Windows, dan Xbox One pada 25 Januari 2019. Banyak kritikus yang memuji permainan ini dalam segi presentasi, ara bermain, dan kesamaan dengan versi aslinya.",
            "Point Blank adalah sebuah permainan komputer ber-genre FPS yang dimainkan secara online. Permainan ini dikembangkan oleh Zepetto dari Korea Selatan dan dipublikasikan oleh Zepetto. Selain di Korea Selatan, permainan ini mempunyai server sendiri di beberapa negara seperti Thailand, Rusia, Indonesia, Brasil, Turki, Amerika Serikat, dan Peru. Di Indonesia, permainan ini sekarang telah dikelola oleh Zepetto.Point Blank berkisah tentang perseteruan antara Free Rebels dan pemerintah yang dalam hal ini adalah Counter Terrorist Force (CT-Force).",
            "War Thunder adalah gim video multiplayer kendaraan tempur gratis yang dikembangkan dan diterbitkan oleh studio Gaijin Entertainment, studio Moskow di Eropa. Diumumkan pada 2011, ini pertama kali dirilis pada November 2012 sebagai Open Beta dengan rilis di seluruh dunia pada Januari 2013; itu memiliki rilis resminya pada 21 Desember 2016. [13] [12] Ini memiliki format lintas platform untuk Microsoft Windows, Linux, PlayStation 4, Xbox One, dan Shield Android TV.Dikembangkan sebagai permainan simulasi terbang, ia sebelumnya bernama World of Planes tetapi karena kemiripannya dengan World of Warplanes milik Wargaming.",
            "World War Z adalah permainan video tembak-menembak orang ketiga yang dikembangkan oleh Saber Interactive serta diterbitkan oleh Focus Home Interactive dan Mad Dog Games LLC. Permainan ini didasarkan pada buku tahun 2006 dengan nama yang sama, dan berlatar di semesta yang sama dengan adaptasi film 2013.Permainan ini diumumkan pada Desember 2017 sebagai permainan kooperasi empat orang di The Game Awards.[8] Permainan ini terinspirasi pada film World War Z 2013, dengan gaya bermain yang menampilkan pertarungan tembak menembak orang ketiga kooperatif dari perpektif bahu untuk melawan zombie dengan perangkap defensif",
            "Star Wars Jedi: Fallen Order adalah game aksi-petualangan yang dikembangkan oleh Respawn Entertainment dan diterbitkan oleh Electronic Arts. Ini dirilis untuk Windows, PlayStation 4, dan Xbox One pada 15 November 2019. Permainan ini diatur dalam semesta Star Wars, lima tahun setelah film Star Wars: Episode III - Revenge of the Sith dan 14 tahun sebelum Star Wars: Episode IV - Sebuah Harapan Baru, dan mengikuti seorang Jedi Padawan muda bernama Cal Kestis saat ia diburu melalui galaksi oleh Kekaisaran Galactic, sambil mencoba untuk menyelesaikan pelatihan Jedi-nya dan memulihkan Jedi Order yang sekarang musnah.",




    };

    private static String[] hargaGame = {
            "Rp. 800.000",
            "Rp. 200.000",
            "Rp. 450.000",
            "FREE GAME ON STEAM",
            "Rp. 350.000",
            "FREE GAME ON STEAM",
            "Rp. 700.000",
            "Rp. 300.000",
            "Rp. 200.000",
            "FREE GAME ON STEAM",
            "FREE GAME ON STEAM",
            "Rp. 400.000",

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
