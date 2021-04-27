package utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarFormatoCorreo {

    public static boolean validarFormatoCorreo(String correo) {
        Pattern pattern = null;
        Matcher matcher = null;
        String regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(correo);

        if (matcher.find()) {

            return true;
        } else {
            return false;
        }
    }

}
