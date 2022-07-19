package semifinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MT 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String STQ = in.nextLine();

		String[] arySTQ = STQ.split(" ");

		int occupiedSeats = Integer.valueOf(arySTQ[1]);
		int preferredSeats = Integer.valueOf(arySTQ[2]);

		List<Integer> occupiedSeatsList = new ArrayList<Integer>();
		List<Integer> preferredSeatsList = new ArrayList<Integer>();

		int i = 0, noOfpreferredSeats = 0, noOfoccupiedSeats = 0;
		
		while(i<occupiedSeats+preferredSeats)
		//for (int i = 0; i < occupiedSeats+preferredSeats; i++) 
		{
			if(occupiedSeats <= i) 
			{
				noOfpreferredSeats = in.nextInt();
				preferredSeatsList.add(noOfpreferredSeats);
			}
			else
			{
				noOfoccupiedSeats = in.nextInt();
				occupiedSeatsList.add(noOfoccupiedSeats);
			}
			i++;
		}
		
		for (Integer integer : preferredSeatsList) 
		{
			if(occupiedSeatsList.contains(integer))
			{
				System.out.println("N" );
			}
			else
			{
				System.out.println("Y" );
			}
		}
	}
}
