/*
 * Denna klassen instansierar databasen
 */
package informationsprojekt;

import java.io.File;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 * @author Rasmus & Felix
 */
public class Databas {

    private static InfDB db;

    public static InfDB getDB() {
        // Sökvägen för databasfilen
        File databas = new File("db/PROJEKT.FDB");

        try {
            db = new InfDB(databas.getAbsolutePath());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return db;
    }
}
