package bai4;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a:");
        int a = scanner.nextInt();
        System.out.println("Nhập vào cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập vào cạnh c:");
        int c = scanner.nextInt();
        Triangle triangle = new Triangle(a,b,c);
        try {
            triangle.checkTriangle(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

}
