/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesion8.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author abarrios
 */
public class ValidarCampoNumerico {

    public ValidarCampoNumerico() {

    }

    public static boolean validarCampoNumerico(String numero) {
        Pattern pattern = null;
        Matcher matcher = null;
        String regex = "[0-9]{10}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(numero);

        if (matcher.find()) {
            //System.out.println("[" + matcher.group() + "]");
            return true;
        } else {
            return false;
        }

        /*if (matcher.matches()) {
            //System.out.println("[" + matcher.group() + "]");
            return true;
        } else {
            return false;
        }*/
    }
}
