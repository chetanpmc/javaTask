import java.util.*;
public class ArrayToListExample1
{
    public static void main(String args[])
    {
//creating an array and prints the array
        String array[] = { "Cricket", "Baseball", "Volleyball",};
        System.out.println("Array before conversion: "+ Arrays.toString(array));

        //                      Using Native Method

        //calling the generic function that converts Array into List And print the List
        List<String> list = ArrayToListConversion(array);
        System.out.println("Array as List: " + list);
    }
    //creating a generic function that converts the Array into List
    public static <T> List<T> ArrayToListConversion(T array[])
    {
//creating the constructor of the List class
        List<T> list = new ArrayList<>();
//using for-each loop to iterate over the array
        for (T t : array)
        {
//adding each element to the List
            list.add(t);
        }
//returns the list converted into Array
        return list;

    }
}