public class MataKuliah24 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah24() {
    }
    public MataKuliah24(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS Telah Diubah:" + sks);
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam Telah Ditambah:" + jumlahJam);
    }
    void kurangiJam(int jam) {
        jumlahJam -= jam;
        if(jumlahJam <= jumlahJam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah Jam Berkurang Menjadi: " + jumlahJam);
            } else {
                System.out.println("Pengurangan gagal. Jam yang tersisa tidak cukup.");
        }
    }
}
