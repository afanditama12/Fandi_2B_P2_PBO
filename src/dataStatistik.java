public class dataStatistik {
    public static void main(String[] args) {
        int[] DATA = {11,13,17,19,23,29,31,37};
        int jumlahData = 0, indeks;
        for (indeks = 0; indeks < DATA.length; indeks++) {
            System.out.println("DATA indeks ke-"+indeks+" = "+DATA[indeks]);
            jumlahData += DATA[indeks];
        }
        System.out.println("Jumlah Data = "+jumlahData);
        System.out.println("Banyak Data = "+DATA.length);

    }
}
