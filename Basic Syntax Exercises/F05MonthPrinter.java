package basicSyntax;

import java.util.Scanner;

public class F05MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                num = 1;
                System.out.println("January");
                break;
            case 2:
                num = 2;
                System.out.println("February");
                break;
            case 3:
                num = 3;
                System.out.println("March");
                break;
            case 4:
                num = 4;
                System.out.println("April");
                break;
            case 5:
                num = 5;
                System.out.println("May");
                break;
            case 6:
                num = 6;
                System.out.println("June");
                break;
            case 7:
                num = 7;
                System.out.println("July");
                break;
                case 8:
                num = 8;
                System.out.println("August");
                break;
                case 9:
                num = 9;
                System.out.println("September");
                break;
                case 10:
                num = 10;
                System.out.println("Octomber");
                break;
                case 11:
                num = 11;
                System.out.println("November");
                break;
            case 12:
                num = 12;
                System.out.println("December");
                break;
            default:
                System.out.println("Error!");


        }
    }
}
