import java.util.Scanner;

public class MyBigNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String stn1 = sc.nextLine();
        String stn2 = sc.nextLine();
        stringSum(stn1,stn2);

    }


    public static void stringSum(String stn1, String stn2) {
        int number1 = Integer.parseInt(stn1);
        int number2 = Integer.parseInt(stn2);
        int temp = 0;
        int finalResult = 0;
        while (number1 != 0 || number2 != 0) {
            int digit1 = number1 % 10;
            number1 /= 10;
            int digit2 = number2 % 10;
            number2 /= 10;
            int sumDigit = digit1 + digit2;
            int result = sumDigit % 10;
            temp += result;
            finalResult = (finalResult * 10) + temp;

            String s = Integer.toString(reverse(finalResult));

            System.out.println(s);
        }
    }

    public static int reverse(int numReverse) {
        int digit;
        int reverse = 0;
        while (numReverse != 0) {
            digit = numReverse % 10;
            reverse = reverse * 10 + digit;
            numReverse /= 10;
        }
        return reverse;
    }

}
