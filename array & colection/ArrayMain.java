public class ArrayMain {

    public static void main(String[] args) {
        //Cara 1
        // double nilai1 = 78.5;
        // double nilai2 = 77.0;
        // double nilai3 = 89.3;
        // double nilai4 = 24.84;
        // System.out.println(nilai3);
       
        //Cara 2
        String[] nama = {"Zahran", "Ravli", "Eva", "Bunga"};
        System.out.println(nama[3]);

        double[] daftarNilai = {78.5, 77.0, 89.3, 24.84};
        System.out.println(daftarNilai[1]);

        //Cara 3
        String[] daftarNama = new String[4];
        daftarNama[0] = "Zahran";
        daftarNama[1] = "Ravli";
        daftarNama[2] = "Eva";
        daftarNama[3] = "Bunga";
        System.out.println(daftarNama[2]);

        //gunakan cara 1 untuk menyimpan daftar nilai 
        //78.5, 77.0, 89.3, 24.84

    }
}    