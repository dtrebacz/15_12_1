package pl.cs;

public class Test {

    public static void main(String[] args) {
        DataPresenter dataPresenter = new DataPresenter();
        DataProvider dataProvider = new FileDataProvider();

        DataProvider[]dataProviders = new DataProvider[10];

        dataProviders[0] = new FileDataProvider();
        dataProviders[1] = new SimpleDataProvider();
        dataProviders[2] = new FileDataProvider();
        dataProviders[3] = new SimpleDataProvider();
        dataProviders[4] = new FileDataProvider();
        dataProviders[5] = new MyDataProvider();
        dataProviders[6] = new FileDataProvider();
        dataProviders[7] = new MyDataProvider();
        dataProviders[8] = new FileDataProvider();
        dataProviders[9] = new FileDataProvider();


        for (DataProvider dp: dataProviders ) {
            dataPresenter.showData(dp);

        }




    }

}
