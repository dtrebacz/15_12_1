import pl.edu.wszib.podyplomowe.PackagePresenter;

public class Test {

    public static void main(String[] args) {

        pl.edu.wszib.java.PackagePresenter javaPackagePresenter
                = new  pl.edu.wszib.java.PackagePresenter();

       PackagePresenter podyplomowePackagePresenter
                = new  PackagePresenter();

        System.out.println();
        javaPackagePresenter.showPackage();
        System.out.println();
        podyplomowePackagePresenter.showPackage();
        System.out.println();

        Test test = new Test();

        System.out.println("Pakiet klasy test: " + test.getClass().getPackage());


    }


}
