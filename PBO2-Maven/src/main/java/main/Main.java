
package main;

import model.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("282828","satu",1,20);
//        mahasiswa.read();
//        mahasiswa.create();
//        mahasiswa.setNpm("18630983");
//        mahasiswa.delete();
//        mahasiswa.setNama("tututu");
//        mahasiswa.setIPK(5);
//        mahasiswa.setJumlahMataKuliah(10);
//        mahasiswa.update();

        MahasiswaInputFrame mahasiswaInputFrame = new MahasiswaInputFrame(mahasiswa);
        mahasiswaInputFrame.setLocationRelativeTo(null);
        mahasiswaInputFrame.setVisible(true);
    }
}
