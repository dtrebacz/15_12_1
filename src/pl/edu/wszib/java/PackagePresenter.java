package pl.edu.wszib.java;

public class PackagePresenter {


    public PackagePresenter() {
        System.out.println("Konstruuje PackagePresenter ");

            }

     public void showPackage(){
         System.out.println("to jest objekt w klasie: "+ this.getClass().getName());
         System.out.println("w pakiecie: "+this.getClass().getPackage());
     }
}
