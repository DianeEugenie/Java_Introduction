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
        this.volume -= 10;
    }
}
