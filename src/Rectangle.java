public class Rectangle extends Shape {
    private int lenght;
    private int width;

    public Rectangle(int lenght, int width, String color) {
        this.lenght = lenght;
        this.width = width;
        setColor(color);
    }

    public void show(){
        System.out.println(this);
    }

    @Override
    double getArea() {
        return lenght*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", color="+getColor()+
                '}';
    }


}
