public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println(hasTeen(13,14,15));
        System.out.println(hasTeen(18));
    }
    public static boolean hasTeen(int number1, int number2, int number3) {

        if((number1 >= 13 && number1 <= 19) || (number2 >= 13 && number2 <= 19) || (number3 >= 13 && number3 <= 19)) {
            System.out.println("It is teen number.");
            return true;
        }
        System.out.println("It is not teen number.");
        return false;
    }
    public static boolean hasTeen(int number) {
        if (number >= 13 && number <= 19) {
            System.out.println("It is teen number");
            return true;
        }
        System.out.println("It is not teen number");
        return false;
    }
}