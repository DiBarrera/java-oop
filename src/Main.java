import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Lorena Jimenez Diaz", "Medico internista");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        int i = 0;
        int b = 2;
        b = i;
        // b = 0

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

        System.out.println(patient);
        System.out.println(patient1);
        System.out.println(patient.getName());
        System.out.println(patient1.getName());
        /*
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("1234567890");
        System.out.println(patient.getPhoneNumber());
         */
    }
}
