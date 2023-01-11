package org.benjaminsinzore.schools.hackerrank;

import java.util.*;

public class HackerRanks {

    public static void main(String[] args){

//        projectManager(feedProjectManagerList());


//       new HackerRanks().getMyHash(testMyHashMap());

        System.out.println(new HackerRanks().findConsistentSubstring("bbb"));


//        System.out.println(new HackerRanks().testThis("Benjamin"));
    }

    /*
        Create a function that will return the most consecutive days all employees attended

     */
    @NotNull
    public  static  List<String> feedProjectManagerList(){


        List<String> list = new ArrayList<>();
        list.add("YYY");
        list.add("YYY");
        list.add("YYY");
        list.add("YYY");
        list.add("YYY");
        list.add("YYY");
        list.add("YNY");
        return list;
    }

    public static void projectManager(List<String> list){

        StringBuilder myStr = new StringBuilder();
        StringBuilder myStrFin = new StringBuilder();
        StringBuilder sS = new StringBuilder();
        StringBuilder fin = new StringBuilder();
        StringBuilder SubFin = new StringBuilder();


        int count = 0;
        for (String ss : list){

            count++;
            String[] lst = ss.split("");
            if ("Y".equals(lst[0]) && "Y".equals(lst[1]) && "Y".equals(lst[2])) sS.append(count);
        }


        String[] mySs = sS.toString().split("");
        int[] newInt = new int[mySs.length];
        int i = 0;
        for (String myInt : mySs){

            newInt[i] = Integer.parseInt(myInt);
            i++;
        }


        int k = 1;
        for (int value : newInt) {

            if (k < newInt.length) if (value + 1 == newInt[k] && newInt[k] - 1 == value) myStr.append(value).append(newInt[k]);
            k++;
        }


        String[] lst = myStr.toString().split("");
        for (int jj = 0; jj < lst.length; jj++) {

            if (jj == lst.length - 1) myStrFin.append(lst[lst.length-1]);

            if (!(jj+1 == lst.length)) if (!(lst[jj].equals(lst[jj+1]))) myStrFin.append(lst[jj]);

        }


        System.out.println(myStrFin);
        String[] myStk = myStrFin.toString().split("");
        int myCo = 1;
        SubFin.append(myStk[0]);
        for (String kk: myStk) {

            if (myCo == myStk.length) System.out.println(kk);

            if ((myCo < myStk.length)){

                int myKK = Integer.parseInt(kk);
                int mySko = Integer.parseInt(myStk[myCo]);
                if (myKK + 1 == mySko){

                    System.out.println(kk);
                    String[] myAt = SubFin.toString().split("");
                    int myL;
                    if (myAt.length > 1){

                        myL = myAt.length - 1;
                        int myKk = Integer.parseInt(myAt[myL]);

                        if (!( myKk == myKK)) SubFin.append(myKK);
                    }

                }

            }
            myCo++;

        }
        System.out.println(SubFin + " sub");



        String[] myStt = myStrFin.toString().split("");
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
                    fin.append("Sunday ");
                    break;
            }
        }
        System.out.println(fin);

    }

//    public int findConsistentSubstring(String s) {
//        int maxLength = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int length = 1;
//            for (int j = i + 1; j < s.length(); j++) {
//                if (s.charAt(j) == s.charAt(j - 1)) {
//                    length++;
//                } else {
//                    break;
//                }
//            }
//            maxLength = Math.max(maxLength, length);
//        }
//        return maxLength;
//    }


    public int testThis(String sS){
        int maxLength = 0;
        int i = 0;
        do {
            String[] st = sS.split("");
            System.out.print(st[i]);
            i++;
        } while (i < sS.length());

        return maxLength;
    }



    public int findConsistentSubstring(String s) {
        int maxLength = 0;
        int i = 0;
        do {
            int length = 1;
            int j = 1;
            do {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    length++;
                } else {
                    break;
                }
                j++;
            } while (j < s.length());

            maxLength = Math.max(maxLength, length);
            i++;
        } while (i < s.length());

        return maxLength;

    }

    public static HashMap<Integer, String> testMyHashMap() {

        Hashtable<Integer, String> tb = new Hashtable<>();
        HashMap<Integer, String> hush = new HashMap<>();
        HashSet<String> st = new HashSet<>();

        hush.put(1, "YYY");
        hush.put(2, "YYY");
        hush.put(3, "YYN");
        hush.put(4, "NYY");
        hush.put(5, "YYY");
        hush.put(6, "YYY");
        hush.put(7, "YYY");
        return hush;
    }


    public void getMyHash(HashMap<Integer, String> hush){

//        int num = 1;
//        for (int i = 0; i < hush.size(); i++) {
//
//            String mySt = hush.get(num);
//            System.out.println(mySt);
//            num++;
//        }


        int num = 1;
        for (String mySt : hush.values()) {

            System.out.println(mySt);
            num++;
        }



    }



}
