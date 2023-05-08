package Ejercicio5;

public class EquiposFutbol {
    private String Nombre;
    private String estadio;
    private String liga;

    public EquiposFutbol(String nombre, String estadio, String liga) {
        Nombre = nombre;
        this.estadio = estadio;
        this.liga = liga;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals(""))
            Nombre = "undefined";
        else
        Nombre = nombre;
    }
    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        if (estadio.equals(""))
            this.estadio = "Vicente Calderon";
        else
            this.estadio = estadio;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        if (liga.equals(""))
            this.liga = "Española";
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "EquiposFutbol{" +
                "Nombre='" + Nombre + '\'' +
                ", estadio='" + estadio + '\'' +
                ", liga='" + liga + '\'' +
                '}';
    }
}
