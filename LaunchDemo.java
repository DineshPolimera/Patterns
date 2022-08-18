package in.ineuron.main;
class Calculator{
	//int a=10,b=20;
	int display(int a,int b) {
		int c = a+b;
		//System.out.println(c);
		return c;
	}
	
}
public class LaunchDemo {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.display(10,20);
		System.out.println(result);
	}

}
