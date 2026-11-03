package soal1;

/**
 * Merepresentasikan perangkat jenis Laptop yang mewarisi Perangkat.
 */
public class Laptop extends Perangkat {
    private int ramGb;
    private double ukuranLayarInci;

    /**
     * Constructor untuk Laptop.
     */
    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga setelah diskon promosi dengan memanfaatkan atribut protected 'harga'.
     * 
     * @param diskonPersen persentase diskon
     * @return harga setelah diskon
     */
    public double hitungHargaPromo(double diskonPersen) {
        return harga - (harga * (diskonPersen / 100.0));
    }

    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | RAM " + ramGb + " GB | layar " + ukuranLayarInci + " inci";
    }
}
