public class FindingIndex
{
  static void printIndex()
  	{
      int arr[] = { 1, 2, 3, 4, 5 };
  		for (int i = 0; i < arr.length; i++)
  			for (int j = i + 1; j < arr.length; j++)
  				if (arr[i] + arr[j] == 5)
  					System.out.print("(" + i + ", "	+ j + ")");
  	}
  	public static void main(String[] arg)
  	{
          printIndex();
  	}
}
