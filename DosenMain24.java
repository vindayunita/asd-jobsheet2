public class DosenMain24 {
    public static void main(String[] args) {
        Dosen24 dsn1 = new Dosen24();
        dsn1.idDosen = "id01";
        dsn1.nama = "Clara Puspita";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 1945;
        dsn1.bidangKeahlian = "Critical Thinking";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        dsn1.hitungMasaKerja(1970);
        dsn1.ubahKeahlian("Kesenian");
        dsn1.tampilInformasi();

        Dosen24 dsn2 = new Dosen24("id02", "Cristanto Juyokususmo", false, 1900, "Matematika");

        dsn2.tampilInformasi();
        dsn2.setStatusAktif(false);
        dsn2.hitungMasaKerja(2000);
        dsn2.ubahKeahlian("Elektronika");
        dsn2.tampilInformasi();
        }
    }