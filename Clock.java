/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author 15148
 */
public class Clock {
    private int hr;
    private int min;
    private int sec;

    public Clock() {
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }

    public Clock(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    
    public Clock(Clock clock) {
        this.hr = clock.hr;
        this.min = clock.min;
        this.sec = clock.sec;
    }
    /**
     * To increase the hour by 1
     */
    public void increaseHr() {
        // hr = (hr + 1) % 24;
        hr++;
        if (hr == 24)
            hr = 0;
    }
    /**
     * To increase the minutes by 1
     */
    public void increaseMin() {
        min++;
        if  (min == 60)
            min = 0;
            increaseHr();
    }
    public void increasedSec() {
        sec++;
        if (sec == 60)
            sec = 0;
            increaseMin();
    }
    
    public boolean equals(Clock clock) {
        return this.hr == clock.hr &&
                this.min == clock.min &&
                this.sec == clock.sec;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hr, min, sec);
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    
}