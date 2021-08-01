package com.company;

public class MobilPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean powerOn = false;

    public MobilPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        powerOn = true;
        System.out.println("Phone powered up");
    }

    @Override
    public void dial(int number) {
        if (powerOn) {
            System.out.println("Now ringing " + number + " On Mobile phone");
        }else {
            System.out.println("Phone is Off");
        }
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the Mobile Phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int number) {
        if (number == myNumber && powerOn){
            isRinging = true;
            System.out.println("Melody Ring");
        }else {
            isRinging = false;
            System.out.println("Mobile is off or Wrong number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
