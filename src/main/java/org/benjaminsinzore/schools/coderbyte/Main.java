package org.benjaminsinzore.schools.coderbyte;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Main {

    /*
        Array Challenge
        Have the function ArrayChallenge(strArr) read the strArr parameter being passed which will represent a full day and will be filled with events that span from time X to time Y in the day. The format of each event will be hh:mmAM/PM-hh:mmAM/PM. For example, strArr may be ["10:00AM-12:30PM","02:00PM-02:45PM","09:10AM-09:50AM"]. Your program will have to output the longest amount of free time available between the start of your first event and the end of your last event in the format: hh:mm. The start event should be the earliest event in the day and the latest event should be the latest event in the day. The output for the previous input would therefore be 01:30 (with the earliest event in the day starting at 09:10AM and the latest event ending at 02:45PM). The input will contain at least 3 events and the events may be out of order.
        Once your function is working, take the final output string and concatenate it with your ChallengeToken, and then replace every third character with an X.

        Your ChallengeToken: u49jayecnf1
        Examples
        Input: new String[] {"12:15PM-02:00PM","09:00AM-10:00AM","10:30AM-12:00PM"}
        Output: 00:30
        Final Output: 00X30X49XayXcnX1
        Input: new String[] {"12:15PM-02:00PM","09:00AM-12:11PM","02:02PM-04:00PM"}
        Output: 00:04
        Final Output: 00X04X49XayXcnX1
     */
    public static String ArrayChallenge(String[] strArr) {
        // code goes here

        LocalTime sT = LocalTime.MAX;
        LocalTime eD = LocalTime.MIN;
        LocalTime[] tS = new LocalTime[strArr.length * 2];

        for (int i = 0; i < strArr.length; i++){

            String[] sP = strArr[i].split("-");

            DateTimeFormatter fd =
                    DateTimeFormatter.ofPattern("hh:mm a");

            // System.out.println(spaceMySt(sP[0]));
            LocalTime stT = LocalTime.parse( spaceMySt(sP[0]), fd);
            LocalTime edT = LocalTime.parse( spaceMySt(sP[1]), fd);


            tS[i * 2] = stT;
            tS[i * 2 + 1] = edT;

            sT = stT.isBefore(sT) ? stT : sT;
            eD = edT.isAfter(eD) ? edT : eD;


        }

        LocalTime myFT = LocalTime.MIN;
        LocalTime pV = sT;

        for (LocalTime t : tS) {

            if (pV.isBefore(t)) {
                LocalTime fT = LocalTime.of(t.getHour() - pV.getHour(),
                        t.getMinute() - pV.getMinute());

                myFT = fT.isAfter(myFT) ? fT : myFT;
            }

            pV = t;
        }

        String fTS = myFT.toString().replace(":", "");
        String tK = "u49jayecnf1";
        String fS = fTS + tK;

        for (int i = 2; i < fS.length(); i += 3) {
            fS = fS.substring(0, i) + "X" + fS.substring(i + 1);
        }

        return fS;
    }

    public static String spaceMySt(String st){

        StringBuilder sb = new StringBuilder();

        String[] ss = st.split(":");
        sb.append(ss[0]);
        String[] sS = ss[1].split("");
        sb.append(":");
        sb.append(sS[0]);
        sb.append(sS[1]);
        sb.append(" ");
        sb.append(sS[2]);
        sb.append(sS[3]);

        return sb.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        String[] s = new String[] {"12:15PM-02:00PM","09:00AM-10:00AM","10:30AM-12:00PM"};

        System.out.print(ArrayChallenge(s));
    }

}
