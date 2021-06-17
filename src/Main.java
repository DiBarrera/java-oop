import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Lorena Jimenez Diaz", "Medico internista");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }


        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        Patient patient1 = new Patient("Alex", "alex@outlook.com");

        System.out.println(patient.getName());
        System.out.println(patient1.getName());
        patient1 = patient;

        System.out.println(patient.getName());
        System.out.println(patient1.getName());

        patient1.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient1.getName());

/*
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        patient.setPhoneNumber("1234567890");
        System.out.println(patient.getPhoneNumber());

        int i = 0;
        int b = 2;
        b = i;
        // b = 0

        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("1234567890");
        System.out.println(patient.getPhoneNumber());
*/
    }
}
