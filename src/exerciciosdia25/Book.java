package exerciciosdia25;

public class Book {

    private int id;
    private String titulo;
    private String autor;
    private int ano;

    public Book() {
    }

    public Book(int id, String titulo, String autor, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + " - " + ano;
    }
    //Quando é colocado um override, retorna o seguinte erro:
    //"Method does not override method from its superclass"
    //O método não existe na superclasse (nesse caso, Objeto)
    //@Override
    public String tostring() {
        return titulo + ", " + autor;
    }
}