package mission2;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {

        System.out.print("숫자를 입력하세요 : "); // 입력 문구 생성
        Scanner firstNum = new Scanner(System.in); // 출력 값 생성
        int Num1 = firstNum.nextInt(); // 출력 값 속성 부여

        System.out.print("연산기호를 입력하세요 : ");
        Scanner tump = new Scanner(System.in);
        String StrTump = tump.nextLine();

        System.out.print("숫자를 입력하세요 : ");
        Scanner secondNum = new Scanner(System.in);
        int Num2 = secondNum.nextInt();

        if (StrTump.equals("+")) {  // if문으로 조건 설정
            System.out.println(Num1 + Num2);  // 조건이 true 일경우 출력 문구 설정
        }
        if (StrTump.equals("-")) {
            System.out.println(Num1 - Num2);
        }
        if (StrTump.equals("*")) {
            System.out.println(Num1 * Num2);
        }
        if (StrTump.equals("/")) {
            System.out.println(Num1 / Num2);
        }
        else System.out.println("연산기호를 잘 못 입력했습니다."); // 조건이 false 일경우 출력 문구 설정
    }
}