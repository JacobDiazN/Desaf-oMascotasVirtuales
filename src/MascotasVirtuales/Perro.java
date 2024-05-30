package MascotasVirtuales;


public class Perro extends Mascota implements HacerSonido{

    public Perro(String nombre, String tipo, int edad) {
        super(nombre, tipo, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.printf("%s hace Guau Guau", this.getNombre());
    }

    public void correr(){
        System.out.printf(" y Está corriendo feliz \n");
    }

    @Override
    public String toString() {
        return "Perro = {" +
                "nombre: '" + getNombre() + '\'' +
                ", tipo: '" + getTipo() + '\'' +
                ", edad=: " + getEdad() +
                '}';
    }
}
