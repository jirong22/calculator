package level2;

public class Calculator {

    //덧셈
    public int add(int a, int b) {
        return a + b;
    }

    //뺄셈
    public int sub(int a, int b) {
        return a - b;
    }

    //곱셈
    public int mul(int a, int b) {
        return a * b;
    }

    //나눗셈
    public double div(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌수 없습니다."); //0일경우만
            return 0;
        }
        return (double) a / b;
    }

    //변수





}
