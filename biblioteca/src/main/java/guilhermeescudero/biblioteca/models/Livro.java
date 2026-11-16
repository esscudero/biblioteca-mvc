package guilhermeescudero.biblioteca.models;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;

    public String getAutor() {
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getIsbn(){
        return  isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
