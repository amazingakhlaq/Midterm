package string.problems;

import javax.swing.*;
import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";


        //Total word count
        String []ar = st.split("\\s");

        //Total letter Count
        String []ar2 = st.split("");
        //System.out.println(Arrays.toString(ar2));//to check how many letters in the string


        Map<String, Integer> mp= new HashMap<String, Integer>();
        int count=0;

        for(int i=0;i<ar.length;i++){
            count=0;

            for(int j=0;j<ar.length;j++){
                if(ar[i].equals(ar[j])){
                    count++;
                }

            }

            mp.put(ar[i], count);

        }
        //printing number of occurrences
        System.out.println("Concurrence of each word : " +mp);

        //check the number of words
        System.out.println("Total number of words : " +ar.length);

        //check the number of letters contain in the string
        System.out.println("Total number of letters : " +ar2.length);

        //finally the average length of the word
        System.out.println("the average length of the words is  : " +Math.ceil(ar2.length/ar.length));


        /*
        String num ;
        List<String> list = Arrays.asList(st.split(" "));
        Set<String> wd = new HashSet<String>(list);


        for (String word : wd) {


            System.out.println(word + ":" + Collections.frequency(list, word));


            //average length of the words
            System.out.println("Average length of word is :" + st.length() / word.length());

        }

       */

    }
}
