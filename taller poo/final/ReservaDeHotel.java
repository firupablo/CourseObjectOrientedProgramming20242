public class ReservaDeHotel {

    private String NombreDelCliente;
    private String FechaDeIngreso;
    private String FechaDeSalida;
    private int NumeroDeHabitacion;
    public boolean ReservaActiva;

    public ReservaDeHotel(String NombreDelCliente, String FechaDeIngreso, String FechaDeSalida,
            int NumeroDeHabitacion, boolean ReservaActiva) {
        this.NombreDelCliente = NombreDelCliente;
        this.FechaDeIngreso = FechaDeIngreso;
        this.FechaDeSalida = FechaDeSalida;
        this.NumeroDeHabitacion = NumeroDeHabitacion;
        this.ReservaActiva = ReservaActiva;

    }

    public String reserva(String NombreDelCliente, String FechaDeIngreso, String FechaDeSalida, int NumeroDeHabitacion) {
        this.ReservaActiva = true;
        return "El cliente " + this.NombreDelCliente + " ha reservado la habitacion " + this.NumeroDeHabitacion
                + " desde el " + this.FechaDeIngreso + " hasta el " + this.FechaDeSalida;
    }
    public String CancelarReserva() {
        this.ReservaActiva = true;
        return "La reserva de la habitacion " + this.NumeroDeHabitacion + " ha sido cancelada";
    }
    public String ConsultarReserva() {
        if (ReservaActiva == false) {
            return "La habitacion " + this.NumeroDeHabitacion + " esta disponible";
            
        }else{
            return "El cliente " + this.NombreDelCliente + " ha reservado la habitacion " + this.NumeroDeHabitacion
                + " desde el " + this.FechaDeIngreso + " hasta el " + this.FechaDeSalida;
        }
    }
    


}