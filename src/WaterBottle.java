public class WaterBottle implements IWaterBottle {
    protected int liquid;
    protected Boolean flipped;   
     
    public String displayNutrionalValue() {
        return "Soooo nutricious. " + this.liquid + " amount of liquid left.";
    }

    public Boolean flipTheBottle() {
        flipped = !flipped;
        return flipped;
    }

    @Override
    public void holdLiquid(int amountOfLiquidToHold) {
        this.liquid = amountOfLiquidToHold;
    }
}