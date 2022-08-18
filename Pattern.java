package in.ineuron.main;

public class Pattern {

	public static void main(String[] args) {
		int n =10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
					if(i==0||j==(n-1)/2||i==(n-1))
						System.out.print("*");
					else 
						System.out.print(" ");
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
					if(j==0||j==n-1||i==j)
						System.out.print("*");
					else 
						System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
					if(i==0||i==n-1||i==(n-1)/2||j==0)
						System.out.print("*");
					else 
						System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
					if(j==0||i==n-1||j==n-1)
						System.out.print("*");
					else 
						System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
					//if(j==0||i==0||(j==(n-1)&&i<(n-1)/2)||i==(n-1)/2||(i-j)==4||(i>(n-1)/2&&j%2!=0&&(i+j)%3==0))
					if(j==0||i==0||i==(n-1)/2&&j<=(n-1)/2+2||j==n-3&&i<(n-1)/2||(i-j)==4)
						System.out.print("*");
					else 
						System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
					if(i==0||j==0||i==n-1||j==n-1)
						System.out.print("*");
					else 
						System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
					if(j==0||j==n-1||i==j)
						System.out.print("*");
					else 
						System.out.print(" ");
			}
			System.out.println("  ");
		}

	}

}
