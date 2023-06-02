public class Mascotas {
    String nombre;
    String animal;
    int edad;

    public Mascotas(String nombre, String animal, int edad) {
        this.nombre = nombre;
        this.animal = animal;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void Imprimir(){
        System.out.println(this.nombre);
        System.out.println(this.animal);
        System.out.println(this.edad);
    }
}
