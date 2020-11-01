package xyz.akanite.panda.number;

public class NumberUtil {

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isNumeric(Integer strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum.toString());
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isNumeric(Double strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(String.valueOf(strNum));
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isNumeric(Float strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum.toString());
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isNumeric(Character strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum.toString());
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
