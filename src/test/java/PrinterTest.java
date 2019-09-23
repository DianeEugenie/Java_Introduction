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
        assertEquals(50, printer.getToner(), 0.01);
    }




//    Add a toner volume property to the class.
//    Modify the printer so that it reduces the toner by 1 for each page printed.
}
