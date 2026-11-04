package soal1;

/**
 * Merepresentasikan perangkat elektronik dasar dengan atribut merek, harga, dan garansi.
 */
public class Perangkat {
    private String merek;
    protected double harga;
    private int garansiBulan;

    private static final double TARIF_PAJAK = 0.10;

    /**
     * Constructor untuk inisialisasi Perangkat.
     * 
     * @param merek         merek perangkat
     * @param harga         harga perangkat
     * @param garansiBulan  lama garansi dalam bulan
     * @throws IllegalArgumentException jika harga negatif atau merek kosong
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong.");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif.");
        }
        this.merek = merek;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    /**
     * Mendapatkan merek perangkat.
     * @return merek perangkat
     */
    public String getMerek() {
        return merek;
    }

    /**
     * Mendapatkan durasi garansi dalam bulan.
     * @return garansi dalam bulan
     */
    public int getGaransiBulan() {
        return garansiBulan;
    }

    /**
     * Menghitung pajak perangkat berdasarkan tarif pajak.
     * @return jumlah pajak
     */
    public double hitungPajak() {
        return harga * TARIF_PAJAK;
    }

    /**
     * Menampilkan informasi singkat perangkat.
     * @return string informasi singkat
     */
    public String infoSingkat() {
        return merek + " | garansi " + garansiBulan + " bulan";
    }
}
