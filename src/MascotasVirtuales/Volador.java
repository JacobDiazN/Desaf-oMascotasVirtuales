package MascotasVirtuales;

public interface Volador {
    default void volador() {
        //Implementación
        System.out.println("Ataque del ave!");
    }
}