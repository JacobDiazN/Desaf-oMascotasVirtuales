package MascotasVirtuales;

import java.util.*;
import java.util.ArrayList;

public class SistemasMascotas {

    private List<Mascota> listaMascota;

    public SistemasMascotas(){
        listaMascota = new ArrayList<>();
    }


    public static void main(String[] args) {

        System.out.println("");
        SistemasMascotas sistema = new SistemasMascotas();

        Mascota perro = new Perro("Loky", "Perro", 3);
        Mascota gato = new Gato("Juanito", "Gato", 5);
        Mascota ave = new Ave("Chimuelo", "Ave", 30);
        Mascota perroNadador = new PerroNadador("Tom", "Perro", 2);

        sistema.agregarMascota(perro);
        sistema.agregarMascota(gato);
        sistema.agregarMascota(ave);
        sistema.agregarMascota(perroNadador);

        sistema.mostrarMascota();

        sistema.realizarAccionesMascota();

    }

    public void agregarMascota(Mascota mascota){

        listaMascota.add(mascota);
        System.out.printf("El %s %s fue agregado a la lista y tiene %d años\n" ,mascota.getTipo(), mascota.getNombre(), mascota.getEdad());
    }

    public void mostrarMascota(){
        System.out.println("\n================== Lista de Mascotas =======================");
        for (Mascota mascota : listaMascota){
            System.out.println(mascota);
        }
    }

    public void realizarAccionesMascota() {
        System.out.println("\n========== Realizando acciones de las mascotas =============");
        for (Mascota mascota : listaMascota) {
            mascota.hacerSonido();
            if (mascota instanceof Perro) {
                ((Perro) mascota).correr();
            }
            if (mascota instanceof Gato) {
                ((Gato) mascota).trepar();
            }
            if (mascota instanceof Ave) {
                ((Ave) mascota).volar();
            }
            if (mascota instanceof PerroNadador) {
                ((PerroNadador) mascota).nadar();
            }
        }
    }

}