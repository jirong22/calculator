package level1;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("2번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            System.out.print("사용할 연산자를 입력하세요 : ");
            char operator = scanner.next().charAt(0);

            //결과초기값설정
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("0으로 나눌수 없습니다.");
                        break;
                    }
                    result = (double) num1 / num2;
                    break;

                default:
                    System.out.println("잘못된계산입니다.");
                    continue;
            }

            //결과출력
            System.out.println("결과 :  " + result);

            System.out.print("exit 입력시종료됩니다:");
            String exitInput = scanner.next();

            if (exitInput.equals("exit")) {
                System.out.println("계산을종료합니다.");
                break; // 종료
            } else {
                System.out.println("잘못된입력입니다.");
            }
        }
    }
}


