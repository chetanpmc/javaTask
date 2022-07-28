						// Q2 Will the following method compile? If not, why?
						// Yes It Will 
import java.util.ArrayList;
import java.util.List;

public class Q2 
{
	public static void print(List<? extends Number> list)
	{
		for (Number n : list) 
		System.out.print(n + " ");
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(23);
		al1.add(24);
		al1.add(95);
		print(al1);
	}
}
