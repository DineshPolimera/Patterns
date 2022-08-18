package in.ineuron.main;
class User{
	private String userName;
	private String password;
	public User(String userName,String password) {
		this.userName=userName;
		this.password=password;
	}
	public void login(String userName,String password) {
		if(this.userName.toLowerCase().equals((userName).toLowerCase())&&this.password.equals(password)){
			System.out.println("UserName is "+userName+" is valid.");
		}
		else
		{
			System.out.println("User is invalid");
		}
	}
}
public class DemoLogin {

	public static void main(String[] args) {
		User user=new User("SaiDinesh","12345");
		user.login("SaiDinesh","12345");
		user.login("RagaSai","123");
	}

}
