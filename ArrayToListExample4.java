import java.util.*;
import java.util.stream.Collectors;
public class ArrayToListExample4
{
    //                      Using Collectors.toList();

    //creating a generic function that converts the Array into List
    public static <T> List<T> ArrayToListConversion(T arr[])
    {
//creates a list from the specified Array and returns the List
        return Arrays.stream(arr).collect(Collectors.toList());
    }
    public static void main(String args[])
    {
//creating an array to be converted into List And prints the Array
        String arr[] = { "Python", "HTM", "Java", "C", "C++", "JavaScript", "Ruby", "Swift", "PHP" };
        System.out.println("Array: "+ Arrays.toString(arr));


//calling the method created above and storing the elements into the List object and prints the List
        List<String> list = ArrayToListConversion(arr);
        System.out.println("List: " + list);
    }
}