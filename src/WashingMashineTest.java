public class WashingMashineTest {
    public static void main(String[] args) {

        WashingMachine WMA = new WashingMachine();

        WMA.mmodeForSensitiveClothes();
        WMA.showSettings();

        System.out.println();

        WMA.mmodeForTowelsAndBedLine();
        WMA.showSettings();


    }
}
