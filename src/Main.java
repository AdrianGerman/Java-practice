import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Mauro German", "Cirujano");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Adrian", "adrian@gmail.com");
        patient.setWeight(70.9);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
    }
}