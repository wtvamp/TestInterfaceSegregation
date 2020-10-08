public class FancyWaterBottle extends WaterBottle implements IFancyWaterBottle, IShakeTheBottle {

    private String stickerThatWasAdded;

    @Override
    public String displayNutrionalValue() {
        return "Even more nutricious because it's fancy. " + this.liquid + " amount of liquid left.";
    }    

    public void addSticker(String nameOfSticker) {
        this.stickerThatWasAdded = nameOfSticker;
    }

    public void printSticker() {
        System.out.println("This water bottle has a " + this.stickerThatWasAdded + " sticker on it.");
    }

    @Override
    public void shakeTheBottle() {
        System.out.println("The water bottle has been shaken");
    }
}
