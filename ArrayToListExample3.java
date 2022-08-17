import java.util.*;
public class ArrayToListExample3
{
    public static void main(String args[])
    {
//creating an Array to be converted And prints the Array
        String arr[] = { "Ram","Sham","Raman" };
        System.out.println("Array before conversion: "+ Arrays.toString(arr));

        //                             Using addAll();
//method calling and print the List
        List<String> list = ArrayToListConversion(arr);
        System.out.println("Array after conversion: " + list);
    }
    //creating a generic function that converts the Array into List
    public static <T> List<T> ArrayToListConversion(T arr[])
    {
//creating the constructor of thr List class
        List<T> list = new ArrayList<>();
//the method adds Array to the List
        Collections.addAll(list, arr);
//returns the list
        return list;
    }
}