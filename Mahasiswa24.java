public class Mahasiswa24 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa24() {
    }
    public Mahasiswa24(String nm, String nim, double ipk, String kls) {
        this.nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kls;
    }
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
    public void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 da 4.0");
        }
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        }else if (ipk >= 3.0) {
            return "Kinerja baik";
        }else if (ipk >= 2.0) {
            return "Kinerja cukup";
        }else {
            return "Kinerja kurang";
        }
    }
}
