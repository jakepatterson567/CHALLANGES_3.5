public class SpeedConverter {
    static void toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("-1");
        } else if (kilometersPerHour > 0) {
            System.out.println(Math.round(kilometersPerHour));

        }

    }
    static void printConversion(double kilometersPerHour) {
        double milePerHour = 1.5;
        if (kilometersPerHour <= 0) {
            System.out.println("invalid value");
        } else {
            long rounded = Math.round(milePerHour);
            System.out.print(milePerHour = kilometersPerHour / 1.609);
            System.out.print(" mi/h");


        }

    }







}
