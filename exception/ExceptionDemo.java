package exception;

// File: ExceptionDemo.java
public class ExceptionDemo {
    public static void main(String[] args) {
        // Jenis-jenis Exception
        try {
            // Unchecked Exception (ArithmeticException)
            int hasil = 10 / 0;
            System.out.println("Hasil: " + hasil);

        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }

        try {
            // Unchecked Exception (NullPointerException)
            String teks = null;
            System.out.println(teks.length());

        } catch (NullPointerException e) {
            System.out.println("Error: Anda mencoba akses data null");
        }

        try {
            // Checked Exception (File IO) + throw & throws
            ExceptionUtil.bacaData("");

        } catch (java.io.IOException e) {
            System.out.println("IOException tertangkap: " + e.getMessage());

        } finally {
            // finally akan selalu dieksekusi
            System.out.println("Blok finally dieksekusi (selalu jalan).");
        }

        System.out.println("Program tetap berjalan setelah Exception Handling.");
    }
}
