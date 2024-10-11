package arraylistScanner;
import java.util.ArrayList;

public class Impresion extends producto {
    private String color;
    private ArrayList<foto> fotos;

    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
        this.fotos = new ArrayList<>();
    }

    public void addFoto(foto foto) {
        this.fotos.add(foto);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<foto> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<foto> fotos) {
        this.fotos = fotos;
    }

    
}