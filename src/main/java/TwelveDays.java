public class TwelveDays {

    public static void main(String[] args) {

        for (int day = 1; day <= 12; day++) {
            System.out.print("On the ");

            switch (day) {
                case 1:
                    System.out.print("First");//First
                    break;
                case 2:
                    System.out.print("Second");//Second
                    break;
                case 3:
                    System.out.print("Third");//Third
                    break;
                case 4:
                    System.out.print("Fourth");//Fourth
                    break;
                case 5:
                    System.out.print("Fifth");//Fifth
                    break;
                case 6:
                    System.out.print("Sixth");//Sixth
                    break;
                case 7:
                    System.out.print("Seventh");//Seventh
                    break;
                case 8:
                    System.out.print("Eighth");//Eighth
                    break;
                case 9:
                    System.out.print("Nineth");//Nineth
                    break;
                case 10:
                    System.out.print("Tenth");//Tenth
                    break;
                case 11:
                    System.out.print("Eleventh");//Eleventh
                    break;
                default:
                    System.out.print("Twelfth");//Twefth
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