package carbono;

public class Carro implements EmissorCarbono{

    private int quantidadePessoas;
    private String tipoMotor;
    private double distancia;
    private boolean gasolina;
    private boolean alcool;

    public Carro(int quantidadePessoas, String tipoMotor, 
            double distancia, 
            boolean gasolina,
            boolean alcool) {

        this.quantidadePessoas = quantidadePessoas;
        this.tipoMotor = tipoMotor;
        this.distancia = distancia;
        this.gasolina = gasolina;
        this.alcool = alcool;
    }

    @Override
    public double getCarbonoEmitido() {
    
        return 0;
    }

    @Override
    public String toString() {
        return "Carro [alcool=" + alcool + ", distancia=" + distancia + ", gasolina=" + gasolina
                + ", quantidadePessoas=" + quantidadePessoas + ", tipoMotor=" + tipoMotor + "]";
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public boolean isGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }

    public boolean isAlcool() {
        return alcool;
    }

    public void setAlcool(boolean alcool) {
        this.alcool = alcool;
    }


}
