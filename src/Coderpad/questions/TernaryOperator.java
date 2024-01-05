package Coderpad.questions;

public class TernaryOperator {
    public static void main(String[] args) {
        boolean b = true;
        boolean c = b? !b : b;
        System.out.println(c);
        int num1 = 100;
        int num2 = 20;

        int res = num1>num2 ? (num1+num2):(num2-num1);
        System.out.println(res);
    }
}
