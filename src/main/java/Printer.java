public class Printer {

    private double sheetsLeft;
    private double toner;
    private double pages;
    private double copies;


    public Printer(){
        this.sheetsLeft = 100;
        this.toner = 150;
        this.pages = 0;
        this.copies = 0;
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

    public double getPages() {
        return pages;
    }

    public void setPages(double pages) {
        this.pages = pages;
    }

    public double getCopies() {
        return copies;
    }

    public void setCopies(double copies) {
        this.copies = copies;
    }

    public void print(double pages, double copies){
        //added the below in case you wanted to track number of pages and copies printed in total
        this.pages += pages;
        this.copies += copies;

        double pagesPrinted = pages * copies;

        if (this.sheetsLeft >= pagesPrinted && this.toner >= pagesPrinted) {
            this.sheetsLeft -= pagesPrinted;
            this.toner -= pagesPrinted;
       }
    }

}
