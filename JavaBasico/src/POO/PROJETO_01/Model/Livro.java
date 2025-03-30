package POO.PROJETO_01.Model;

public class Livro {
     private String titulo;
     private String autor;
     private String isbn;
     private int ano;
     private boolean disponivel;

     public Livro(String titulo, String autor, String isbn, int ano){
         this.titulo = titulo;
         this.autor = autor;
         this.isbn = isbn;
         this.ano = ano;
         this.disponivel = true;
     }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public int getAno() { return ano; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    @Override
    public String toString() {
        return "Livro [Título=" + titulo + ", Autor=" + autor + ", ISBN=" + isbn + ", Ano=" + ano + ", Disponível=" + disponivel + "]";
    }

}
