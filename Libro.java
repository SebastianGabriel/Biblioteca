public class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private boolean prestado; //true : Prestado  / false : No prestado
    
    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.prestado=false;
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

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public Libro() {
    }

    public void mostrarInformacion(){
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println("Numero de paginas: "+this.numeroDePaginas);
        if(prestado)
        System.out.println("No disponible");
        else
        System.out.println("Disponible");
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}