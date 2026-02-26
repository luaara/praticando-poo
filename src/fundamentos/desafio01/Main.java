package fundamentos.desafio01;

/*Assuntos: Construtores, this, Associação Simples.

Cenário: Crie um sistema de biblioteca simplificado.

Crie uma classe Autor (Nome, Nacionalidade).

Crie uma classe Livro (Título, Autor, Ano).

Regra: O Livro não pode ser criado sem um Titulo e um Autor.

No main, instancie um autor e passe-o para o construtor do livro. Exiba os dados.*/


public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "brasileira");

        Livro livro = new Livro("Quincas Borba", 1891, autor);

        System.out.println(livro);

    }
}