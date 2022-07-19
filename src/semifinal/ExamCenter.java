package semifinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamCenter {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		int number = sc.nextInt();

		List<String> strList = new ArrayList<String>();
		for(int i = 1; i <= 2000; i++)
		{
			if(String.valueOf(i).contains("2"))
			{
				continue;
			}
			else if(String.valueOf(i).contains("14"))
			{
				continue;
			}
			strList.add(String.valueOf(i));
		}	
		System.out.println(strList);
		System.out.println(strList.size());

		int output = 0 ;
		for (int j = 1; j <= number; j++)
		{
			if(j == number)
			{
				//System.out.println("My number position is found :: "+ strList.get(j-1) );
				output =  Integer.parseInt(strList.get(j-1));
				break;
			}
		}

		System.out.println("final output :::: "+ output);
	}
}
