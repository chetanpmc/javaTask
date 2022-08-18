import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static java.lang.System.*;

public class HashMapIterator
{
    public static void main(String[] args)
    {
        HashMap<String, String> capitalMap = new HashMap<String,String>();;
        capitalMap.put("India","New Delhi");            //Adding Values
        capitalMap.put("USA","Washington DC");
        capitalMap.put("UK","London");

        out.println(capitalMap.get("India"));
        out.println(capitalMap.get("UK"));
        out.println(capitalMap.get("USA"));

        out.println("------using keySet();-------");
        //Iterator

                         //Iteration Over the Key using keySet();

        Iterator<String> it=capitalMap.keySet().iterator();
        while (it.hasNext())
        {
            String key=it.next();
            String value =capitalMap.get(key);
            out.println(key+"="+value);
        }
        capitalMap.keySet().iterator();
        out.println("________using entrySet_________");

                             //Iteration over the Set (Pair) using entrySet

       Iterator<Map.Entry<String, String>> it1 = capitalMap.entrySet().iterator();
       while (it1.hasNext())
       {
           Map.Entry<String,String> entry =it1.next();
           out.println(entry);
           //                       OR
           //System.out.println(entry.getKey()+"="+entry.getValue());
       }
        out.println("________Using for each Lambda________");
                                // Using for each Lambda

        capitalMap.forEach((k,v) ->out.println(k+""+v));

    }

}
