package ExamenFinal.ejercicio4;

public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Servidor(), new Servidor());

        proxy.registrar("Juan1", "720"); //id 1 no primo
        proxy.registrar("Juan2", "467");//id 2 primo
        proxy.registrar("Juan3", "191");//id 3 primo
        proxy.registrar("Juan4", "111");//id 4 no primo
        proxy.registrar("Juan5", "222");//id 5 primo
        proxy.registrar("Juan6", "277");//id 6 no primo

        proxy.ingresar("Juan1", "222"); // ingreso incorrecto

        proxy.ingresar("Juan1", "720");
        proxy.ingresar("Juan2", "467");
        proxy.ingresar("Juan3", "191");
        proxy.ingresar("Juan4", "111");
        proxy.ingresar("Juan5", "222");
        proxy.ingresar("Juan6", "277");

    }

}
