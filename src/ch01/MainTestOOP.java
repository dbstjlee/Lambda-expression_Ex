package ch01;

//객체 지향적으로 계산기를 구현
class Calculator {

 public int add(int x, int y) {
     return x + y;
 }

 public int subtract(int x, int y) {
     return x - y;
 }

 public int multiply(int x, int y) {
     return x * y;
 }

 public int divide(int x, int y) {
     if (y == 0) {
         throw new IllegalArgumentException("Cannot divide by zero");
     }
     return x / y;
 }
}

public class MainTestOOP {
 public static void main(String[] args) {
     // 객체를 생성해서 메서드를 호출
     Calculator calculator = new Calculator();

     System.out.println("10 + 5 = " + calculator.add(10, 5));
     System.out.println("10 - 5 = " + calculator.subtract(10, 5));
     System.out.println("10 * 5 = " + calculator.multiply(10, 5));
     System.out.println("10 / 5 = " + calculator.divide(10, 5));
 }
}

