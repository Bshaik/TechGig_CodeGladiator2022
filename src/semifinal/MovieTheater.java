package semifinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MovieTheater 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print(" Please Enter STQ : ");
		String STQ = in.nextLine();
		System.out.println(STQ);
		
		String[] arySTQ = STQ.split(" ");
		int totalSeats = Integer.valueOf(arySTQ[0]);
		System.out.println();
		System.out.println("totalSeats::: " +totalSeats);
		System.out.println();

		int occupiedSeats = Integer.valueOf(arySTQ[1]);
		System.out.println();
		System.out.println("occupiedSeats::: " +occupiedSeats);
		System.out.println();
		
		int preferredSeats = Integer.valueOf(arySTQ[2]);
		System.out.println();
		System.out.println("preferredSeats::: " +preferredSeats);
		System.out.println();
		
		
		List<Integer> occupiedSeatsList = new ArrayList<Integer>();
		System.out.print(" Please Enter occupied Seats numbers : ");
		for (int i = 0; i < occupiedSeats; i++) 
		{
			int noOfoccupiedSeats = in.nextInt();
			in.nextLine();
			occupiedSeatsList.add(noOfoccupiedSeats);
			
		}
		System.out.println("occupiedSeatsList :: " + occupiedSeatsList);
		
		List<Integer> preferredSeatsList = new ArrayList<Integer>();
		System.out.print(" Please Enter preferred Seats numbers : ");
		for (int i = 0; i < preferredSeats; i++) 
		{
			int noOfpreferredSeats = in.nextInt();
			in.nextLine();
			preferredSeatsList.add(noOfpreferredSeats);
			
		}
		System.out.println("preferredSeatsList :: " + preferredSeatsList);
		
//		if(occupiedSeatsList.size() == preferredSeatsList.size())
//		{
			int seatNumber;
			for (int i = 0; i < preferredSeatsList.size(); i++) 
			{
				seatNumber = preferredSeatsList.get(i);
				System.out.println("seatNumber :: " +seatNumber);
				if(occupiedSeatsList.contains(seatNumber))
				{
					System.out.println("Already Occupied, Status :: N" );
				}
				else
				{
					System.out.println("Vacant, Status :: Y" );
				}
			}
		//}
//		else if(occupiedSeatsList.size() > preferredSeatsList.size())
//		{
//			int seatNumber;
//			for (int i = 0; i < preferredSeatsList.size(); i++) 
//			{
//				seatNumber = preferredSeatsList.get(i);
//				System.out.println("seatNumber :: " +seatNumber);
//				if(occupiedSeatsList.contains(seatNumber))
//				{
//					System.out.println("Already Occupied, Status :: N" );
//				}
//				else
//				{
//					System.out.println("Vacant, Status :: Y" );
//				}
//			}
//			
//		}
//		else if(preferredSeatsList.size() > occupiedSeatsList.size())
//		{
//			
//		}

	}

}
