package semifinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class mt2
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arySTQ = br.readLine().split("\\s"); 

		int occupiedSeats = Integer.parseInt(arySTQ[1]);
		String[] arryOccupiedSeatsList = new String[occupiedSeats];

		for (int i = 0; i < occupiedSeats; i++) 
		{
			arryOccupiedSeatsList[i] = br.readLine();
		}

		List<String> occupiedSeatsList = Arrays.asList(arryOccupiedSeatsList);
		int pressferSeats = Integer.parseInt(arySTQ[2]);
		for (int i = 0; i < pressferSeats; i++) 
		{
			System.out.println((occupiedSeatsList.contains(br.readLine())) ? "N" : "Y");
		}
	}
}
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arySTQ = br.readLine().split(" "); 

		int occupiedSeats = Integer.parseInt(arySTQ[1]);
		String[] arryOccupiedSeatsList = new String[occupiedSeats];

		for (int i = 0; i < occupiedSeats; i++) 
		{
			arryOccupiedSeatsList[i] = br.readLine();
		}

		List<String> occupiedSeatsList = Arrays.asList(arryOccupiedSeatsList);
		int pressferSeats = Integer.parseInt(arySTQ[2]);
		for (int i = 0; i < pressferSeats; i++) 
		{
			System.out.println((occupiedSeatsList.contains(br.readLine())) ? "N" : "Y");
		} 
 */
