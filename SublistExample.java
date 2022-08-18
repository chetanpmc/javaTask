import java.util.*;

public class SublistExample
{
   public static void main (String[] args)
   {
        List list = Arrays.asList("Two three Four six one three Four".split(" "));
        System.out.println("List :"+list);

        List sublist = Arrays.asList("three Four".split(" "));
        System.out.println("SubList :"+sublist);
        System.out.println(
                "indexOfSubList: " + Collections.indexOfSubList(list, sublist));

        System.out.println(
                "lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
   }
}
