public class titikKoordinat {
    public static void main(String[] args) {
        int[][] Koordinat = {{11,13},{17,19},{23,29},{31,37}} ;
        int indeks, jumlahX = 0, jumlahY = 0;
        double rataX,rataY;
        for (indeks = 0; indeks < Koordinat.length; indeks++) {
            System.out.println("Koordinat indeks ke-1 : ("+Koordinat[indeks][0]+","+Koordinat[indeks][1]+")");
            jumlahX += Koordinat[indeks][0];
            jumlahY += Koordinat[indeks][1];
        }
        rataX = (double) jumlahX/Koordinat.length;
        rataY = (double) jumlahY/Koordinat.length;
        System.out.println("Titik tengah ("+rataX+","+rataY+")");

    }
}
