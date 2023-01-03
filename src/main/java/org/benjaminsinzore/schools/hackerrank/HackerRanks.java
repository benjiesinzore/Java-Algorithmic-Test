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

            count++;
            String[] lst = ss.split("");


            if (Objects.equals(lst[0], "N")){
                //
            } else if (Objects.equals(lst[1], "N")) {
                //
            } else if (Objects.equals(lst[2], "Y")) {
                System.out.println(count);
                System.out.println(Arrays.toString(lst)+"\n");
            }

//            for (int i = 0; i < lst.length; i++){
//                System.out.println(Arrays.toString(lst)+"\n");
//            }


        }

//        System.out.println(count);

    }
}
