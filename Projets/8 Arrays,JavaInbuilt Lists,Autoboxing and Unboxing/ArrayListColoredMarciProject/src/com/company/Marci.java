package com.company;

public class Marci {
   private String marciColor;
    private String marciId;

    public Marci(String marciColor, String marciId) {
        this.marciColor = marciColor;
        this.marciId = marciId;
    }


    public String getMarciColor() {
        return marciColor;
    }

    public String getMarciId() {
        return marciId;
    }

    public static Marci createMarci (String color, String Id){
      return new Marci(color,Id);
    }
}
