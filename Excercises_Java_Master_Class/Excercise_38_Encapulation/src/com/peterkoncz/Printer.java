package com.peterkoncz;

public class Printer {
   private int tonerLevel;
   private int pagesPrinted;
   private boolean duplex;

  public Printer(int tonerLevel, boolean duplex){
    if(tonerLevel < 0 || tonerLevel > 100){
        tonerLevel = -1;
    }else {
        this.tonerLevel = tonerLevel;
    }
    this.duplex = duplex;
    this.pagesPrinted = 0;
 }

    public int addToner(int tonerAmount){
      if(tonerAmount > 0 && tonerAmount <= 100){
          if (this.tonerLevel + tonerAmount > 100) {
              return -1;
          }else {
             return this.tonerLevel += tonerAmount;
          }
      }
      return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (this.duplex) {
            if(pagesToPrint % 2 == 0) {
                pagesToPrint =(pages / 2);
                this.pagesPrinted += pagesToPrint;
                return pagesToPrint;
            }else {
                return (pages / 2) + pagesToPrint % 2;
            }
        } else {
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getPagesPrinted(){
     return this.pagesPrinted;
    }



}
