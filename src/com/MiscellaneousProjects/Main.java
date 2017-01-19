package com.MiscellaneousProjects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter in your initial: ");
        //char myLetter = scanner.next().charAt(0);
        String myinitstring = scanner.next();

        if(myinitstring.length() >3 || myinitstring.toUpperCase().matches("[^A-Z]"))
        {
            System.out.println("Too many or invalid initials... Please try again");

        }
        else {

            char[] myinits = myinitstring.toUpperCase().toCharArray();
            for(int row=1; row<10; row++) {
                String myrowstr="";
                for (char init : myinits) {
                    switch (init) {

                        case 'A':
                            myrowstr = myrowstr + "   " + printLetterA(row);
                            break;
                        case 'B':
                            myrowstr = myrowstr + "   " + printLetterB(row);
                            break;
                        case 'C':
                            myrowstr = myrowstr + "   " + printLetterC(row);
                            break;
                        case 'D':
                            myrowstr = myrowstr + "   " + printLetterD(row);
                            break;
                        case 'E':
                            myrowstr = myrowstr + "   " + printLetterE(row);
                            break;
                        case 'F':
                            myrowstr = myrowstr + "   " + printLetterF(row);
                            break;
                        case 'G':
                            myrowstr = myrowstr + "   " + printLetterG(row);
                            break;
                        case 'H':
                            myrowstr = myrowstr + "   " + printLetterH(row);
                            break;
                        case 'I':
                            myrowstr = myrowstr + "   " + printLetterI(row);
                            break;
                        case 'J':
                            myrowstr = myrowstr + "   " + printLetterJ(row);
                            break;
                        case 'K':
                            myrowstr = myrowstr + "   " + printLetterK(row);
                            break;
                        case 'L':
                            myrowstr = myrowstr + "   " + printLetterL(row);
                            break;
                        case 'M':
                            myrowstr = myrowstr + "   " + printLetterM(row);
                            break;
                        case 'N':
                            myrowstr = myrowstr + "   " + printLetterN(row);
                            break;
                        case 'O':
                            myrowstr = myrowstr + "   " + printLetterO(row);
                            break;
                        case 'P':
                            myrowstr = myrowstr + "   " + printLetterP(row);
                            break;
                        case 'Q':
                            myrowstr = myrowstr + "   " + printLetterQ(row);
                            break;
                        case 'R':
                            myrowstr = myrowstr + "   " + printLetterR(row);
                            break;
                        case 'S':
                            myrowstr = myrowstr + "   " + printLetterS(row);
                            break;
                        case 'T':
                            myrowstr = myrowstr + "   " + printLetterT(row);
                            break;
                        case 'U':
                            myrowstr = myrowstr + "   " + printLetterU(row);
                            break;
                        case 'V':
                            myrowstr = myrowstr + "   " + printLetterV(row);
                            break;
                        case 'W':
                            myrowstr = myrowstr + "   " + printLetterW(row);
                            break;
                        case 'X':
                            myrowstr = myrowstr + "   " + printLetterX(row);
                            break;
                        case 'Y':
                            myrowstr = myrowstr + "   " + printLetterY(row);
                            break;
                        case 'Z':
                            myrowstr = myrowstr + "   " + printLetterZ(row);
                            break;
                        default:
                            System.out.println("Not able to process.. try again");
                            break;
                    }
                }
                System.out.println(myrowstr);
            }
        }

    }

    public static String printLine (int[] myarray){
        String myformattedstr="";
        int min=myarray[0];
        int max=myarray[myarray.length-1];
        //boolean found=false;
        //System.out.println("MIN: " + min + " MAX: " + max);
        for (int i=0;i<13;i++){
            boolean found=false;
            if(i<min || i>max){
                myformattedstr = myformattedstr + ' ';
            }
            else {
                for (int j = 0; j < myarray.length; j++) {
                    if (i == myarray[j]) {
                        myformattedstr = myformattedstr + '*';
                        //System.out.println("FOUND position match , i, value at j: " + i + " , " + myarray[j]);
                        found=true;
                    }
                }
                if(!found){
                    myformattedstr = myformattedstr + ' ';
                    found=false;
                }
            }
        }

        //System.out.println(myformattedstr);
        return(myformattedstr);

    }

    public static String printLetterA (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{6});
            case 2:
                return printLine(new int[]{5,6,7});

            case 3:
                return printLine(new int[]{4,5,7,8});

            case 4:
                return printLine(new int[]{3,4,8,9});

            case 5:
                return printLine(new int[]{2,3,9,10});

            case 6:
                return printLine(new int[]{1,2,3,4,5,6,7,8,9,10,11});

            case 7:
                return printLine(new int[]{0,1,11,12});

            case 8:
                return printLine(new int[]{0,12});

            case 9:
                return printLine(new int[]{0,12});

        }
        return "";
    }

    public static String printLetterB (int lineno){
        //first line is 13 *

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,1,2,3,4,5,6});

            case 2:
                return printLine(new int[]{0,1,6,7});

            case 3:
                return printLine(new int[]{0,1,6,7});

            case 4:
                return printLine(new int[]{0,1,6,7});

            case 5:
                return printLine(new int[]{0, 1,2,3,4,5,6});

            case 6:
                return printLine(new int[]{0,1,6,7});

            case 7:
                return printLine(new int[]{0,1,6,7});

            case 8:
                return printLine(new int[]{0,1,6,7});

            case 9:
                return printLine(new int[]{0,1,2,3,4,5,6});

        }
        return "";
    }

    public static String printLetterC (int lineno){
        //first line is 13 *

        switch(lineno) {

            case 1:
                return printLine(new int[]{5, 6, 7, 8, 9, 10, 11});

            case 2:
                return printLine(new int[]{2, 3});

            case 3:
                return printLine(new int[]{1, 2});

            case 4:
                return printLine(new int[]{0, 1});

            case 5:
                return printLine(new int[]{0, 1});

            case 6:
                return printLine(new int[]{0, 1});

            case 7:
                return printLine(new int[]{1, 2});

            case 8:
                return printLine(new int[]{2, 3});

            case 9:
                return printLine(new int[]{5, 6, 7, 8, 9, 10, 11});

        }
        return "";
    }

    public static String printLetterD (int lineno){
        //first line is 13 *
        switch(lineno) {

            case 1:
                return printLine(new int[]{0, 1, 2, 3, 4, 5});
            case 2:
                return printLine(new int[]{0, 1, 6, 7});
            case 3:
                return printLine(new int[]{0, 1, 6, 7});
            case 4:
                return printLine(new int[]{0, 1, 7, 8});
            case 5:
                return printLine(new int[]{0, 1, 7, 8});
            case 6:
                return printLine(new int[]{0, 1, 7, 8});
            case 7:
                return printLine(new int[]{0, 1, 6, 7});
            case 8:
                return printLine(new int[]{0, 1, 6, 7});
            case 9:
                return printLine(new int[]{0, 1, 2, 3, 4, 5});
        }
        return "";

    }
    public static String  printLetterE (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
            case 2:
                return printLine(new int[]{0, 1});
            case 3:
                return printLine(new int[]{0, 1});
            case 4:
                return printLine(new int[]{0, 1});
            case 5:
                return printLine(new int[]{0, 1, 2, 3, 4, 5});
            case 6:
                return printLine(new int[]{0, 1});
            case 7:
                return printLine(new int[]{0, 1});
            case 8:
                return printLine(new int[]{0, 1});
            case 9:
                return printLine(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
        }
    return "";
    }

    public static String  printLetterF (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
            case 2:
                return printLine(new int[]{0, 1});
            case 3:
                return printLine(new int[]{0, 1});
            case 4:
                return printLine(new int[]{0, 1});
            case 5:
                return printLine(new int[]{0, 1, 2, 3, 4, 5});
            case 6:
                return printLine(new int[]{0, 1});
            case 7:
                return printLine(new int[]{0, 1});
            case 8:
                return printLine(new int[]{0, 1});
            case 9:
                return printLine(new int[]{0, 1});
        }
        return "";
    }

    public static String  printLetterG (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{1, 2, 3, 4, 5, 6,7,8});
            case 2:
                return printLine(new int[]{0, 1});
            case 3:
                return printLine(new int[]{0, 1});
            case 4:
                return printLine(new int[]{0, 1});
            case 5:
                return printLine(new int[]{0, 1, 5,6,7});
            case 6:
                return printLine(new int[]{0, 1,7,8});
            case 7:
                return printLine(new int[]{0, 1,7,8});
            case 8:
                return printLine(new int[]{0, 1,7,8});
            case 9:
                return printLine(new int[]{1, 2, 3, 4, 5, 6,7,8});
        }
        return "";
    }

    public static String  printLetterH (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,1,6,7});
            case 2:
                return printLine(new int[]{0,1,6,7});
            case 3:
                return printLine(new int[]{0,1,6,7});
            case 4:
                return printLine(new int[]{0,1,6,7});
            case 5:
                return printLine(new int[]{0, 1, 2,3,4,5,6,7});
            case 6:
                return printLine(new int[]{0,1,6,7});
            case 7:
                return printLine(new int[]{0,1,6,7});
            case 8:
                return printLine(new int[]{0,1,6,7});
            case 9:
                return printLine(new int[]{0,1,6,7});
        }
        return "";
    }

    public static String  printLetterI (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0, 1, 2,3,4,5,6,7,8,9,10,11,12,13});
            case 2:
                return printLine(new int[]{6,7});
            case 3:
                return printLine(new int[]{6,7});
            case 4:
                return printLine(new int[]{6,7});
            case 5:
                return printLine(new int[]{6,7});
            case 6:
                return printLine(new int[]{6,7});
            case 7:
                return printLine(new int[]{6,7});
            case 8:
                return printLine(new int[]{6,7});
            case 9:
                return printLine(new int[]{0, 1, 2,3,4,5,6,7,8,9,10,11,12,13});
        }
        return "";
    }

    public static String  printLetterJ (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
            case 2:
                return printLine(new int[]{8, 9});
            case 3:
                return printLine(new int[]{8, 9});
            case 4:
                return printLine(new int[]{8, 9});
            case 5:
                return printLine(new int[]{8, 9});
            case 6:
                return printLine(new int[]{0, 1, 8, 9});
            case 7:
                return printLine(new int[]{1, 2, 8, 9});
            case 8:
                return printLine(new int[]{2, 3, 7, 8});
            case 9:
                return printLine(new int[]{3, 4, 5, 6});
        }
        return "";
    }
    public static String  printLetterK (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0, 1, 5,6});
            case 2:
                return printLine(new int[]{0,1,4,5});
            case 3:
                return printLine(new int[]{0,1,3,4});
            case 4:
                return printLine(new int[]{0,1,2,3});
            case 5:
                return printLine(new int[]{0,1});
            case 6:
                return printLine(new int[]{0,1,2,3});
            case 7:
                return printLine(new int[]{0,1,3,4});
            case 8:
                return printLine(new int[]{0,1,4,5});
            case 9:
                return printLine(new int[]{0,1,5,6});
        }
        return "";
    }
    public static String  printLetterL (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0, 1});
            case 2:
                return printLine(new int[]{0, 1});
            case 3:
                return printLine(new int[]{0, 1});
            case 4:
                return printLine(new int[]{0, 1});
            case 5:
                return printLine(new int[]{0,1});
            case 6:
                return printLine(new int[]{0, 1});
            case 7:
                return printLine(new int[]{0, 1});
            case 8:
                return printLine(new int[]{0,1,2,3,4,5,6,7,8,9});
            case 9:
                return printLine(new int[]{0,1,2,3,4,5,6,7,8,9});
        }
        return "";
    }

    public static String  printLetterM (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0, 1,2,10,11,12});
            case 2:
                return printLine(new int[]{0,1,2,3,9,10,11,12});
            case 3:
                return printLine(new int[]{0, 1,3,4,8,9,11,12});
            case 4:
                return printLine(new int[]{0, 1,4,5,6,7,11,12});
            case 5:
                return printLine(new int[]{0,1,5,6,7,11,12});
            case 6:
                return printLine(new int[]{0, 1,11,12});
            case 7:
                return printLine(new int[]{0, 1,11,12});
            case 8:
                return printLine(new int[]{0, 1,11,12});
            case 9:
                return printLine(new int[]{0, 1,11,12});
        }
        return "";
    }
    public static String  printLetterN (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,1,2,9,10});
            case 2:
                return printLine(new int[]{0,1,2,3,9,10});
            case 3:
                return printLine(new int[]{0, 1,3,4,9,10});
            case 4:
                return printLine(new int[]{0, 1,4,5,9,10});
            case 5:
                return printLine(new int[]{0,1,5,6,9,10});
            case 6:
                return printLine(new int[]{0,1,6,7,9,10});
            case 7:
                return printLine(new int[]{0, 1,7,8,9,10});
            case 8:
                return printLine(new int[]{0, 1,8,9,10});
            case 9:
                return printLine(new int[]{0, 1,9,10});
        }
        return "";
    }
    public static String  printLetterO (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{2,3,4,5,6,7,8});
            case 2:
                return printLine(new int[]{1,9});
            case 3:
                return printLine(new int[]{0, 1,9,10});
            case 4:
                return printLine(new int[]{0, 1,9,10});
            case 5:
                return printLine(new int[]{0, 1,9,10});
            case 6:
                return printLine(new int[]{0, 1,9,10});
            case 7:
                return printLine(new int[]{0, 1,9,10});
            case 8:
                return printLine(new int[]{1,9});
            case 9:
                return printLine(new int[]{2,3,4,5,6,7,8});
        }
        return "";
    }

    public static String  printLetterP (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,1,2,3,4,5,6});
            case 2:
                return printLine(new int[]{0,1,7});
            case 3:
                return printLine(new int[]{0,1,7});
            case 4:
                return printLine(new int[]{0,1,7});
            case 5:
                return printLine(new int[]{0,1,2,3,4,5,6});
            case 6:
                return printLine(new int[]{0, 1});
            case 7:
                return printLine(new int[]{0,1});
            case 8:
                return printLine(new int[]{0,1});
            case 9:
                return printLine(new int[]{0,1});
        }
        return "";
    }

    public static String  printLetterQ (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{2,3,4,5,6,7,8});
            case 2:
                return printLine(new int[]{1,9});
            case 3:
                return printLine(new int[]{0, 1,9,10});
            case 4:
                return printLine(new int[]{0, 1,9,10});
            case 5:
                return printLine(new int[]{0, 1,9,10});
            case 6:
                return printLine(new int[]{0, 1,6,9,10});
            case 7:
                return printLine(new int[]{0, 1,7,9,10});
            case 8:
                return printLine(new int[]{1,8,9,10,11,12});
            case 9:
                return printLine(new int[]{2,3,4,5,6,7,8});
        }
        return "";
    }

    public static String  printLetterR (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,1,2,3,4,5,6});
            case 2:
                return printLine(new int[]{0,1,6});
            case 3:
                return printLine(new int[]{0,1,6});
            case 4:
                return printLine(new int[]{0,1,6});
            case 5:
                return printLine(new int[]{0,1,2,3,4,5});
            case 6:
                return printLine(new int[]{0,3});
            case 7:
                return printLine(new int[]{0, 1,4});
            case 8:
                return printLine(new int[]{0, 1,5});
            case 9:
                return printLine(new int[]{0, 1,6});
        }
        return "";
    }

    public static String  printLetterS (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,1,2,3,4,5,6});
            case 2:
                return printLine(new int[]{0,1});
            case 3:
                return printLine(new int[]{0,1});
            case 4:
                return printLine(new int[]{0,1});
            case 5:
                return printLine(new int[]{0,1,2,3,4,5,6});
            case 6:
                return printLine(new int[]{5,6});
            case 7:
                return printLine(new int[]{5,6});
            case 8:
                return printLine(new int[]{5,6});
            case 9:
                return printLine(new int[]{0,1,2,3,4,5,6});
        }
        return "";
    }

    public static String  printLetterT (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13});
            case 2:
                return printLine(new int[]{6,7});
            case 3:
                return printLine(new int[]{6,7});
            case 4:
                return printLine(new int[]{6,7});
            case 5:
                return printLine(new int[]{6,7});
            case 6:
                return printLine(new int[]{6,7});
            case 7:
                return printLine(new int[]{6,7});
            case 8:
                return printLine(new int[]{6,7});
            case 9:
                return printLine(new int[]{6,7});
        }
        return "";
    }
    public static String  printLetterU (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,1,8,9});
            case 2:
                return printLine(new int[]{0,1,8,9});
            case 3:
                return printLine(new int[]{0,1,8,9});
            case 4:
                return printLine(new int[]{0,1,8,9});
            case 5:
                return printLine(new int[]{0,1,8,9});
            case 6:
                return printLine(new int[]{0,1,8,9});
            case 7:
                return printLine(new int[]{0,1,8,9});
            case 8:
                return printLine(new int[]{0,1,8,9});
            case 9:
                return printLine(new int[]{1,2,3,4,5,6,7,8});
        }
        return "";
    }
    public static String  printLetterV (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,12});
            case 2:
                return printLine(new int[]{0,12});
            case 3:
                return printLine(new int[]{1,11});
            case 4:
                return printLine(new int[]{1,11});
            case 5:
                return printLine(new int[]{2,10});
            case 6:
                return printLine(new int[]{2,3,9,10});
            case 7:
                return printLine(new int[]{3,4,8,9});
            case 8:
                return printLine(new int[]{4,5,6,7,8});
            case 9:
                return printLine(new int[]{5,6,7});
        }
        return "";
    }

    public static String  printLetterW (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{1,11});
            case 2:
                return printLine(new int[]{1,11});
            case 3:
                return printLine(new int[]{0,1,10,11});
            case 4:
                return printLine(new int[]{1,10});
            case 5:
                return printLine(new int[]{1,2,9,10});
            case 6:
                return printLine(new int[]{2,9});
            case 7:
                return printLine(new int[]{2,3,5,6,8,9});
            case 8:
                return printLine(new int[]{3,5,6,8});
            case 9:
                return printLine(new int[]{3,4,7,8});
        }
        return "";
    }

    public static String  printLetterX (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,8});
            case 2:
                return printLine(new int[]{0,1,7,8});
            case 3:
                return printLine(new int[]{1,2,6,7});
            case 4:
                return printLine(new int[]{2,3,5,6});
            case 5:
                return printLine(new int[]{3,4,5});
            case 6:
                return printLine(new int[]{2,3,5,6});
            case 7:
                return printLine(new int[]{1,2,6,7});
            case 8:
                return printLine(new int[]{0,1,7,8});
            case 9:
                return printLine(new int[]{0,8});
        }
        return "";
    }
    public static String  printLetterY (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,1,8,9});
            case 2:
                return printLine(new int[]{1,2,7,8});
            case 3:
                return printLine(new int[]{2,3,6,7});
            case 4:
                return printLine(new int[]{3,5});
            case 5:
                return printLine(new int[]{4,5});
            case 6:
                return printLine(new int[]{4,5});
            case 7:
                return printLine(new int[]{4,5});
            case 8:
                return printLine(new int[]{4,5});
            case 9:
                return printLine(new int[]{4,5});
        }
        return "";
    }
    public static String  printLetterZ (int lineno){

        switch(lineno) {

            case 1:
                return printLine(new int[]{0,1,2,3,4,5,6,7,8});
            case 2:
                return printLine(new int[]{7,8});
            case 3:
                return printLine(new int[]{6,7});
            case 4:
                return printLine(new int[]{5,6});
            case 5:
                return printLine(new int[]{4,5});
            case 6:
                return printLine(new int[]{3,4});
            case 7:
                return printLine(new int[]{2,3});
            case 8:
                return printLine(new int[]{1,2});
            case 9:
                return printLine(new int[]{0,1,2,3,4,5,6,7,8});
        }
        return "";
    }
}
