package ads.poo;

public class Cilindro {
    private Retangulo baseCilindro;
    private double alturaCilindro;

    public Cilindro (Retangulo base, double alturaCilindro) {
        this.alturaCilindro = 0;
        this.baseCilindro = new Retangulo();
        setAlturaCilindro(alturaCilindro);
        setBaseCilindro(base);
    }

    public Cilindro (double alturaCilindro) {
        this(new Retangulo(), alturaCilindro);
    }

    public Cilindro () {
        this(new Retangulo(), 0);
    }

    public Retangulo getBaseCilindro() {
        return baseCilindro;
    }

    public double getAlturaCilindro() {
        return alturaCilindro;
    }

    public void setBaseCilindro(Retangulo baseCilindro) {
        this.baseCilindro = baseCilindro;
    }

    public void setAlturaCilindro(double alturaCilindro) {
        if (alturaCilindro < 0) {
            alturaCilindro = 0;
        }
        this.alturaCilindro = alturaCilindro;
    }

    public double calcularVolume () {
        return baseCilindro.calculaArea() * alturaCilindro;
    }

    @Override
    public String toString() {
        return "\nbaseCilindro: " + baseCilindro + "\nAlturaCilindro: " + alturaCilindro;
    }
}
