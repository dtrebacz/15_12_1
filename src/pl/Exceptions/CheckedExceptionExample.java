package pl.Exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionExample {
    public static void main(String[] args)  {

        CheckedExceptionExample cee = new CheckedExceptionExample();
        cee.urlTesterByTryCatch("http://wszib.edu.pl");

        try {
            cee.urlTesterByThrows("http://www.onet.pl");
        } catch (MalformedURLException e) {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            e.printStackTrace();
        }

    }

    public void urlTesterByTryCatch(String urlStr){

        try {
            URL url = new URL(urlStr);

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            e.printStackTrace();
        }


    }


    public  void urlTesterByThrows(String urlStr) throws MalformedURLException {

        URL url = new URL(urlStr);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());



    }

}
