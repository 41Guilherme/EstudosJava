package carbono;

public class Casa implements EmissorCarbono{

    private double energiaEletrica_mes;
    private int botijao_mes;
    
    public Casa(double energiaEletrica_mes, int botijao_mes) {
        this.energiaEletrica_mes = energiaEletrica_mes;
        this.botijao_mes = botijao_mes;
    }

    @Override
    public double getCarbonoEmitido() {
        double result = (energiaEletrica_mes * 0.0009) + (botijao_mes * 0.0353) ;
        return result;
    }

    public double getEnergiaEletrica_mes() {
        return energiaEletrica_mes;
    }

    public void setEnergiaEletrica_mes(double energiaEletrica_mes) {
        this.energiaEletrica_mes = energiaEletrica_mes;
    }

    public double getBotijao_mes() {
        return botijao_mes;
    }

    public void setBotijao_mes(int botijao_mes) {
        this.botijao_mes = botijao_mes;
    }
}
