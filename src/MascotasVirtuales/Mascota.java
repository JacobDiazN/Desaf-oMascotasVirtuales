package MascotasVirtuales;

public class Mascota {

    private String nombre;
    private int edad;
    private String tipo;

    public Mascota() {
    }

    public Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public void hacerSonido(){

    }

    public void mostraInfo(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mascota = {" +
                "nombre: '" + nombre + '\'' +
                ", edad: " + edad +
                ", tipo: '" + tipo + '\'' +
                '}';
    }
}

