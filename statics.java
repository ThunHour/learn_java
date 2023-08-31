import java.util.Scanner;
public class statics{

    public static void main(String[] args)
	{
		//number of names	
		int columns = 3;
		
		//number of details
		int rows = 3;
	
		String[][] database = new String[columns][rows];
	
		String name = Entername();
		String city = Entercity();
		String bday = Enterbday();
	
		
		database[0][0] = name;
		database[0][1] = city;
		database[0][2] = bday;
		
		for (int j =0; j < columns; j++)
		{
			System.out.println(database[0][j]);
		}
	}
	
	
	static String Entername()
	{
		String x;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter name");
			x = in.nextLine();
		}
		return x;
	}
	
	static String Entercity()
	{	
		String x;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter place of birth");
			x = in.nextLine();
		}
		return x;
	}	
	
	static String Enterbday()
	{	
		String x;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter date of birth");
			x = in.nextLine();
		}
		return x;
	}
		
		//return (name, city, bday);
	
	
}

