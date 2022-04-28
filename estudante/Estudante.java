package estudante;

public class Estudante implements Comparable<Estudante> {
    
    private int id;
    private String nome;
    private double nota;

    public Estudante(int id, String nome, double nota){
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudante [id=" + id + ", nome=" + nome + ", nota=" + nota + "]";
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Estudante aux) {
        if (nota > aux.getNota()) {
            return 1;
        } else if (nota == aux.getNota()) {
            return 0;
        } else {
            return -1;
        }
    }


}
