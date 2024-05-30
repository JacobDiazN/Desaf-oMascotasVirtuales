package MascotasVirtuales;

public class PerroNadador extends Perro implements Nadar{


    public PerroNadador(String nombre, String tipo, int edad) {
        super(nombre, tipo, edad);
    }

    @Override
    public void nadar() {
        System.out.printf("%s nada como Michael Phelps \n", this.getNombre());
    }

    @Override
    public String toString() {
        return "PerroNadador = {" +
                "nombre: '" + getNombre() + '\'' +
                ", tipo: '" + getTipo() + '\'' +
                ", edad=: " + getEdad() +
                '}';
    }
}
