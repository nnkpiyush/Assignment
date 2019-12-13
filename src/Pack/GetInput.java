package Pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GetInput extends driver {
	
	public static List<String> getInp()
	{
		
		Scanner scan=new Scanner(System.in);
		String inp=scan.nextLine();
		List<String> li = Arrays.asList(inp.split("\\s*,\\s*"));
		return li;
	}
	

	public static void main(String[] args) {
		
		
		
		System.out.println(driver.calculatesubscription(getInp()));
	
	}

}
