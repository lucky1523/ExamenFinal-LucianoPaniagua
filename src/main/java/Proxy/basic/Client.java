package Proxy.basic;

public class Client {
    public static void main(String[]args){
        Proxy proxy = new Proxy();
        proxy.setAttribute1(60);
        proxy.request();

        proxy.setAttribute1(30);
        proxy.request();
    }
}
