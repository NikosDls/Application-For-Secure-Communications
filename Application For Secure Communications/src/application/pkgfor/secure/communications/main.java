package application.pkgfor.secure.communications;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NikosDls
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean debug = false;
        if (!debug) {
            PrintStream printStream;
            try {
                printStream = new PrintStream(new FileOutputStream("logs/log.txt"));
                System.setOut(printStream);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        chooseAction menu = new chooseAction(100, 100);
        menu.setVisible(true);
    }

}
