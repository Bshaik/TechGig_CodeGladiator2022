package semifinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MT3 {

	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=0;
		int[] inputs = new int[3];
				
		for(String str : br.readLine().split("\\s"))
		{
			inputs[n] = Integer.parseInt(str);
			++n;
		}
		
		 Map<Integer, Boolean> mapOccupiedSeats = new HashMap<>();

		for (int i = 0; i < inputs[1]; i++) 
		{
			mapOccupiedSeats.put(Integer.parseInt(br.readLine()), true);
		}

		for (int i = 0; i < inputs[2]; i++) 
		{
			System.out.println(mapOccupiedSeats.getOrDefault(Integer.parseInt(br.readLine()), false) ? "N" : "Y");
		}
	

	}

}
