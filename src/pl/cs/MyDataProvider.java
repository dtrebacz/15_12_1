package pl.cs;

import java.util.Random;

public class MyDataProvider implements DataProvider{

    @Override
    public String getData() {

        Random r= new Random();
        return String.valueOf(r.nextGaussian() + " " + r.nextInt() + "tralalala!@#@!!!");
    }
}
