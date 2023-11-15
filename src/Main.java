public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <24-hour time>");
            System.exit(1);
        }

        var thTime = args[0];

        var splitTime = thTime.split(":");
        if (splitTime.length != 2) {
            System.out.println("Usage: java Main <24-hour time>");
            System.exit(1);
        }

        int hours = Integer.parseInt(splitTime[0]);
        int minutes = Integer.parseInt(splitTime[1]);
        var suffix = hours >= 12 ? "PM" : "AM";

        if (hours > 23 || hours < 0) {
            System.out.println("Invalid hours, can only be 00-23");
            System.exit(1);
        }

        if (minutes > 59 || minutes < 0) {
            System.out.println("Invalid minutes, can only be 00-59");
            System.exit(1);
        }


        int twhHours;
        if (hours == 0) { twhHours = 12; }
        else if(hours <= 12) { twhHours = hours; }
        else { twhHours = hours - 12; }

        System.out.printf("%02d:%02d %s%n", twhHours, minutes, suffix);
    }
}