package OpenRound;

import java.util.Arrays;
import java.util.Scanner;

public class ChantuBantu {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int noOfTestCases = in.nextInt();
		in.nextLine();

		for (int i = 0; i < noOfTestCases; i++) 
		{
			int noOfGiftsToBuy = in.nextInt();
			in.nextLine();
			int noOfGiftsToAvailable = in.nextInt();
			in.nextLine();
			String strgiftPrices = in.nextLine();
			//String[] aryGiftPrices = strgiftPrices.split(" ");
			long[] giftPrices = Arrays.stream(strgiftPrices.split(" "))
                    .map(String::trim)
                    .mapToLong(Long::valueOf)
                    .toArray();
			long output = getMinMoneyToSpend(noOfGiftsToBuy, noOfGiftsToAvailable, giftPrices);
			System.out.println(output);
		}
		in.close();
	}

	public static long getMinMoneyToSpend(int noOfGiftsToBuy, int noOfGiftsToAvailable, long[] giftPrices) 
	{
		long minMoneyToSpend = 0;
		try
		{
			//System.out.println("Un Sorted giftPrices"+ Arrays.toString(giftPrices));
			Arrays.sort(giftPrices);
			//System.out.println("Sorted giftPrices"+ Arrays.toString(giftPrices));
			long[] minSpendOnGifts = Arrays.copyOfRange(giftPrices, 0, noOfGiftsToBuy);
			minMoneyToSpend = Arrays.stream(minSpendOnGifts).sum();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		return minMoneyToSpend;
	}
}

