import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private ArrayList<Libro>librosPrestados;
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.librosPrestados = new ArrayList();
    }

    public void mostrarInformacion(){
        for (Libro libro : this.librosPrestados) {
        System.out.println("+------------+");
        libro.mostrarInformacion();  
        System.out.println("+------------+"); 
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void pedirPrestado(Libro libro){
        librosPrestados.add(libro);
    }
    public void devolverLibro(Libro libro){
        librosPrestados.remove(libro);
    }
}
