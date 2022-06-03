package OpenRound;
import java.util.HashMap;
import java.util.Scanner;

public class WorldArmy {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String launchTime = in.nextLine();
		String[] aryLaunchTime = launchTime.split(" ");

		String travelTime = in.nextLine();
		String[] aryTravelTime = travelTime.split(" ");

		
		int launchTimeHr =  Integer.valueOf(aryLaunchTime[0]);
		int launchTimeMin = Integer.valueOf(aryLaunchTime[1]);

		int travelTimeHr = Integer.valueOf(aryTravelTime[0]);
		int travelTimeMin =  Integer.valueOf(aryTravelTime[1]);


		int blastTimeHr = +launchTimeHr + +travelTimeHr;
		int blastTimeMin = +launchTimeMin + +travelTimeMin;
		
		String BT_Min = "", BT_Hr = "";

		if (blastTimeMin >= 60)
		{
			blastTimeHr++;
			blastTimeMin -= 60;
			
			BT_Min = String.valueOf(blastTimeMin);
		}
		else
		{
			BT_Min = String.valueOf(blastTimeMin);
		}
		
		if (blastTimeHr >= 24)
		{
			blastTimeHr = blastTimeHr - 24;
			
			BT_Hr = String.valueOf(blastTimeHr);
		}
		else
		{
			BT_Hr = String.valueOf(blastTimeHr);
		}
		
		if (blastTimeMin < 10) 
		{
			BT_Min = "0" + String.valueOf(blastTimeMin);
			//blastTimeMin = Integer.valueOf(BT_Min);
		}
		if (blastTimeHr < 10) 
		{
			BT_Hr = "0" + String.valueOf(blastTimeHr);
			//blastTimeHr = Integer.valueOf(BT_Hr);
		}

		String output = BT_Hr + " " + BT_Min;
		
		System.out.println(output);


	}

}
