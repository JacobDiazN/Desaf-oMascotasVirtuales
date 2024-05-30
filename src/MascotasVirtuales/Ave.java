package MascotasVirtuales;

public class Ave extends Mascota implements HacerSonido{
    public Ave(String nombre, String tipo, int edad){ super(nombre, tipo,edad);}

    @Override
    public void hacerSonido(){
        System.out.printf("%s hacía Pio Pio ", this.getNombre());
    }

        public void volar(){
            System.out.printf("y vuela alto \n");
        }

        @Override
        public String toString() {
            return "Ave = {" +
                    "nombre: '" + getNombre() + '\'' +
                    ", tipo: '" + getTipo() + '\'' +
                    ", edad=: " + getEdad() +
                    '}';
    }
}
