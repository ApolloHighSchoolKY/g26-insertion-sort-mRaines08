import java.util.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37, 1};

        for(int pos = 1; pos < myNumbers.length; pos++)
        {
            int temp = myNumbers[pos];
            boolean placed = false;

            for(int i = pos - 1; !placed; i--)
            {
                if(i == -1)
                {
                    myNumbers[0] = temp;
                    placed = true;
                }

                if(temp < myNumbers[i])
                    myNumbers[i + 1] = myNumbers[i];
                else
                {
                    myNumbers[i + 1] = temp;
                    placed = true;
                }
            }
        }   
        
        System.out.println(Arrays.toString(myNumbers));
    }
}
