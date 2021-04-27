package utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarCampoNumerico {

    public static boolean validarCampoNumerico(String numero) {
        Pattern pattern = null;
        Matcher matcher = null;
        String regex = "[0-9]{10}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(numero);

        if (matcher.find()) {

            return true;
        } else {
            return false;
        }
    }
}
