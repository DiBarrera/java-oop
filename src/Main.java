import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Lorena Jimenez Diaz", "lorena@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Martha", "martha@mail.com");
        user.showDataUser();

        User userPatient = new Patient("David", "david@mail.com");
        userPatient.showDataUser();

/*
        System.out.println(myDoctor.getAvailableAppointments());

        for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }
 */

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(patient);
    }
}
