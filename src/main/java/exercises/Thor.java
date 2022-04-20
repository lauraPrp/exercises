package exercises;


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
public class Thor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if (initialTx < lightX) {
                System.out.println("E");
                initialTx++;
            } else if (initialTx > lightX) {
                System.out.println("W");
                initialTx--;
            }
            if (initialTy < lightY) {
                System.out.println("S");
                initialTy++;
            } else if (initialTy > lightY) {
                System.out.println("N");
                initialTy--;
            }


            // A single line providing the move to be made: N NE E SE S SW W or NW
            //  System.out.println("E");
        }
    }
}

    /* public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringBuilder Lr = new StringBuilder(), Rl = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String line = in.next();
            Lr.append(line.charAt(i));
            Rl.append(line.charAt((N-1)-i));
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        Lr.append(" ").append(Rl);

        System.out.println(Lr);
    }*/