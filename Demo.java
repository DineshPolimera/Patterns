package in.ineuron.main;
class Car{
	private int carSpeed;
	public void setSpeed(int x) {
		carSpeed = x;
	}
	public int getSpeed() {
		return carSpeed;
	}
}
public class Demo {

	public static void main(String[] args) {
		Car c = new Car();
		c.setSpeed(100);
		System.out.println(c.getSpeed());
	}

}
