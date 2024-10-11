
package arraylistScanner;
public class foto {
    private String fichero;

    public foto(String fichero) {
        this.fichero = fichero;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public void imprimir() {
        System.out.println("Imprimiendo foto: " + fichero);
    }

    @Override
    public String toString() {
        return "foto [Fichero: " + fichero + ", Codigo: " + hashCode() + "]";
    }

    
}
