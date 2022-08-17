//Example to convert Java Collection to Array

import java.util.*;
public class CollToArrayExample1
{
    public static void main(String args[])
    {

// create an ArrayList object
        ArrayList<Object> al = new ArrayList<>();

            //                  Using .toArray();

// Add some elements into this ArrayList
        al.add("Joey");
        al.add("F.R.I.E.N.D.S");

        System.out.println("Before Conversion , ArrayList elements : " + al);

        Object arr[] = al.toArray();

        System.out.println("After Conversion , ArrayList elements : " + Arrays.toString(arr));

    }
}
