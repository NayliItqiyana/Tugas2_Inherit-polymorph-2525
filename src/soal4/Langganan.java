package soal4;

public class Langganan extends ProdukDigital {
    private int durasiBulan;
    private static final int BATAS_BULAN_DISKON = 12;
    private static final double DISKON_LANGGANAN = 0.20;

    public Langganan(String kode, String nama, double hargaDasar, double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        this.durasiBulan = durasiBulan;
    }

    @Override
    public double hitungHargaAkhir() {
        double totalSub = hargaDasar * durasiBulan;
        if (durasiBulan >= BATAS_BULAN_DISKON) {
            return totalSub - (totalSub * DISKON_LANGGANAN);
        }
        return totalSub;
    }

    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}
