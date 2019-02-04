public class Printer {
    private int sheets;
    private int toner;
    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }
    public void print(int pages, int copies){
        if (this.sheets >= pages * copies && this.toner >= pages * copies){
            this.sheets -= pages * copies;
            this.toner -= pages * copies;
        }
    }
    public void refill(){
        if (this.sheets < 100){
            this.sheets = 100;
        }
    }

    public int getSheets() {
        return sheets;
    }

    public int getToner() {
        return toner;
    }
}
