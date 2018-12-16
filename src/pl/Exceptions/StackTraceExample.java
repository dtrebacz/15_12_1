package pl.Exceptions;

public class StackTraceExample {
    public static void main(String[] args) {
        StackTraceExample stackTraceExample = new StackTraceExample();
        stackTraceExample.method1();

    }


    void  method1(){
        method2();
    }

    void method2(){
        method3();
    }

    void method3(){
        throw new RuntimeException("BUM!!!");
    }

}
