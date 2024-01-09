/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotifymain;

/**
 *
 * @author shabossova
 */
public class Cas {
    
    private int minuty;
    private int sekundy;

    public Cas(int minuty, int sekundy) {
        this.minuty = minuty;
        this.sekundy = sekundy;
    }

    public int getMinuty() {
        return minuty;
    }

    public int getSekundy() {
        return sekundy;
    }

    public int prevedNaSekundy() {
        return minuty * 60 + sekundy;
    }

    @Override
    public String toString() {
        return minuty + ":" + sekundy;
    }
}

    

