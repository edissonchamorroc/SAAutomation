package com.dummi.utilities;

public class ObtenerFechaEl {

    public static String dia( String date) {

        return date.split("/")[0];
    }

    public static String mes( String date) {

         return date.split("/")[1];
    }

    public static String anio(String date) {

         return date.split("/")[2];
    }
}
