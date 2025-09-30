/**
 * Excepción personalizada para errores de login en la aplicación.
 * Permite mostrar un mensaje de error mediante un cuadro de diálogo.
 *
 */
package excepciones;

import javax.swing.JOptionPane;

public class LoginError extends Exception {

    private static final long serialVersionUID = 1L;
    private String mensaje;

    public LoginError(String mensaje) {
        this.mensaje = mensaje;
    }

    public void visualizarMen() {
        JOptionPane.showMessageDialog(null, this.mensaje, "Error", JOptionPane.ERROR_MESSAGE);

    }
}
