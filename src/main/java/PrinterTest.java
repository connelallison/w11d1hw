import org.junit.Before; 
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before(){
        printer = new Printer(100, 80);
    }

    @Test
    public void hasSheets(){
        assertEquals(5, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(148.8, printer.getToner());
    }

    @Test
    public void printSuccessful(){
        assertEquals(100, printer.getSheets());
        assertEquals(80, printer.getToner());
        printer.print(15, 5);
        assertEquals(25, printer.getSheets());
        assertEquals(5, printer.getToner());
    }

    @Test
    public void printUnsuccessfulInsufficientToner(){
        assertEquals(100, printer.getSheets());
        assertEquals(100, printer.getToner());
        printer.print(15, 6);
        assertEquals(100, printer.getSheets());
        assertEquals(100, printer.getToner());
    }


    @Test
    public void canRefill() {
        assertEquals(100, printer.getSheets());
        assertEquals(100, printer.getToner());
        printer.print(15, 5);
        assertEquals(25, printer.getSheets());
        assertEquals(5, printer.getToner());
        printer.refill();
        assertEquals(100, printer.getSheets());
    }

}