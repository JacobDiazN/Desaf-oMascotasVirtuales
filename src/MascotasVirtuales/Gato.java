package MascotasVirtuales;

public class Gato extends Mascota implements HacerSonido{
  public Gato(String nombre, String tipo, int edad){ super(nombre, tipo,edad);}

    @Override
    public void hacerSonido(){
      System.out.printf("%s hace Miau Miau ", this.getNombre());
    }

    public void trepar(){
      System.out.printf("y trepa intrepidamente \n");
    }

  @Override
  public String toString() {
    return "Gato = {" +
            "nombre: '" + getNombre() + '\'' +
            ", tipo: '" + getTipo() + '\'' +
            ", edad=: " + getEdad() +
            '}';
  }
}

