public class FijiWaterBottle implements IWaterBottle {

    private String holdLiquid;
    protected Boolean flipped;   

    @Override
    public void holdLiquid(int amountOfLiquidToHold) {
        if (amountOfLiquidToHold > 100) {
            holdLiquid = " small ";
        }
        else if (amountOfLiquidToHold < 100 && amountOfLiquidToHold > 1000) {
            holdLiquid = " medium ";
        }
        else {
            holdLiquid = " lot ";
        }
    }

    @Override
    public String displayNutrionalValue() {
        return "Fiji is the most nutricious - it has a " + this.holdLiquid + " amount of liquid remaining";
    }

    @Override
    public Boolean flipTheBottle() {
        flipped = !flipped;
        return flipped;
    }
    
}
