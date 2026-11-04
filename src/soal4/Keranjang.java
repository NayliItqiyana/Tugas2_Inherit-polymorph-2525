package soal4;

import java.util.ArrayList;

public class Keranjang {
    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    public void tambah(Produk produk) {
        for (Produk p : daftarProduk) {
            if (p.getKode().equalsIgnoreCase(produk.getKode())) {
                throw new IllegalStateException("Produk dengan kode " + produk.getKode() + " sudah ada di keranjang.");
            }
        }
        daftarProduk.add(produk);
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.hitungHargaAkhir();
        }
        return total;
    }

    public void cetakStruk() {
        for (Produk p : daftarProduk) {
            System.out.printf("%s | %s | %s | Rp%.0f%n", p.getKode(), p.getNama(), p.deskripsi(), p.hitungHargaAkhir());
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    public void hitungPerJenis() {
        int fisik = 0, digital = 0, langganan = 0;
        for (Produk p : daftarProduk) {
            // Urutan pengecekan penting karena Langganan adalah turunan ProdukDigital
            if (p instanceof Langganan) {
                langganan++;
            } else if (p instanceof ProdukDigital) {
                digital++;
            } else if (p instanceof ProdukFisik) {
                fisik++;
            }
        }
        System.out.printf("Fisik: %d, Digital: %d, Langganan: %d%n", fisik, digital, langganan);
    }
}
