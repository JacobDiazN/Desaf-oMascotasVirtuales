package MascotasVirtuales;

public interface HacerSonido {
    default void hacerSonido() {
        // Implementación por defecto
        System.out.println("Sonido del animal");
    }
}
