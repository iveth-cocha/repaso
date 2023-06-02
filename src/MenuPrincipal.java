
public class MenuPrincipal {
    public static void main(String[] args) {
        Mascotas m1=new Mascotas("Sofy", "perro", 5);
        Mascotas m2=new Mascotas("Lola", "gato", 8);
        Mascotas m3=new Mascotas("Genobeva", "oso", 3);

        System.out.println("------Mascotas--------");
        m1.Imprimir();
        System.out.println("------  --------");
        m2.Imprimir();
        System.out.println("------  --------");
        m3.Imprimir();
        }
    }
