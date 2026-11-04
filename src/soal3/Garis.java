package soal3;

/**
 * Merepresentasikan Garis yang disusun dari dua objek Titik (Composition / Has-A).
 */
public class Garis {
    private Titik awal;
    private Titik akhir;

    public Garis(Titik awal, Titik akhir) {
        // Defensive Copy untuk mencegah aliasing dari luar
        this.awal = new Titik(awal);
        this.akhir = new Titik(akhir);
    }

    // Overloading constructor menerima koordinat langsung
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    public Titik getAwal() { return new Titik(awal); }
    public void setAwal(Titik awal) { this.awal = new Titik(awal); }

    public Titik getAkhir() { return new Titik(akhir); }
    public void setAkhir(Titik akhir) { this.akhir = new Titik(akhir); }

    /**
     * Menghitung panjang garis dengan memanggil method jarakKe milik Titik.
     */
    public double getPanjang() {
        return awal.jarakKe(akhir);
    }

    @Override
    public String toString() {
        return awal + "-" + akhir;
    }
}
