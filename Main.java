import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Biblioteca biblioteca = new Biblioteca();
    public static Persona pepe = new Persona("Pepe", "Garcia");

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("""
                    Ingrese una opcion:
                    1. Añadir libro
                    2. Mostar informacion
                    3. Pedir prestado
                    4. Devolver libro
                    5. Los libros del Pepe garcia
                    0. Salir
                    """);
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion > 0 && opcion < 6) {
                switch (opcion) {
                    case 1 -> {
                        agregarLibro();
                    }
                    case 2 -> {
                        biblioteca.mostrarInformacion();
                    }
                    case 3 -> {
                        prestarLibro();
                    }
                    case 4 -> {
                        devolverLibro();
                    }
                    case 5 -> {
                        pepe.mostrarInformacion();
                    }
                }
            }
        } while (opcion != 0);
    }

    public static void agregarLibro() {
        System.out.println("Ingrese el titulo del libro");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor");
        String autor = sc.nextLine();
        System.out.println("Ingrese la cantidad de paginas");
        int paginas = Integer.parseInt(sc.nextLine());
        Libro libro = new Libro(titulo, autor, paginas);
        biblioteca.agregarLibro(libro);
    }

    public static void prestarLibro() {
        Libro libro = buscarLibro();
        if (libro != null) {
            libro.setPrestado(true);
            pepe.pedirPrestado(libro);
        }
    }

    public static void devolverLibro() {
        Libro libro = buscarLibro();
        if (libro != null) {
            libro.setPrestado(false);
            pepe.devolverLibro(libro);
        }
    }

    public static Libro buscarLibro() {
        System.out.println("Ingrese el titulo");
        String titulo = sc.nextLine();
        for (Libro libro : biblioteca.getCatalogo()) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            } 
        }
        System.out.println("No existe el libro");
        return null;
    }
}
