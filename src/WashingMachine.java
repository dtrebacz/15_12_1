public class WashingMachine {





    private  int temperature;
    private int spinning;

    private int getTemperature() {
        return temperature;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    private int getSpinning() {
        return spinning;
    }

    private void setSpinning(int spinning) {
        this.spinning = spinning;
    }

    void mmodeForSensitiveClothes(){
        setTemperature(30);
        setSpinning(800);
    }

    void mmodeForTowelsAndBedLine(){
      setTemperature(90);
       setSpinning(1200);
    }

    void showSettings(){
        System.out.println("temperature: "+getTemperature()+" °C");
        System.out.println("spinning: "+getSpinning()+" RPM");

    }

}
