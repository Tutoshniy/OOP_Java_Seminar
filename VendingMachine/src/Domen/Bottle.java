package Domen;

public class Bottle extends Product {
    
    private float bottleVolume;

    public Bottle(String name, int price, float bottleVolume) {
        super(name, price);
        this.bottleVolume = bottleVolume;
    }

    public float getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(float bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String toString(){
        return super.toString() + "; volume=" + this.bottleVolume;
    }

    
}
