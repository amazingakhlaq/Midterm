package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class
UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		// create map to store


		Map<String, List<String>> map = new HashMap<String, List<String>>();

		// create list one and store values

		List<String> val1 = new ArrayList<String>();

		val1.add("java");
		val1.add("ruby");
		val1.add("python");
		val1.add("c++");
		val1.add("HTML");
		val1.add("javascript");

		// create list two and store values

		List<String> val2 = new ArrayList<String>();

		val2.add("windows");
		val2.add("macintosh");
		val2.add("linux");

		// create list three and store values

		List<String> val3 = new ArrayList<String>();

		val3.add("SQL");
		val3.add("Mongodb");
		val3.add("Dropbox");

		// put values into map

		map.put("Programming Languages :", val1);

		map.put("platforms: ", val2);

		map.put("Databases :", val3);

		// iterate and display values

		System.out.println("Fetching Keys and corresponding [Multiple] Values n");

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {

			String key = entry.getKey();

			List<String> values = entry.getValue();

			System.out.println("Key = " + key);

			System.out.println("Values = " + values);

		}

      /*
        while (.hasNext()) {

            String key = s.next();
            if (!map.containsKey(key))
                map.put(key, new LinkedList<String>());

            map.get(key).add(s.next());
        }
          */

		System.out.println("************************");

		// forEach(action) method to iterate map
		map.forEach((k, v) -> System.out.println("Key = " + k + "  Value = " + v));



		// System.out.println("*******from forloop" +map);

	}


}




