package forms;

public class TestForma {
    
    public static void Test() {
        Paralelogramo f1 = new Paralelogramo(4,1.4142,1,0.7854);
        Paralelogramo f2 = new Retangulo(3, 2, 2, 0);
        Paralelogramo f3 = new Quadrado(1, 1, 1, 0);

        System.out.println(f1);
        System.out.println("Area: "+f1.calculaArea());
        System.out.println("Perimetro: "+ f1.calculaPerimetro());
        System.out.println(f2);
        System.out.println("Area: "+f2.calculaArea());
        System.out.println("Perimetro: "+ f2.calculaPerimetro());
        System.out.println(f3);
        System.out.println("Area: "+f3.calculaArea());
        System.out.println("Perimetro: "+ f3.calculaPerimetro());
    }

}
