package bai3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị của x :");
        int x = scanner.nextInt();
        System.out.println("Nhập giá trị của y: ");
        int y = scanner.nextInt();
        CalculationExample calc= new CalculationExample();
        calc.calculate(x,y);
    }
    private void calculate(int x, int y){
        try{
            int a = x +y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng : " + a);
            System.out.println("Hiệu :" + b);
            System.out.println("Tích :" + c);
            System.out.println("Thương :" + d);
        }
        catch (Exception e){
            System.out.println("Xảy ra ngoại lệ " + e.getMessage());
        }
    }
}
