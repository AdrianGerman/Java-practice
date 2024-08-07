public class Doctor {
    // Atributos
    static int id = 0;
    String name;
    String email;
    String speciality;

    Doctor() {
        System.out.println("Contruyendo el objeto Doctor...");
    }

    Doctor(String name, String speciality) {
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    // Comportamiento
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("Id del doctor: " + id);
    }
}
