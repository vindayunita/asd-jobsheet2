public  class MataKuliahMain24 {
    public static void main(String[] args) {
        MataKuliah24 mk1 = new MataKuliah24();
        mk1.kodeMK = "MK01";
        mk1.nama = "MTK";
        mk1.sks = 2;
        mk1.jumlahJam = 40;

        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(5);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah24 mk2 = new MataKuliah24("MK02", "BIN", 3, 35);
        
        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(2);
        mk2.kurangiJam(4);
        mk2.tampilInformasi();
    }
}