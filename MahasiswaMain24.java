public class MahasiswaMain24 {
    public static void main(String[] args) {
        Mahasiswa24 mhsVinda = new Mahasiswa24("Vinda Yunita Sari", "244107060036", 3.76, "SIB 1C");

        mhsVinda.tampilkanInformasi();
        mhsVinda.ubahKelas("SIB 1Z");
        mhsVinda.updateIpk(4.00);
        mhsVinda.tampilkanInformasi();
    }
}