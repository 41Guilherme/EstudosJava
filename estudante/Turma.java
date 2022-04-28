package estudante;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    
    private List <Estudante> estudantes;
    private double mediaNotaTurma;


    public Turma(List<Estudante> estudantes) {
        this.setEstudantes(estudantes);
        this.calcularAtualizarMedia();
    }

    public void calcularAtualizarMedia(){
        double soma = 0;
        int quantidade = 0;
        for (Estudante estudante : estudantes){
            soma = soma + estudante.getNota();
            quantidade = quantidade + 1;
        }
        this.setMediaNotaTurma(soma / quantidade);
         
    }

    public Estudante estudanteComMaiorNota(){
        Estudante aux = new Estudante(0,"Auxiliar",0);
        
        for (Estudante estudante : estudantes){

            if (aux.compareTo(estudante) < 0){
                aux = estudante;
            }
        }

        return aux;
    }

    public List<Estudante>estudantesAprovados(){

        List<Estudante> lista = new ArrayList<Estudante>() ;

        for (Estudante estudante : estudantes) {
            
            if (estudante.getNota() > 5) {
                lista.add(estudante);
            }
        }
        return lista;
        
    }

    public void juntarTurma(Turma t){
        List<Estudante> aux = t.getEstudantes();

        for (Estudante estudante : aux) {
            estudantes.add(estudante);
        }
        this.calcularAtualizarMedia();
    
    }
    public double getMediaNotaTurma() {
        return mediaNotaTurma;
    }


    public void setMediaNotaTurma(double mediaNotaTurma) {
        this.mediaNotaTurma = mediaNotaTurma;
    }


    public List <Estudante> getEstudantes() {
        return estudantes;
    }


    public void setEstudantes(List <Estudante> estudantes) {
        this.estudantes = estudantes;
    }


    @Override
    public String toString() {
        return "Turma [estudantes=" + estudantes + ", mediaNotaTurma=" + mediaNotaTurma + "]";
    }


    
}
