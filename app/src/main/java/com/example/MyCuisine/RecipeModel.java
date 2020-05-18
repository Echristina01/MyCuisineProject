package com.example.MyCuisine;

public class RecipeModel {
    private int id;
    private String title, ingredients, tutorial;
    private String[][] recipeData = {
            {"Omelet Ayam",
                    "3 butir telur (kocok)\n" +
                    "Garam dan merica secukupnya\n" +
                    "1 sdm minyak goreng\n" +
                    "1/3 mangkok ayam suwir\n" +
                    "2 sdm keju parut\n" +
                    "2 sdm bayam cincang",
                    "1. Kocok telur dengan garam dan merica.\n" +
                            "2. Panaskan 1 sdm minyak goreng di dalam teflon, ratakan minyak hingga melapisi seluruh bagian dari teflon.\n" +
                            "3. Tuangkan telur ke dalam wajan dan kecilkan api, ratakan telur hingga benar-benar melapisi bagian teflon.\n" +
                            "4. Biarkan omelet hingga agak matang, ingatlah untuk mengecilkan api agar tidak terlalu cokelat.\n" +
                            "5. Masukkan ayam suwir dan keju ke setengah sisi telur.\n" +
                            "6. Lalu lipat sisi bagian telur ke permukaan ayam suwir.\n" +
                            "7.Sajikan\n"},


            {"Semprit Jadul",
                    "250 gram tepung maizena\n" +
                    "60 gram tepung terigu\n" +
                    "125 gram margarin\n" +
                    "100 gram roombutter\n" +
                    "75 gram gula halus",
                    "1. Campurkan semua bahan hingga tercampur rata. Uleni sebentar.\n" +
                            "2. Jika sudah tidak lengket cetak dengan spuit atau cetak sesuai selera.\n" +
                            "3. Panaskan oven dan panggang kurang lebih selama 30 menit atau hingga kue matang dan keras.\n" +
                            "4. Jika tak punya oven, nyalakan kompor, alasi dengan angsang atau sarangan dandan, cetak di atas teflon dan panggang hingga matang atau kecokelatan bagian bawahnya. Jangan lupa tutup teflon agar matang merata.\n" +
                            "5. Sajikan.\n"},

            {"Ayam Kung Pao", "\n" +
                    "300 g daging paha ayam tanpa tulang, potong dadu 2 cm\n" +
                    "1 sdm merica Szechuan kering\n" +
                    "6 buah cabai merah kering\n" +
                    "50 g kacang tanah, sangrai\n" +
                    "4 siung bawang putih, cincang halus\n" +
                    "1 ruas jahe, parut atau cincang halus\n" +
                    "1.5 sdt Kaldu Ayam\n" +
                    "2 batang daun bawang, iris\n" +
                    "3 sdm minyak, untuk menumis\n" +
                    "1.5 sdm tepung maizena\n" +
                    "1 sdm Bango Kecap Manis\n" +
                    "1 sdm madu\n" +
                    "1 sdm saus hoisin\n" +
                    "1 sdt minyak wijen\n" +
                    "2 sdt gula pasir\n" +
                    "½ sdm cuka",
                    "1. Di dalam mangkuk, aduk rata ayam dan bumbu perendam. Diamkan selama 15 menit.\n" +
                            "2. Panaskan minyak di dalam wajan di atas api sedang. Masukkan merica Szechuan dan cabai kering, tumis hingga harum.\n" +
                            "3. Masukkan bawang putih dan jahe, tumis hingga harum. Masukkan ayam yang telah dibumbui, masak hingga berubah warna.\n" +
                            "4. Tambahkan saus dan Royco Kaldu Ayam, aduk rata. Masak hingga mengental.\n" +
                            "5. Masukkan kacang yang telah disangrai dan daun bawang, aduk rata. Angkat.\n"},

            {"Bibimbap", "1 centong nasi hangat /secukupnya sesuai porsi perut\n" +
                    "2 biji sosis sapi\n" +
                    "wortel dipotong korek api\n" +
                    "timun dipotong korek api\n" +
                    "1 telur\n" +
                    "bumbu :\n" +
                    "1 siung bawang merah\n" +
                    "1 siung bawang putih\n" +
                    "kecap manis\n" +
                    "saus sambal\n" +
                    "saus tiram\n" +
                    "bumbu gochujang",
                    " 1. Siapkan nasi hangat dimangkuk\n" +
                            " 2. Tumis bawang merah dan putih masukan wortel, timun, dan sosis (kalau ingin cantik tumisnya satu satu) masukan garam dan pecin sesuai selera, untuk menambah rasa masukan saus tiram. setelah selesai tata rapi diatas nasi hangat.\n" +
                            " 3. Masukan bumbu gochujang ke atas nasi yang sudah diberi tumis wortel, timun dan sosis. kalau tak ada ada alternatif lain yaitu : 2 sendok saus sambal pedas dicampur boncabe level 30, kecap asin.\n" +
                            " 4. Langkah terakhir buat telur ceplok sesuai selera bisa matang atau setengah matang, disini aku bikin telur ceplok matang.\n" +
                            " 5. Langkah terakhir kita makan dengan cara mengaduk bibimbap sederhana agar bumbunya tercampur rata.\n"},

            {"Dimsum Rumahan", "\n" +
                    "\n" +
                    "Bahan-bahan\n" +
                    "\n" +
                    "kulit pangsit (yg sudah jadi saja, supaya tdk bikin lagi)\n" +
                    "dada ayam fillet (digiling / dihaluskan)\n" +
                    "secukupnya tepung tapioka\n" +
                    "2 butir bawang putih\n" +
                    "Garam, gula, lada bubuk\n" +
                    "saus tiram\n" +
                    "kecap asin\n" +
                    "1 sdt minyak\n" +
                    "daun bawang",
                    "1. Blender ayam dan bawang putih hingga halus\n" +
                            "2. Masukan ke ayam & bawang yg sdh dihaluskan ke dalam wadah. Kemudian, masukan tepung tapioka gula, garam, lada bubuk, minyak, dan irisan daun bawang dgn takaran secukupnya & seselera.\n" +
                            "3. Aduk-aduk hingga kalis.\n" +
                            "4. Masukan adonan ke dalam pangsit. Kemudian, taburi irisan wortel di atas dimsum.\n" +
                            "5. Panaskan air utk dikukus ke dalam panci. Jgn lupa oles minyak agar tdk lengket. Tunggu hingga matang sekitar 20 - 30 menit. Dimsum siap disajikan.\n"},

            {"Rawon", "500 gram daging sandung lamur sapi\n" +
                    "1 dengkul sapi, belah dua\n" +
                    "3 lembar daun jeruk purut segar\n" +
                    "1 batang serai, memarkan\n" +
                    "1 sdm air asam jawa\n" +
                    "2 batang daun bawang, iris seukuran 1 cm\n" +
                    "3 bungkus Royco Kaldu Sapi\n" +
                    "3 liter air\n" +
                    "5 sdm minyak goreng\n" +
                    "\n" +
                    "Bumbu halus\n" +
                    "\n" +
                    "4 siung bawang putih\n" +
                    "8 butir bawang merah\n" +
                    "5 buah keluak, geprek dan rendam isinya dengan air panas\n" +
                    "4 butir kemiri, sangrai\n" +
                    "1 cm kunyit, bakar",
                    "1. Rebus daging dan dengkul sapi hingga setengah lunak. Potong daging sesuai selera. Sisihkan.\n" +
                            "2. Masukkan Royco Kaldu Sapi ke dalam air rebusan daging.\n" +
                            "3. Tumis bumbu halus, lengkuas, daun jeruk, dan serai hingga harum dan matang.\n" +
                            "4. Masukkan potongan daging ke dalam tumisan, masak hingga bumbu meresap.\n" +
                            "5. Masukkan tumisan daging ke dalam kuah kaldu. Masak dengan api kecil hingga daging empuk.\n"},

            {"Soto Lamongan", "\n" +
                    "Bahan\n" +
                    "\n" +
                    "1/2 kg Ayam\n" +
                    "8 siung Bawang merah\n" +
                    "8 siung bawang putih\n" +
                    "6 kemiri\n" +
                    "6 cm kunyit\n" +
                    "6 cm jahe\n" +
                    "1 ruas lengkuas\n" +
                    "4 lembar daun jeruk\n" +
                    "3 lembar daun salam\n" +
                    "2 batang serai\n" +
                    "1 sendok makan ketumbar\n" +
                    "1/2 sendok makan lada\n" +
                    "1/2 sdt Gula\n" +
                    "1/2 sdt Garam\n" +
                    "secukupnya Micin\n" +
                    "1 bungkus Masako ayam\n" +
                    "Kol. Bihun, bawang putih goreng, telor rebus, daun sop daun bawang, tomat, jeruk nipis",
                    "1. Rebus ayam dengan 2 liter air, masukan jahe geprek, lengkuas geprek, 2 batang serai, daun jeruk dan daun salam\n" +
                            "\n" +
                            "2. Rebus sampai ayam empuk\n" +
                            "\n" +
                            "3. Bakar kunyit. Dan sangrai kemiri\n" +
                            "\n" +
                            "4. Haluskan dua bawang. Merica, ketumbar, kemiri dan kunyit\n" +
                            "\n" +
                            "5. Tumis di minyak secukupnya hingga harum. Tmbh air sedkit biar gak gosong\n" +
                            "\n" +
                            "6. Keluarkan ayam yang di rebus, air rebusan digunakan untuk kuah soto nya\n" +
                            "\n" +
                            "7. Bumbu yang sudah di tumis masukan kedalam air rebusan.. tambahkan micin, garam, dan gula + masako rasa ayam. Koreksi rasa\n" +
                            "\n" +
                            "8. Tambahkan pelengkap kol dan sayur lainnya\n" +
                            "\n" +
                    "9. Ayam yang udah di angkat tadi di suir2 terus di goreng sebentar. Boleh juga di kuah dikasih tulang-tulangnya.\n" +
                            "\n" +
                            "10. Jangan lupa goreng bawang putih untuk taburan d atasnya\n" +
                            "\n" +
                            "11. Selesai, jangan lupa beri perasan jeruk nipis\n"},

            {"Nastar", "\n" +
                    "Bahan isi:\n" +
                    "Bahan:\n" +
                    "100 gr BOS (butter oil substitute)\n" +
                    "300 gr Margarin\n" +
                    "75 gr Gula halus\n" +
                    "3 butir Kuning telur\n" +
                    "100 gr susu bubuk\n" +
                    "75 gr tepung pati jagung\n" +
                    "500 gr tepung terigu\n" +
                    "1-2 butir kuning telur untuk olesan\n" +
                    "\n" +
                    "Selai Nanas:\n" +
                    "300 gr nanas bersih\n" +
                    "300 gr gula putih\n" +
                    "100 ml air\n" +
                    "5 cm kayu manis\n" +
                    "7 buah Cengkeh\n",
                    "\n" +
                            "1. Campur BOS, margarin dan gula halus dengan menggunakan mixer hingga tercampur.\n" +
                            "2. Tambahkan kuning telur lalu mixer kembali hingga tercampur.\n" +
                            "3. Masukkan tepung terigu, susu bubuk dan tepung pati jagung, aduk menggunakan spatula hingga semua tercampur rata dan dapat dibentuk.\n" +
                            "4. Setelah dibentuk jangan lupa olesi kuning telur dan masukkan ke dalam oven selama 25 menit.\n" +
                            "5. Sajikan\n"},

            {"Cah Pakis", "\n" +
                    "Bahan\n" +
                    "- 1 ikat pakis\n" +
                    "- segenggam ikan teri/ebi\n" +
                    "- garam dan penyedap jamur secukupnya\n" +
                    "\n" +
                    "Bumbu halus:\n" +
                    "- bawang merah\n" +
                    "- bawang putih\n" +
                    "- kemiri\n" +
                    "- cabai merah\n" +
                    "- sedikit terasi.",
                    "1. Tumis bumbu halus, masukkan ikan teri/ebi, aduk rata.\n" +
                            "2. Masukkan pakis, aduk rata lagi.\n" +
                            "3. Tuang air, beri garam dan penyedap jamur. Aduk-aduk.\n" +
                            "4. Tunggu sampai air menyusut.\n"},

            {"Rainbow Salad", "\n" +
                    "Bahan:\n" +
                    "- dada ayam kampung\n" +
                    "- 1/2 bawang bombay\n" +
                    "- 1/2 paprika merah sedang\n" +
                    "- 1/2 paprika hijau sedang\n" +
                    "- 1 sdt sea salt\n" +
                    "- 1 sdt paprika bubuk\n" +
                    "- 1 sdt lada bubuk\n" +
                    "- 1 sdt cabai bubuk\n" +
                    "- 1 sdm bawang putih bubuk\n" +
                    "- 1 sdt bubuk jinten\n" +
                    "\n" +
                    "Bahan dressing:\n" +
                    "- 3 sdm air jeruk nipis\n" +
                    "- 3 sdm extra virgin olive oil\n" +
                    "- 1 sdm bubuk cabai kasar\n" +
                    "- 1 sdt gula aren bubuk\n" +
                    "- sejumput garam",
                    "1. Masak semua bahan kecuali ayam masak sampai layu. Angkat dan sisihkan.\n" +
                            "2. Masak ayam sampai sampai matang.\n" +
                            "3. Tata selada atau sayur lain di piring saji.\n" +
                            "4. Taruh semua bahan jadi satu, tuang dressing."}
    };

    public RecipeModel(int id) {
        this.id = id;
        this.title = this.recipeData[id][0];
        this.ingredients = this.recipeData[id][1];
        this.tutorial = this.recipeData[id][2];
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getTutorial() {
        return tutorial;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }
}
