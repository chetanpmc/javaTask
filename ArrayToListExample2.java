import java.util.*;
public class ArrayToListExample2
{
    public static void main(String args[])
    {
//creating an array to be converted and print//
        String arr[] = { "Aston Martin","Audi", "BMW",};
        System.out.println("Array before conversion: "+ Arrays.toString(arr));

        //                          Using Arrays.asList();

//calling generic method that converts Array into List And prints the List
        List<String> list = ArrayToListConversion(arr);
        System.out.println("Array after conversion: " + list);
    }
    //creating a generic function that converts the Array into List
    public static <T> List<T> ArrayToListConversion(T arr[])
    {
//invoking the asList() method and passing the array to be converted
        List<T> list = Arrays.asList(arr);
//returns the list
        return list;
    }
}
