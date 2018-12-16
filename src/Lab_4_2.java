import java.util.Arrays;
import java.util.Random;

public class Lab_4_2 {


    public static void main(String[] args) {

        Los los = new Los();
        Los LosWygrany = new Los(7,7,7);

        while (!los.equals(LosWygrany)) {
            los.Losuj();
            System.out.println(los.lp + " " +los);

            }
        System.out.println("$$$$$$$$ jackPot !!!!! $$$$$$$$");
        System.out.println("w "+los.lp + " próbie");

   }
}

class Los {
    public int[] los = new int[3];
    static int lp;
    Random random = new Random();


    public Los(){}

    public Los(int a, int b, int c){
        this.los[0] = a;
        this.los[1] = b;
        this.los[2] = c;
    }


    void Losuj() {
        lp++;

        los[0] = random.nextInt(10);
        los[1] = random.nextInt(10);
        los[2] = random.nextInt(10);
        }


    @Override
    public String toString() {
        return "Los{" +
                "los=" + Arrays.toString(los) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Los los1 = (Los) o;
        return Arrays.equals(los, los1.los);
    }

}

