package estudante;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteUniversidade {
    
    public static void Test(){

        Estudante e1 = new Estudante(1, "Estudante 1", 6.5);
        Estudante e2 = new Estudante(2, "Estudante 2", 9.5);
        Estudante e3 = new Estudante(3, "Estudante 3", 3.5);
        Estudante e4 = new Estudante(4, "Estudante 4", 4.0);
        Estudante e5 = new Estudante(5, "Estudante 5", 10.0);
    
        List<Estudante> list1 = new LinkedList<Estudante>();
        
        list1.add(e1);
        list1.add(e2);

        List<Estudante> list2 = new ArrayList<Estudante>();

        list2.add(e3);
        list2.add(e4);
        list2.add(e5);

        Turma t1 = new Turma(list1);
        Turma t2 = new Turma(list2);

        t1.calcularAtualizarMedia();
        t2.calcularAtualizarMedia();

        System.out.println(t1);
        System.out.println(t2);

        Estudante estudante1 = t1.estudanteComMaiorNota();
        Estudante estudante2 = t2.estudanteComMaiorNota();

        System.out.println(estudante1);
        System.out.println(estudante2);

        List<Estudante> aprovados1 =  t1.estudantesAprovados();
        List<Estudante> aprovados2 =  t2.estudantesAprovados();

        System.out.println(aprovados1);
        System.out.println(aprovados2);

        t1.juntarTurma(t2);

        System.out.println(t1);
        
    }

}
