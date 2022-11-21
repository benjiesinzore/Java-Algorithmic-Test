package org.benjaminsinzore.schools.hackerrank;

import java.util.*;

public class HackerRanks {

    public static void main(String[] args){

        projectManager(feedProjectManagerList());
    }



    public static  List<String> feedProjectManagerList(){
        List<String> list = new ArrayList<>();
        list.add("YYY");
        list.add("YNY");
        list.add("YYY");
        list.add("NNY");
        list.add("NYY");
        list.add("YYY");
        list.add("YYY");
        return list;
    }

    public static void projectManager(List<String> list){

        for (String ss : list){

            String[] lst = ss.split("");
            System.out.println(Arrays.toString(lst));
        }

    }
}
