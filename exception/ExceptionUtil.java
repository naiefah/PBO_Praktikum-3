package exception;

public class ExceptionUtil {

    // Method dengan throws (Checked Exception)
    public static void bacaData(String file) throws java.io.IOException {
        if (file == null || file.isEmpty()) {
            throw new java.io.IOException("Nama file tidak boleh kosong!"); // throw
        }
        System.out.println("Membaca data dari file: " + file);
    }
}
