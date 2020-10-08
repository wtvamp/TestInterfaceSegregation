public class Angel {
    private IWaterBottle angelsWaterBottle;

    public Angel(IWaterBottle waterbottle) {
        this.angelsWaterBottle = waterbottle;
    }

    public void angelChecksTheNutritionalValueOfWater() {
        System.out.println(this.angelsWaterBottle.displayNutrionalValue());
    }
}
