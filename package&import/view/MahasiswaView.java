package view;

import model.Mahasiswa;

public class MahasiswaView {
    
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa (); {
        mahasiswa.ipk = 3.8;
        
        System.out.println("Data Mahasiswa:");
        System.out.println("IPK: " + mahasiswa.ipk);
        }
            
    }
}
