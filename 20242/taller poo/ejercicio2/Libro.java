package ejercicio2;

public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;
    private int numPaginas;
    private boolean prestado;

    public Libro(String titulo, String autor, int ISBN, int numPaginas, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
        this.prestado = prestado;
    }

    public String info() {
        if (prestado) {
            return "El libro " + titulo + " , " + autor + "; ISBN: " + ISBN + ", " + numPaginas + " pgs. "
                    + " no esta disponible";
        } else {
            return "El libro " + titulo + " , " + autor + "; ISBN: " + ISBN + ", " + numPaginas + " pgs. "
                    + " esta disponible";
        }
    }

    public String prestar() {
        if (prestado) {
            return "El libro " + titulo + " no se puede prestar";
        } else {
            prestado = true;
            return "El libro " + titulo + " ahora es tuyo, recuerda devolverlo";
        }
    }

    public String devolver() {
        if (prestado) {
            prestado = false;
            return "El libro " + titulo + " se ha devuelto";
        } else {
            return "Bro, como vas a devolver " + titulo + " si no lo has prestado, sos bobo?";
        }
    }

}
