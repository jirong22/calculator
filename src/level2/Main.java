package level2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        while (true) {
            System.out.print("1번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("2번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            System.out.print("사용할 연산자를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            //결과초기값설정
            double result = 0;

            switch (operator) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;

                case '-':
                    result = calculator.sub(num1, num2);
                    break;

                case '*':
                    result = calculator.mul(num1, num2);
                    break;

                case '/':
                    result = calculator.div(num1, num2);
                    break;

                default:
                    System.out.println("잘못된 계산입니다.");
                    continue;
            }

            //결과출력

            System.out.println("결과 :  " + result);

            System.out.print("exit 입력시종료 :");
            String exitInput = scanner.next();

            if (exitInput.equals("exit")) {
                System.out.println("계산종료");
                break; // 종료
            } else {
                System.out.println("잘못된입력입니다.");

            }
        }
    }
}


