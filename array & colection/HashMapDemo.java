import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Membuat HashMap dengan key = String, value = Integer
        HashMap<String, Integer> nilaiMahasiswa = new HashMap<>();

        // Menambahkan data ke HashMap
        nilaiMahasiswa.put("Naiefah", 85);
        nilaiMahasiswa.put("Syalfian", 90);
        nilaiMahasiswa.put("Fawwaztiyani", 78);

        // Mengakses data berdasarkan key
        System.out.println("Nilai Naiefah: " + nilaiMahasiswa.get("Naiefah"));

        // Menampilkan semua key dan value
        System.out.println("Daftar Nilai Mahasiswa:");
        for (String nama : nilaiMahasiswa.keySet()) {
            System.out.println(nama + " -> " + nilaiMahasiswa.get(nama));
        }

        // Menghapus data
        nilaiMahasiswa.remove("Syalfian");
        System.out.println("\nSetelah menghapus Syalfian:");
        System.out.println(nilaiMahasiswa);
    }
}