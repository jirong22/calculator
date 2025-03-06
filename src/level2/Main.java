package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // 연산기록 저장
    private static List<Integer> history = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("1번째 숫자를 입력하세요: ");
                int num1 = scanner.nextInt();
                history.add(num1);


                System.out.print("2번째 숫자를 입력하세요: ");
                int num2 = scanner.nextInt();
                history.add(num2);
                System.out.print("사용할 연산자를 입력하세요(+,-,*,/): ");
                char operator = scanner.next().charAt(0);

                //결과초기값설정
                double result = 0;

                switch (operator) {
                    case '+':
                        result = history.get(history.size() - 1) + history.get(history.size() - 2);
                        break;

                    case '-':
                        result = history.get(history.size() - 1) - history.get(history.size() - 2);
                        break;

                    case '*':
                        result = history.get(history.size() - 1) * history.get(history.size() - 2);
                        break;

                    case '/':
                        if (num2 == 0) {
                            System.out.println("0으로 나눌수없습니다.");
                            continue; //다시시작
                        }
                        result = (double) history.get(history.size() - 2) / history.get(history.size() - 1);
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
                    break;
                } else {
                    System.out.println("잘못된입력입니다.");
                }
            }
        }
        public static List<Integer> getHistory() {
            return history;
        }
    }


