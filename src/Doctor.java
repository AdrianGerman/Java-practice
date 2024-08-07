public class Doctor {
    // Atributos
    static int id = 0;
    String name;
    String speciality;

    Doctor() {
        System.out.println("Contruyendo el objeto Doctor...");
        id++;
    }

    Doctor(String name) {
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    // Comportamiento
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("Id del doctor: " + id);
    }
}
