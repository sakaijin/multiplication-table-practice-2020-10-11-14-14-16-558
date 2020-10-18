package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        return generateMultiplicationTable(startNumber,endNumber);
    }

    private static String generateMultiplicationTable(int startInt, int endInt) {
        if (!compareValueOfstartIntToendInt(startInt, endInt)){
            return null;
        }
        if (!verifiyAllValues(startInt, endInt)){
            return null;
        }
        return createMultiplicationTable(startInt,endInt);
    }

    private static String createMultiplicationTable(int startInt, int endInt) {
        StringBuilder result = new StringBuilder();
        for(int i = startInt;  i <= endInt; i++){
            for(int j =  startInt; j <= i;j++){
                result.append(j).append("*").append(i).append("=").append(i*j);
                if (j != i){
                    result.append("  ");
                }
            }
            if(i <endInt){
                result.append("\r\n");
            }
        }
        return result.toString();
    }

    private static boolean verifiyAllValues(int startInt, int endInt) {
        return startInt > 0 && startInt < 1000 && endInt > 0 && endInt < 1000 ;
    }

    private static boolean compareValueOfstartIntToendInt(int startInt, int endInt) {
        return startInt <= endInt;
    }
}
