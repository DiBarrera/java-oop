import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Lorena Jimenez Diaz", "Medico internista");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}
