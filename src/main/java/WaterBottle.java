public class WaterBottle {

    private double volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void drink(){
        if (this.volume >= 10) {
            this.volume -= 10;
        }
    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }
}
