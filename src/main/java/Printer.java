public class Printer {

    private double sheetsLeft;
    private double toner;


    public Printer(){
        this.sheetsLeft = 100;
        this.toner = 150;
    }

    public double getSheetsLeft() {
        return sheetsLeft;
    }

    public void setSheetsLeft(double sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public double getToner() {
        return toner;
    }

    public void setToner(double toner) {
        this.toner = toner;
    }

    public void print(double pages, double copies){
       if (this.sheetsLeft >= pages * copies && this.toner >= pages * copies) {
            this.sheetsLeft -= pages * copies;
            this.toner -= pages * copies;
       }
    }

}
