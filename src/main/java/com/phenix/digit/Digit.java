package com.phenix.digit;

import jakarta.validation.constraints.NotNull;

/**
 * Gère pour l'affichage de digit.
 *
 * @author <a href="mailto:edouard128@hotmail.com">Edouard Jeanjean</a>
 */
public final class Digit {

    /**
     * Pour empêcher d'instancier la classe.
     *
     * @throws Exception
     */
    private Digit() throws Exception {
        throw new Exception("Cette classe ne peut pas être instanciée.");
    }

    /**
     * Retourne un nombre sur 2 digits.
     *
     * @param nombre Le nombre.
     * @return Nombre sur deux digits.
     */
    @NotNull
    public static String getDigit(byte nombre) {
        return (nombre > 10) ? "" + nombre : "0" + nombre;
    }

    /**
     * Retourne un nombre sur 2 digits.
     *
     * @param nombre La valeur.
     * @return Nombre sur deux digits.
     */
    @NotNull
    public static String getDigit(int nombre) {
        return nombre > 10 ? "" + nombre : "0" + nombre;
    }

    /**
     * Retourne un nombre en 3 chiffres.
     *
     * @param valeur Le nombre.
     * @return Le nombre en 3 chiffres.
     */
    @NotNull
    public static String getDigit3(int valeur) {
        if (valeur < 10) {
            return "00" + valeur;
        }
        if (valeur < 100) {
            return "0" + valeur;
        }

        return "" + valeur;
    }

    /**
     * Retourne un nombre sur un certain nombre de digits.
     *
     * @param nombre Le nombre à traiter.
     * @param nb_digit Le nombre de digits.
     * @return Le nombre adapté.
     */
    @NotNull
    public static String getDigit(int nombre, int nb_digit) {
        String digit = "";

        int cara = ("" + nombre).length();

        for (int i = 0; i < (nb_digit - cara); i++) {
            digit += "0";
        }

        return digit + nombre;
    }
}
