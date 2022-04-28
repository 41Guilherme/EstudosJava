package data;

public class Data{

    private int dia;
    private int mes;
    private int ano;


    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setAll(int dia, int mes , int ano){
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public int getDia() {
        return dia;
    }


    public void setDia(int dia) {
        this.dia = dia;
    }


    public int getMes() {
        return mes;
    }


    public void setMes(int mes) {
        this.mes = mes;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        String aux = String.format("%d/%d/%d",dia , mes, ano );
        return aux;
    }

    public void trocartCon(Data newConta){

        Data aux = new Data(dia, mes, ano);

        this.setAll(newConta.getDia(), newConta.getMes(), newConta.getAno());
        
        newConta.setAll(aux.getDia(),aux.getMes() ,aux.getAno() );
        
        aux = null;
    }
    
    
}