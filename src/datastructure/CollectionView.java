package datastructure;

import javax.naming.ldap.SortKey;
import java.security.Key;
import java.util.*;

public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "NYC");
                map.put(2, "LA");
                map.put(3, "Denver");
                map.put(4, "Boston");
                map.put(5, "San Jose");
                map.put(6, "Seattle");

                //get method to test
                String str1 = map.get("1");
                System.out.println(str1);

                String str2 = map.get("2");
                System.out.println(str2);

                String str3 = map.get("3");
                System.out.println(str3);

                //loop using HashMap method entrySet fires
                for (Map.Entry en : map.entrySet())
                {
                       //printing elements
                        System.out.print(en);
                        System.out.print(":");
                        System.out.println(map.get(en));

                        //we can print this way too
                        System.out.println(en.getKey() + " and " + en.getValue());

                }

        }
}

