package homework6;

public class Main {

    public static void main(String[] args) {

        System.out.println("10 cm în mm: " + convert(10, "cm", "mm") + " mm");
        System.out.println("1 m în mm: " + convert(1, "m", "mm") + " mm");
        System.out.println("1000 mm în m: " + convert(1000, "mm", "m") + " m");
        System.out.println("1 km în m: " + convert(1, "km", "m") + " m");
        System.out.println("123 cm în km: " + convert(123, "cm", "km") + " km");


        System.out.println("100 x în y: " + convert(100, "x", "y") + " y");
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