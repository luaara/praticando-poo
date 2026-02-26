package fundamentos.desafio01;

public class Livro {
    private String titulo;
    private int ano;
    private Autor autor;

    public Livro(String titulo, int ano, Autor autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro: [" +
                "titulo: " + titulo + '\'' +
                ", ano: " + ano +
                ", " + autor +
                ']';
    }
}