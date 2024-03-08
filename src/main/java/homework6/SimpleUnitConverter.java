package homework6;

public class SimpleUnitConverter {

    public static void main(String[] args) {
        // Exemplu de utilizare
        System.out.println(convert(10, "cm", "mm") + " mm");
        System.out.println(convert(1, "m", "mm") + " mm");
        System.out.println(convert(10, "mm", "cm") + " cm");
        // Adăugați mai multe exemple după necesitate
    }

    public static double convert(double value, String fromUnit, String toUnit) {
        double valueInMm = convertToMm(value, fromUnit);
        return convertFromMm(valueInMm, toUnit);
    }

    private static double convertToMm(double value, String unit) {
        switch (unit) {
            case "km":
                return value * 1_000_000;
            case "m":
                return value * 1_000;
            case "dm":
                return value * 100;
            case "cm":
                return value * 10;
            case "mm":
                return value;
            default:
                System.out.println("Unitatea " + unit + " nu este recunoscuta.");
                return 0;
        }
    }

    private static double convertFromMm(double value, String unit) {
        switch (unit) {
            case "km":
                return value / 1_000_000;
            case "m":
                return value / 1_000;
            case "dm":
                return value / 100;
            case "cm":
                return value / 10;
            case "mm":
                return value;
            default:
                System.out.println("Unitatea " + unit + " nu este recunoscuta.");
                return 0;
        }
    }
}
