package com.company;

public class Tv {
    private int screen;
    private int body;
    private String tvModel;

    private boolean currentPower;
    private String currentChannel;

    public Tv(int screen, int body, String tvModel) {
        this.screen = screen;
        this.body = body;
        this.tvModel = tvModel;

        this.currentPower = false;
        this.currentChannel = "Power is off!";

    }

    public void power(boolean currentPower){
        System.out.println("Tv.power() called");

        if (currentPower){
            System.out.println("Tv is on!");
            this.currentPower = true;
        }else{
            System.out.println("Tv is off!");
            this.currentPower = false;
        }

    }

    public void channel(String currentChannel) {
        System.out.println("Tv.channel() called");
        if (!currentPower) {
            System.out.println("You must turn on Tv first!");
        } else {
            System.out.println("Tv channel set to: " + currentChannel);
        }
    }

    public int getScreen() {
        return screen;
    }

    public int getBody() {
        return body;
    }

    public String getTvModel() {
        return tvModel;
    }
}
