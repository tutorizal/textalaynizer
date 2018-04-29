package com.whitaaplikasi.app.textalay;

public class AlayHelper {
    public static String alaynize(String input) {
        String result = input.toLowerCase();
        result = result.replaceAll("nya","X");
        result = result.replaceAll("i", "1");
        result = result.replaceAll("a","4");
        result = result.replaceAll("e","3");
        result = result.replaceAll("s","5");
        result = result.replaceAll("b","8");
        return  result;
    }
}
