package com.company;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int number) {
        System.out.println("Now ringing " + number + " On desk phone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the desk Phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int number) {
        if (number == myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
