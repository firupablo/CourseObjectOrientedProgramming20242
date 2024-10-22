import java.util.Random;

class Personaje {
    private String nombre;
    private int puntosDeVida;
    private int estamina;
    private int MAX_DANO = 15;
    private int MIN_DANO = 0;

    // Constructor para inicializar los datos del personaje
    public Personaje(String nombre ) {
        this.nombre = nombre;
        this.puntosDeVida = 200;
        this.estamina = 50; // Todos comienzan con 200 puntos de vida
    }

    // Método para realizar un ataque a otro personaje
    public void atacar(Personaje oponente, String arma) {
        
        if (estamina <= 0) {
            System.out.println(this.nombre + " no tiene suficiente estamina para atacar.");
            
            estamina += 20;
            return;
        }else{
        
        estamina -= 10;

        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO; // Daño entre 0 y 15
        if (arma == "Espada") {
            dano = dano + 10;
        }else if(arma == "Pistolita"){
            dano = dano + 20;
        }else if(arma == "Granada"){
            dano = dano + 30;
        }

        if (arma == "mrd") {
            oponente.recibirDano(dano);
            System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " con los puños causando " + dano + " puntos de daño.");
        }else{
            oponente.recibirDano(dano);
            System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " con " + arma + " causando " + dano + " puntos de daño.");
        }

        Random rand2 = new Random();
        int botiquin = rand2.nextInt(3) + 1;
        int bottiquin = rand2.nextInt(3) + 1;
        if (botiquin == bottiquin) {
            this.puntosDeVida += 20;
            if (this.puntosDeVida > 200) {
                this.puntosDeVida = 200;
            }System.out.println(this.nombre + " ha encontrado un botiquin de vida, ahora tiene: " + this.puntosDeVida);
            
        }
        Random rand3 = new Random();
        int orbe = rand3.nextInt(4) + 1;
        int orbe2 = rand3.nextInt(4) + 1;
        if (orbe == orbe2) {
            this.estamina += 30;
            if (this.estamina > 200) {
                this.estamina = 200;
            }System.out.println(this.nombre + " ha encontrado un orbe magico, ahora tiene: " + this.estamina + " de estamina.");
            
        }
    }
    
    }

    // Método para recibir daño
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0; // No se puede tener menos de 0 puntos de vida
        }
    }

    public String obtenerArma(){
        Random rand = new Random();
        int dano = rand.nextInt(10) + 1;
        String arma = "mrd";
        if (dano <= 7) {
            arma = "mrd";
        }else if(dano == 8){ 
            arma = "Espada"; 
        }else if(dano == 9){ 
            arma = "Pistolita";
        }else if(dano == 10){ 
            arma = "Granada";
        }
        System.out.println(this.nombre + " ha obtenido una: " + arma);
        return arma;
    }
    

    // Verifica si el personaje sigue vivo
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // Devuelve el nombre del personaje
    public String getNombre() {
        return this.nombre;
    }

    // Devuelve los puntos de vida actuales
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public int getEstamina() {
        return this.estamina;
    }
    
}

