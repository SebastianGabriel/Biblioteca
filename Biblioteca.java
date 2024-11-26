import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro>Catalogo=new ArrayList();

    public void agregarLibro(Libro libro){
        this.Catalogo.add(libro);
    }

    public void mostrarInformacion(){
        for (Libro libro : this.Catalogo) {
        System.out.println("+------------+");
        libro.mostrarInformacion();  
        System.out.println("+------------+"); 
        }
    }

    public ArrayList<Libro> getCatalogo() {
        return Catalogo;
    }

    public void setCatalogo(ArrayList<Libro> catalogo) {
        Catalogo = catalogo;
    }

}
