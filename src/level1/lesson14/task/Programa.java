package level1.lesson14.task;

public class Programa {

	public static void main(String[] args) {
		
		A a = new X();
		B b = new Y();
		
		A a1 = new Z();
		B b1 = new Z(); 
		
		a1.metodasA();
		b1.metodasB1();
		b1.metodasB2();
		
		B b11 = (B) a1;
		b11.metodasB1();
		b11.metodasB2();

	}

}

interface A {
	void metodasA();
}

interface B {
	void metodasB1();
	void metodasB2();
}

class X implements A {
	@Override
	public void metodasA() {
		System.out.println("X Metodas A");
	}
}

class Y implements B {
	@Override
	public void metodasB1() {
		System.out.println("Y Metodas B1");
	}
	@Override
	public void metodasB2() {
		System.out.println("Y Metodas B2");
	}
}

class Z implements A, B {
	@Override
	public void metodasB1() {
		System.out.println("Z Metodas B1");
	}
	@Override
	public void metodasB2() {
		System.out.println("Z Metodas B2");
	}
	@Override
	public void metodasA() {
		System.out.println("Z Metodas A");
	}

}