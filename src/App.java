public class App {
    public static void main(String[] args) throws Exception {
        IWaterBottle whateverWaterAngelWants1 = new FijiWaterBottle();
        IWaterBottle whateverWaterAngelWants2 = new WaterBottle();
        IWaterBottle whateverWaterAngelWants3 = new FancyWaterBottle();
        IWaterBottle whateverWaterAngelWants4 = new NoStickers();
                
        Angel angelFromThisUniverse = new Angel(whateverWaterAngelWants2);
        angelFromThisUniverse.angelChecksTheNutritionalValueOfWater();
    }
}
