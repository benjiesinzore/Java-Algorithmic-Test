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
        list.add("YYY");
        list.add("YNN");
        list.add("NNY");
        list.add("NYY");
        list.add("YYY");
        list.add("YYY");
        list.add("YYY");
        return list;
    }

    public static void projectManager(List<String> list){

        int count = 0;
        StringBuilder sS = new StringBuilder();
        for (String ss : list){

            count++;
            String[] lst = ss.split("");

            if ("Y".equals(lst[0]) && "Y".equals(lst[1]) && "Y".equals(lst[2])) {

                sS.append(count);
            }

        }

        String[] mySs = sS.toString().split("");

        int[] newInt = new int[mySs.length];
        int i = 0;
        for (String myInt : mySs){
            newInt[i] = Integer.parseInt(myInt);
            i++;
        }

        StringBuilder myStr = new StringBuilder();
        for (int value : newInt) {

            for (int k = 1; k < newInt.length; k++) {


                if (value + 1 == newInt[k]) {

                    myStr.append(value);
                }

            }

        }

        if (newInt[newInt.length-1] -1 == newInt[newInt.length-2]){
            myStr.append(newInt[newInt.length-1]);
        }


        String[] myStt = myStr.toString().split("");
        StringBuilder fin = new StringBuilder();
        for (String st: myStt) {
            switch (st){
                case "1":
                    fin.append("Monday ");
                    break;
                case "2":
                    fin.append("Tuesday ");
                    break;
                case "3":
                    fin.append("Wednesday ");
                    break;
                case "4":
                    fin.append("Thursday ");
                    break;
                case "5":
                    fin.append("Friday ");
                    break;
                case "6":
                    fin.append("Saturday ");
                    break;
                case "7":
                    fin.append("Sunday");
                    break;
            }
        }

        System.out.println(fin);

    }
}
