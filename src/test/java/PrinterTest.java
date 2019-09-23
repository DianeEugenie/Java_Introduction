import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    //has number of sheets property

    @Test
    public void hasSheetsLeft(){
        assertEquals(100, printer.getSheetsLeft(), 0.01);
    }

    //print method that takes in pages/copies
    @Test
    public void canPrintSheets(){
        printer.print(2, 3);
        assertEquals(94, printer.getSheetsLeft(), 0.01);
    }

    //print only runs if enough pages
    @Test
    public void cannotPrintIfNoSheetsLeft(){
        printer.setSheetsLeft(0);
        printer.print(2, 3);
        assertEquals(0, printer.getSheetsLeft(), 0.01);
    }

    //add toner volume to class
    @Test
    public void hasToner(){
        assertEquals(150, printer.getToner(), 0.01);
    }

    //add reduce toner function per page
    @Test
    public void reduceTonerPerPrintedPage(){
        printer.print(5, 3);
        assertEquals(135, printer.getToner(), 0.01);
        assertEquals(85, printer.getSheetsLeft(), 0.01);
    }

    //add reduce toner function per page
    @Test
    public void cannotReduceTonerPerPrintedPage(){
        printer.setSheetsLeft(20);
        printer.setToner(10);
        printer.print(5, 3);
        assertEquals(10, printer.getToner(), 0.01);
        assertEquals(20, printer.getSheetsLeft(), 0.01);
    }




//    Modify the printer so that it reduces the toner by 1 for each page printed.
}
