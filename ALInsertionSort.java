import java.util.ArrayList;
import java.util.Arrays;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;

		//Add the first number to the array list
		sorted.add(myNumbers[0]);
		//Loop once for all of the remaining numbers in the unsorted list
		for(int pos = 1; pos < myNumbers.length; pos++)
		{
			int temp = myNumbers[pos];
			for(int i = 0; i < pos && inserted; i++)
			{
				if(sorted.get(i) < temp)
				{
					sorted.add(i, temp);
					inserted = true;
				}

			}

			if(!inserted)
				sorted.add(temp);
		}

		for(int i = 0; i < myNumbers.length; i++)
		{
			myNumbers[i] = sorted.get(i);
		}

		System.out.println(Arrays.toString(myNumbers));
			//Check with each of the numbers in the sorted list

				//If this number is less than one in the sorted list,
				//insert it there

			//If it was not inserted, stick it on the end.


		//End Loop for unsorted list


		//Move the data back to the array

		//Print the contents of the array

    }


}
