import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

public Digits (int num)
{
digitList = new ArrayList<Integer> ();
if (num == 0)
{
digitList.add (new Integer (0));
}
while (num > 0)
{
digitList.add (0, new Integer (num & 10));
num /= 10;
}}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		int x=0;
		for(int i=digitlist.size();i>0;i--)
	if(digitList.get(i)<digitList.get(i-1))	
x++;
		if(x>0)
			return false;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
