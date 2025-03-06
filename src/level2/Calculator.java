package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    //캡슐화
    private int num1;
    private int num2;

    //연산결과 리스크에 저장하도록 리스트 추가
    private List<Integer> history;


    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.history = new ArrayList<>();
    }

    // 값을 반환 게터
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }

    // 값을 추가 변경 세터
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // 연산결과 저장 int result
    private void saveResult(int result) {
        history.add(result);
    }

    // 리스트 전체 반환
    public  List<Integer> getHistory() {
        return history;
    }

    //덧셈
    public int add() {
        int result = num1 + num2;
        saveResult(result);
        return result;
    }

    //뺄셈
    public int sub() {
        int result = num1 - num2;
        saveResult(result);
        return result;
    }

    //곱셈
    public int mul() {
        int result = num1 * num2;
        saveResult(result);
        return  result;
    }

    //나눗셈
    public double div() {
        if (num2 == 0) {
            System.out.println("0으로 나눌수 없습니다."); //0일경우만
            return 0;
        }
       //정수로 변환후 저장
        double result = (double) num1 / num2;
        saveResult((int) result);
        return result;
    }

}
