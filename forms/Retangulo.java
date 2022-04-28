package forms;

public class Retangulo extends Paralelogramo{

    public Retangulo(double a, double b, double h, double omega) {
        super(a, b, h , omega);
        this.h = b;
        this.omega = 1.5708;
    }

    @Override
    public double calculaArea() {
        return b * a;
    }

    @Override
    public double calculaPerimetro() {
        return b + b + a + a;
    }

    @Override
    public String toString() {
        return "Retangulo [Lado1: " +a + " Lado2: "+ b + " Angulo: " + omega+"]";
    }

   

    
}
