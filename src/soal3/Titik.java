package soal3;

/**
 * Merepresentasikan titik koordinat (x, y) dalam bidang 2D.
 */
public class Titik {
    private double x;
    private double y;

    public Titik() {
        this(0, 0);
    }

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor untuk Defensive Copy
    public Titik(Titik titikLain) {
        this.x = titikLain.x;
        this.y = titikLain.y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    /**
     * Menghitung jarak antara titik ini dengan titik lainnya.
     */
    public double jarakKe(Titik lain) {
        double dx = this.x - lain.x;
        double dy = this.y - lain.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
