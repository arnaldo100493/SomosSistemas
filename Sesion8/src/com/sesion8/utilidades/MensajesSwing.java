package com.sesion8.utilidades;

import javax.swing.JOptionPane;

/**
 *
 * @author abarrios
 */
public class MensajesSwing {

    public MensajesSwing() {

    }

    public static void mostrarDialogoMensajeSencillo(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }

    public static void mostrarDialogoMensajeInformacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarDialogoMensajeAdvertencia(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Mensaje de Adverencia", JOptionPane.WARNING_MESSAGE);
    }

    public static void mostrarDialogoMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Menasje de Error", JOptionPane.ERROR_MESSAGE);
    }

    public static int mostrarDialogoMensajeConfirmacion(String mensaje) {
        int confirmacion = JOptionPane.showConfirmDialog(null, mensaje, "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return confirmacion;
    }

    public static int mostrarDialogoMensajeOpcion(String mensaje) {
        int opcion = JOptionPane.showOptionDialog(null, mensaje, "Mensaje de Confirmación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SI", "NO"}, "SI");
        return opcion;
    }
}
