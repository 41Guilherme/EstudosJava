package carbono;

public class Bicicleta implements EmissorCarbono {

    private double distancia;

    
    public Bicicleta(double distancia) {
        this.setDistancia(distancia);
    }


    public double getDistancia() {
        return distancia;
    }


    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


    @Override
    public double getCarbonoEmitido() {
    
        return 0;
    }


    @Override
    public String toString() {
        return "Bicicleta [distancia=" + distancia + "]";
    }
    
}
