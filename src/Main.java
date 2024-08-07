import model.Doctor;
import model.Patient;
import model.User;

import javax.print.Doc;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Mauro German", "Cirujano");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "2pm");

        System.out.println(myDoctor);

        User user = new Doctor("Pepe", "pepe@gmail.com");
        user.showDataUser();

        User userPa = new Patient("Juan", "juan@gmail.com");
        userPa.showDataUser();

//        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
//            System.out.println(aA.getDate() + " " + aA.getTime());
//        }

//        System.out.println();
//        System.out.println();
//        Patient patient = new Patient("Adrian", "adrian@gmail.com");
//        System.out.println(patient);
    }
}