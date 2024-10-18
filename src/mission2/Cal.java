package mission2;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {

        System.out.print("숫자를 입력하세요 : ");
        Scanner firstNum = new Scanner(System.in);
        int Num1 = firstNum.nextInt();

        System.out.print("연산기호를 입력하세요 : ");
        Scanner tump = new Scanner(System.in);
        String StrTump = tump.nextLine();

        System.out.print("숫자를 입력하세요 : ");
        Scanner secondNum = new Scanner(System.in);
        int Num2 = secondNum.nextInt();

        if (StrTump.equals("+")) {
            System.out.println(Num1 + Num2);
        }
        else if (StrTump.equals("-")) {
            System.out.println(Num1 - Num2);
        }
        else if (StrTump.equals("*")) {
            System.out.println(Num1 * Num2);
        }
        else if (StrTump.equals("/")) {
            if (Num2 == 0) {
                System.out.println("분모에 0을 입력할 수 없습니다.");
            }
            else {
                System.out.println(Num1 / Num2);
            }

        } else System.out.println("연산기호를 다시 입력해주세요");

    }
}