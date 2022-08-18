package in.ineuron.main;
class Date{
	private int day,month,year;
	
	public Date() {
		day =0;
		month = 0;
		year = 0;
	}
	public Date(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	public void printDate() {
		System.out.println("Date:"+day+"/"+month+"/"+year);
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		Date date = new Date(8,02,1999);
		date.printDate();

	}

}
