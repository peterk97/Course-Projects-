package com.timbuchalka;

/**
 * Created by keanehubertang on 8/3/15.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //functions// if you chang the getters to be [private] then you can create internal excess with [public functions]!!
    public void powerUp (){
        getTheCase().pressPowerButton();
        drawLogo();
    }

    public void powerUpAnotherWay(){
        theCase.pressPowerButton(); //this case you do not even need the getters !!!! because you access the class another way !!!
        drawLogo();
    }


    // methods
    private void drawLogo(){
        getMonitor().drawPixelAt(1200,50,"yellow");
    }

    //Getters// if you use the internal functions you do not even need getters
    private Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
