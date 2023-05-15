import com.dummi.selector.SpaceAdvisorSelectors;

import javax.swing.*;

import static com.dummi.action.SpaceAdvisorActions.*;

public class main {

    private static final String USER = "john";
    private static final String PASS = "john";
    private static String fechaIda, fechaVuelta;

    public static void main(String[] args) {

        fechaIda = JOptionPane.showInputDialog("Ingrese la fecha de ida (31/12/1111):");

        fechaVuelta = JOptionPane.showInputDialog("Ingrese la fecha de vuelta (31/12/1111):");

        AbrirNavegadorChrome("https://demo.testim.io/");

        logueoConCredenciales(USER, PASS);

        try {

            seleccionFecha(SpaceAdvisorSelectors.INPUT_DEPARTING,fechaIda);
            seleccionFecha(SpaceAdvisorSelectors.INPUT_RETURNING,fechaVuelta);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cerrarDriver();




    }
}
