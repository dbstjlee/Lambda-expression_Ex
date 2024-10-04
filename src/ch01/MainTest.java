package ch01;

// 람다식을 사용하기 위해서는 
// 함수형 인터페이스가 먼저 만들어져 있어야 한다. 
@FunctionalInterface
interface MathOperation {
	int operate(int x, int y);
	//int perate1(int x, int y);
}

public class MainTest {
	public static void main(String[] args) {
		
		// 핵심 ! 
		// 함수형 인터페이스를 활용해서 내가 필요한 식을(람다 형태)을 직접 정의한다.
		// 식을 만들었다면 필요한 시점에 간결하게 호출해서 사용한다. 
		
		// 식을 만들어 보자. 
		MathOperation add =  (int x, int y) -> {return x + y;};
		MathOperation subtract =  (int x, int y) -> {return x - y;};
		MathOperation divide =  (int x, int y) -> {return x / y;};
		MathOperation multiply =  (int x, int y) -> {return x * y;};
		
		
		// 람다식을 호출하여 결과를 출력해 보자. 
		System.out.println("10 + 10 = " + add.operate(10, 10));
		System.out.println("10 - 10 = " + subtract.operate(10, 10));
		System.out.println("10 / 10 = " + divide.operate(10, 0));
		System.out.println("10 * 10 = " + multiply.operate(10, 10));
	}
}
