import java.util.Scanner;

public class FizzBuzzTranslate {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numberInput;

        do {
            System.out.println("Nhap vao mot so: ");
            numberInput = input.nextInt();
        } while (numberInput < 0 || numberInput > 100);
        System.out.println(fizzBuzzMethod(numberInput));

        if (numberInput <= 10) {
            readUnitNumbers(numberInput);
        } else if (numberInput < 20) {
            readTeen(numberInput);
        } else if (numberInput < 100) {
            getTys(numberInput);
        }
    }
    public static String fizzBuzzMethod(int numberInput) {
        boolean isDivisible3 = numberInput % 3 == 0;
        boolean isDivisible5 = numberInput % 5 == 0;
        String result = "";
        if (isDivisible3) {
            result += "Fizz";
            result = getBuzz(isDivisible5, result);
        }
        else if (isDivisible5)
            result += "Buzz";
        else
            result += numberInput;
        return result;
    }

    private static String getBuzz(boolean isDivisible5, String result) {
        if (isDivisible5)
            result += "Buzz";
        return result;
    }

    private static void readUnitNumbers(int Ones) {
        switch (Ones) {
            case 0:
                System.out.print("");
            case 1:
                System.out.print(" one");
                break;
            case 2:
                System.out.print(" two");
                break;
            case 3:
                System.out.print(" three");
                break;
            case 4:
                System.out.print(" four");
                break;
            case 5:
                System.out.print(" five");
                break;
            case 6:
                System.out.print(" six");
                break;
            case 7:
                System.out.print(" seven");
                break;
            case 8:
                System.out.print(" eight");
                break;
            case 9:
                System.out.print(" nine");
                break;
        }
    }

    private static void readTys(int Tens) {
        switch (Tens) {
            case 2 -> System.out.print("twenty");
            case 3 -> System.out.print("thirty");
            case 4 -> System.out.print("forty");
            case 5 -> System.out.print("fifty");
            case 6 -> System.out.print("sixty");
            case 7 -> System.out.print("seventy");
            case 8 -> System.out.print("eighty");
            case 9 -> System.out.print("ninety");
        }
    }

    private static void readTeen(int Ones) {
        switch (Ones) {
            case 1 -> System.out.print("eleven");
            case 2 -> System.out.print("twelve");
            case 3 -> System.out.print("thirteen");
            case 4 -> System.out.print("fourteen");
            case 5 -> System.out.print("fifteen");
            case 6 -> System.out.print("sixteen");
            case 7 -> System.out.print("seventeen");
            case 8 -> System.out.print("eighteen");
            case 9 -> System.out.print("nineteen");
        }
    }

    private static void getTys(int a) {
        int tens = a / 10;
        double c = (a / 10.0 - tens) * 10;
        int ones = (int)c;

        readTys(tens);
        readUnitNumbers(ones);
    }
}

