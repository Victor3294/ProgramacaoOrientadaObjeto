package ads.poo;

public class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo (double base, double altura) {
        this.base = 0;
        this.altura = 0;
        setBase(base);
        setAltura(altura);
    }

    public Retangulo (double base) {
        this(base, 0);
    }

    public Retangulo () {
        this(0, 0);
    }

    public double getBase () {
        return this.base;
    }

    public double getAltura () {
        return this.altura;
    }

    public void setBase (double base) {
        if (base < 0) {
            base = 0;
        }
        this.base = base;
    }

    public void setAltura (double altura) {
        if (altura < 0) {
            altura = 0;
        }
        this.altura = altura;
    }

    public double calculaArea(){
        return this.base * this.altura;
    }

    public double calculaPerimetro() {
        return 2 * (this.base + this.altura);
    }

    @Override
    public String toString() {
        return "Base: " + this.base + "\nAltura:" + this.altura;
    }
}
