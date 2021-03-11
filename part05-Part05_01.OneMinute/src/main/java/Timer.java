/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Timer {
    private ClockHand hundredOfASecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredOfASecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredOfASecond.advance();

        if (this.hundredOfASecond.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundredOfASecond;
    }
}
