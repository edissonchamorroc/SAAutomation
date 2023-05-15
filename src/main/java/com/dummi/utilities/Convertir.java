package com.dummi.utilities;

public class Convertir {

    public static String mesNumericoAsString(String mesNumerico) {
        String request = null;
        switch (mesNumerico) {
            case "01": {
                request = "January";
                break;
            }
            case "02": {
                request = "February";
                break;
            }
            case "03": {
                request = "March";
                break;
            }
            case "04": {
                request = "April";
                break;
            }
            case "05": {
                request = "May";
                break;
            }
            case "06": {
                request = "June";
                break;
            }
            case "07": {
                request = "July";
                break;
            }
            case "08": {
                request = "August";
                break;
            }
            case "09": {
                request = "September";
                break;
            }
            case "10": {
                request = "October";
                break;
            }
            case "11": {
                request = "November";
                break;
            }
            case "12": {
                request = "December";
                break;
            }
        }
        return request;
    }
}
