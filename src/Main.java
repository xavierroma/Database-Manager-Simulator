
import DBMSi.Table;
import Menu.Gestor;
import Menu.Menu;

import java.util.ArrayList;

/**
 * Created by XRoma i Clupspv on on 12/5/17.
 */
public class Main {
    private final static int PRIMERA_OPCIO = 1;
    private final static int NUMERO_OPCIONS = 5;
    private static ArrayList<Table> tables;

    public static void main(String[] args) throws Exception {
        tables = new ArrayList<Table>();
        Gestor.setTables(tables);
        gestioMenu();

    }

    /**
     * Procediment que uneix la gestio del Menu
     */
    private static void gestioMenu(){
        Menu m;

        do {
            m = new Menu(PRIMERA_OPCIO, NUMERO_OPCIONS, Menu.ES_MENU_PRINCIPAL);
            Gestor.gestionaOpcioAmbNumero(m.getOpcio());
        } while (m.getOpcio() != m.getNumOpcioSortir());
    }

}
