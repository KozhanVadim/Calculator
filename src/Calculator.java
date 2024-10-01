import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main otv = new Main();
        System.out.println("Input: ");
        String input = scan.nextLine();
        System.out.println("Output:\n"+otv.calc(input));

    }
}
class Main {
    public static String calc(String input) {
        String excep = "throws Exeption";
        String out0 = calc1(input);
        String out1 = calc2(input);
        String out2 = calc3(input);
        String out3 = calc4(input);
        if (out0 != "throws Exeption"){
            return out0;
        }else if (out1 != "throws Exeption"){
            return out1;
        }else if (out2 != "throws Exeption"){
            return out2;
        }else if (out3 != "throws Exeption"){
            return out3;
        } return excep;
    }
    static String calc1 (String input) {
        String excep = "throws Exeption";
        int len1 = input.length();
        if (len1 != 3) {
            return excep;}
        int otv = 0;
        int number1 = input.charAt(0) - '0';
        int number2 = input.charAt(2) - '0';
        if (number1 >= 1 && number1 < 10 && number2 >= 1 && number2 < 10) {
            char zk = input.charAt(1);
            String znk = Character.toString(zk);
            switch (znk) {
                case "+":
                    otv = number1 + number2;
                    break;
                case "-":
                    otv = number1 - number2;
                    break;
                case "*":
                    otv = number1 * number2;
                    break;
                case "/":
                    if (number2 == 0){
                        return excep;
                    } else otv = number1 / number2;
                    break;
            }
            String resh = Integer.toString(otv);
            return resh;

        } else return excep;

    }
    static String calc2 (String input) {
        String excep = "throws Exeption";
        int len1 = input.length();
        if (len1 != 4) {
            return excep;}
        int otv = 0;
        int number1 = input.charAt(0) - '0';
        int number2 = input.charAt(2) - '0';
        int number3 = input.charAt(3) - '0';
        if (number2 == 1 && number3 == 0) {
            int number6 = 10;
            char zk = input.charAt(1);
            String znk = Character.toString(zk);
            switch (znk) {
                case "+":
                    otv = number1 + number6;
                    break;
                case "-":
                    otv = number1 - number6;
                    break;
                case "*":
                    otv = number1 * number6;
                    break;
                case "/":
                    otv = number1 / number6;
                    break;

            }String resh = Integer.toString(otv);
            return resh;
        }else return excep;

    }
    static String calc3 (String input) {
        String excep = "throws Exeption";
        int len1 = input.length();
        if (len1 != 4) {
            return excep;}
        int otv = 0;
        int number1 = input.charAt(0) - '0';
        int number4 = input.charAt(1) - '0';
        int number3 = input.charAt(3) - '0';
        if (number1 == 1 && number4 == 0) {
            int number5 = 10;
            char x = input.charAt(2);
            String znak = Character.toString(x);
            switch (znak) {
                case "+":
                    otv = number5 + number3;
                    break;
                case "-":
                    otv = number5 - number3;
                    break;
                case "*":
                    otv = number5 * number3;
                    break;
                case "/":if (number3 == 0){
                    return excep;
                } else otv = number5 / number3;
                    break;
            }String resh = Integer.toString(otv);
            return resh;
        }else return excep;

    }
    static String calc4 (String input) {
        String excep = "throws Exeption";
        int len1 = input.length();
        if (len1 != 5) {
            return excep;}
        int otv = 0;
        int number0 = input.charAt(0) - '0';
        int number1 = input.charAt(1) - '0';
        int number3 = input.charAt(3) - '0';
        int number4 = input.charAt(4) - '0';
        if (number0 == 1 && number1 == 0 && number3 == 1 && number4 ==0 ){
            int x = 10;
            int y = 10;
            char z = input.charAt(2);
            String znak = Character.toString(z);
            switch (znak) {
                case "+":
                    otv = x + y;
                    break;
                case "-":
                    otv = x - y;
                    break;
                case "*":
                    otv = x * y;
                    break;
                case "/":
                    otv = x / y;
                    break;
            }String resh = Integer.toString(otv);
            return resh;
        }else return excep;


    }
}

