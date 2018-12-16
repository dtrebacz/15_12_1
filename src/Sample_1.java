public class Sample_1 {

    public static void main(String[] args) {

    A a = new A();
        a.setCounter(15);
        System.out.println(a.getCounter());
        a.setCounter(120);
        System.out.println(a.getCounter());


        a.setName("Dupa");
        System.out.println(a.getName());

        B b = new B();
        b.setCounter(25);
        System.out.println(b.getCounter());




    }


}

class A{
    protected int counter; // protected dostepne w klasach ktore dziedziczą. Private tylko w swojej klasie
    protected   String name;

    public String getName() {
        System.out.println("Zwrócono nazwe: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("nazwa zmieniona na: " + name);
    }



     public void setCounter(int counter) {

         if (counter >= 0 && counter <= 100) {
             this.counter = counter;
             System.out.println("licznik ustawiony na wartosc" + this.counter);
         } else {
             this.counter = 0;
             System.out.println("wartosc poza zakresem");
         }

         System.out.println("licznik ustawiony na wartosc" + this.counter);
     }

    public  int getCounter() {

        System.out.println("zwrócono wartosc licznika " + counter);
        return counter;
    }
}

class B extends A{

    @Override
    public int getCounter() {
        System.out.println("Teraz uruchamiamy metode z klasyB");
        return super.getCounter();
    }

    void show(){
        System.out.println("licznik = "+ counter);
        System.out.println("Nazwa = "+ name);


    }



}