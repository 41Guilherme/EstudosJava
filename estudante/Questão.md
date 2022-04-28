EXERCÍCIO 1

Crie uma classe chamada Estudante que inclua os atributos id, nome,

nota. Além disso forneça:

(a) (0,1 ponto) Um construtor que inicializa os três atributos supondo

que os valores fornecidos são corretos.

(b) (0,1 ponto) Os métodos acessadores (get), um para cada atributo.

(c) (0,1 ponto) Os métodos modificadores (set), um para cada atributo.

Suponha que os valores fornecidos são corretos.

(d) (0,2 ponto) Um método chamado toString que devolva um string

com os dados do estudante.

(1,5 pontos) Faça com que a classe Estudante sejá comparável, isto é que

implemente a interface Comparable e implemente o método compareTo

que permita comparar os estudantes pela nota.

EXERCÍCIO 2

Crie uma classe chamada Turma que inclua os atributos estudantes (lista

de estudantes da turma) e mediaNotaTurma (media das notas da turma).

Além disso forneça:

(a) (0,1 ponto) Um construtor que inicializa a lista de estudantes.

(b) (0,1 ponto) Os métodos acessadores (get), um para cada atributo.

(c) (0,1 ponto) Os métodos modificadores (set), um para cada atributo.

Suponha que os valores fornecidos são corretos.

(d) (0,2 ponto) Um método chamado toString que devolva um string

com os dados da turma.

(e) (1,5 pontos) Um método calcularAtualizarMedia que calcula e atual-

iza a média da turma.

(f) (1,5 pontos) Um método estudanteComMaiorNota que devolve o es-

tudante que tem a maior nota da turma (suponha que todas as notas

da turma são diferentes). Você deve usar obrigatoriamente algum

algoritmo da classe Collections.

(g) (1,5 pontos) Um método estudantesAprovados que devolve uma lista

com os estudantes aprovados da turma.

(h) (1,5 pontos) Um método juntarTurma que permiter juntar a turma

com a segunda turma pasada como parâmetro. Como resultado a

turma fica com mais alunos e sua média fica modicada. Além disso a

segunda turma fica vazia e com a média igual a zero. Você deve usar

obrigatoriamente algoritmo(s) da classe Collections.

EXERCÍCIO 3

(1,5 pontos) Escreva um aplicativo de teste chamado TesteUniversidade

para testar as classes criadas no Exercício 1 e 2. O aplicativo deve:

(a) Criar cinco objetos Estudante.

(b) Criar uma LinkedList de estudantes chamada list1 com os 2 primeiros

estudantes criados.

(c) Criar uma arrayList chamada list2 com os 3 últimos estudantes cria-

dos.

(d) Criar a turma t1 com a lista list1.

(e) Criar a turma t2 com a lista list2.

(f) Calcular e atualizar a média da turma t1 e t2.

(g) Imprimir os dados da turma t1 e t2.

(h) Mostrar o aluno que tem a maior nota da turma t1 e o aluno da turma

t2.

(i) Mostrar os estudantes aprovados da turma t1 e os da turma t2.

(j) Juntar as duas turmas na turma 1 e mostrar o resultado.