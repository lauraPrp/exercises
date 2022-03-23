package org.laura.exercise;

public class BowlingKata {
    private boolean isStrike;
    private boolean isSpare;

    public int randomNumberSmallerthan10(int pins) {
        return knockPins(pins);
        // 10 lines/frames, 2 rounds each
       /* for(int i=0;i<10;i++){
            //10 frames
            int pinsAvailable =10;
            for(int y=0;y<2;i++){
                pinsAvailable = knockPins(pinsAvailable);
            }

        }

              int pinNumberKnocked = 0;
        return 1;*/
    }



    private int knockPins(int max) {
       int min=0;
        int randomValue =0;
             randomValue = (int) (Math.random()*(max-min)) + min;
            System.out.println(randomValue);
        return max-randomValue;
    }
/*Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
In each frame, the bowler gets up to two tries to knock down all 10 pins.
If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
If in two tries he knocks them all down,
this is called a “spare” and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
If on his first try in the frame he knocks down all the pins, this is called a “strike”.
His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively.
These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
The game score is the total of all frame scores.*/

}
