public class Printer {

    private double sheetsLeft;


    public Printer(){
        this.sheetsLeft = 100;
    }

    public double getSheetsLeft() {
        return sheetsLeft;
    }

    public void setSheetsLeft(double sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public void print(double pages, double copies){
        this.sheetsLeft -= pages * copies;
    }

}
