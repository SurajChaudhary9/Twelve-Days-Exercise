public class Example {

    public static void main(String[] args) {

        for (int day = 1; day <= 12; day++) {
            System.out.print("On the "); //1

            switch (day) {
                case 1:
                    System.out.print("First");//st //total op 1st //suffix 1st
                    break;
                case 2:
                    System.out.print("Second");//2nd
                    break;
                case 3:
                    System.out.print("Third");//3rd
                    break;
                case 4:
                    System.out.print("Fourth");//3rd
                    break;
                case 5:
                    System.out.print("Fifth");//3rd
                    break;
                case 6:
                    System.out.print("Sixth");//3rd
                    break;
                case 7:
                    System.out.print("Seventh");//3rd
                    break;
                case 8:
                    System.out.print("Eighth");//3rd
                    break;
                case 9:
                    System.out.print("Nineth");//3rd
                    break;
                case 10:
                    System.out.print("Tenth");//3rd
                    break;
                case 11:
                    System.out.print("Eleventh");//3rd
                    break;
                default:
                    System.out.print("Twelfth");//4th-12th
            }

            System.out.println(" day of Christmas my true love gave to me");

            switch (day) {
                case 12:
                    System.out.print("Twelve drummers drumming,");
                case 11:
                    System.out.print("Eleven pipers piping,");
                case 10:
                    System.out.print("Ten lords a leaping,");
                case 9:
                    System.out.print("Nine ladies dancing,");
                case 8:
                    System.out.print("Eight maids a milking,");
                case 7:
                    System.out.print("Seven swans a swimming,");
                case 6:
                    System.out.print("Six geese a laying,");
                case 5:
                    System.out.print("Five golden rings,");
                case 4:
                    System.out.print("Four calling birds,");
                case 3:
                    System.out.print("Three French hens,");
                case 2:
                    System.out.print("Two turtle doves, and");
                default:
                    System.out.print("A partridge in a pear tree.");
            }

            System.out.println("\n");
        }
    }
}