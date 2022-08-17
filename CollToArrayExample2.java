//Example to convert Java Collection to Array

import java.util.*;
public class CollToArrayExample2
{
    public static void main(String args[])
    {

// create an LinkedList object
        LinkedList <Object> list = new LinkedList <>();

// Add some elements into this LinkedList
        list.add("Rachel");
        
        System.out.println("Before Conversion , LinkedList elements : " + list);

        Object arr[] = list.toArray();

        System.out.println("After Conversion , LinkedList elements : " + Arrays.toString(arr));

    }
}