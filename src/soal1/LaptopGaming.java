package soal1;

/**
 * Merepresentasikan Laptop Gaming yang memiliki spesifikasi kartu grafis khusus dan tambahan garansi.
 */
public class LaptopGaming extends Laptop {
    private String kartuGrafis;
    private static final int TAMBAHAN_GARANSI = 6;

    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis) {
        super(merek, harga, garansiBulan + TAMBAHAN_GARANSI, ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + kartuGrafis;
    }
}
