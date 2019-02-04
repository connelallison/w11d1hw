public class Bottle {
    private int volume;
    public Bottle(){
        this.volume = 100;
    }

    public void drink(){
        if (this.volume >= 10){
            this.volume -= 10;
        }
    }
    public void empty(){
        this.volume = 0;
    }
    public void fill(){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }
}
