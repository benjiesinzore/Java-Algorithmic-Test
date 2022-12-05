package org.benjaminsinzore.schools.hackerrank;

import java.util.*;

public class HackerRanks {

    public static void main(String[] args){

        projectManager(feedProjectManagerList());
    }

    /*
        Create a function that will return the most consecutive days all employees attended

     */
    public static  List<String> feedProjectManagerList(){
        List<String> list = new ArrayList<>();
        list.add("YNY");
        list.add("YYY");
        list.add("NNY");
        list.add("NYY");
        list.add("YYY");
        list.add("YYY");
        list.add("YYY");
        return list;
    }

    public static void projectManager(List<String> list){

        int count = 0;
        for (String ss : list){

            String[] lst = ss.split("");
            System.out.println(Arrays.toString(lst));

            for (String s : lst) {
                if (Objects.equals(s, "N")) {
                    break;
                }
                count++;
            }


        }

        System.out.println(count);

    }
}
