package exercises;



import java.util.*;
import java.io.*;
import java.math.*;

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    public class TicTacToe {


        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            String[][] row = new String[3][3];
            boolean print=false;

            for (int i = 0; i < 3; i++) {

                String line = in.nextLine();
                // System.err.println(line);
                row[i][0]=line.substring(0,1);
                row[i][1]=line.substring(1,2);
                row[i][2]=line.substring(2,3);
            }

            if(!row[0][0].equals(".") && row[0][0].equals(row[0][1]) && row[0][2].equals(".")){
                row[0][2]=row[0][0];
                // System.err.println("fssdfsfs"+row[0]+""+row[1]+""+row[2]);

//check rows
            }else if(!row[0][0].equals(".") && row[0][0].equals(row[0][2])&&row[0][1].equals(".")){
                row[0][1]=row[0][0];
//check row 1
            }else if(!row[1][0].equals(".") &&row[1][0].equals(row[1][1])&&row[1][2].equals(".")){
                row[1][2]=row[1][0];
            }else if(!row[1][0].equals(".") &&row[1][0].equals(row[1][2])&&row[1][1].equals(".")){
                row[1][1]=row[1][0];
//check row2
            }else if(!row[2][0].equals(".") &&row[2][0].equals(row[2][1])&&row[2][2].equals(".")){
                row[2][2]=row[2][0];
            }else if(!row[2][0].equals(".") &&row[2][0].equals(row[2][2])&&row[2][1].equals(".")){
                row[2][1]=row[2][2];



//check col 0
            }else if(!row[0][0].equals(".") &&row[0][0].equals(row[1][0])&&row[2][0].equals(".")){
                row[2][0]=row[0][0];
            }else if(!row[0][0].equals(".") &&row[0][0].equals(row[2][0])&&row[1][0].equals(".")){
                row[1][0]=row[0][0];
                //System.err.println("fssdfsfs"+row[0]+""+row[1]+""+row[2]);
//check col 1
            }else if(!row[0][1].equals(".") &&row[0][1].equals(row[1][1])&&row[2][1].equals(".")){
                row[2][1]=row[0][1];
            }else if(!row[0][1].equals(".") &&row[0][1].equals(row[2][1])&&row[1][1].equals(".")){
                row[1][1]=row[0][1];
//check col2
            }else if(!row[0][2].equals(".") &&row[0][2].equals(row[1][2])&&row[2][2].equals(".")){
                row[2][2]=row[0][2];
            }else if(!row[0][2].equals(".") &&row[0][2].equals(row[2][2])&&row[1][2].equals(".")){
                row[1][2]=row[0][2];
//check diagonal
            }else if(!row[0][0].equals(".") &&row[0][0].equals(row[2][2])&&row[1][1].equals(".")){
                row[1][1]=row[0][0];
            }else if(!row[2][0].equals(".") &&row[2][0].equals(row[0][2])&&row[1][1].equals(".")){
                row[1][1]=row[2][0];
            }else if(!row[0][0].equals(".") &&row[0][0].equals(row[1][1])&&row[2][2].equals(".")){
                row[2][2]=row[0][0];
            }else if(!row[0][2].equals(".") &&row[0][2].equals(row[1][1])&&row[2][0].equals(".")){
                row[2][0]=row[0][2];
            }
            else{
                print=true;
            }

            if(print){
                System.out.println("false");

            }  else{
                for(int i =0;i<row.length;i++){
                    System.out.println(row[i][0]+row[i][1]+row[i][2]);
                }

            }

        }
    }

