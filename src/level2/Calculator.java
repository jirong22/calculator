package level2;

import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;

    //num1캡슐 세터
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    //num2캡슐설정
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //덧셈
    public int add() {
        return num1 + num2;
    }

    //뺄셈
    public int sub() {
        return  num1 - num2;
    }

    //곱셈
    public int mul() {
        return  num1 * num2;
    }

    //나눗셈
    public double div(int a, int b) {
        if (num2 == 0) {
            System.out.println("0으로 나눌수 없습니다."); //0일경우만
            return 0;
        }
        return (double) num1 / num2;
    }

}
