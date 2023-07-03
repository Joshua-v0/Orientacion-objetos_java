public class Main {
    public static void main(String args[]){

        Cuenta cuenta1 = new Cuenta("Alberto");
        Cuenta cuenta2 = new Cuenta("Pedro");

        cuenta1.ingresar( 200);
        cuenta2.ingresar( 300);

        cuenta1.retirar(500);
        cuenta2.retirar(100);

        System.out.print(cuenta1);
        System.out.print(cuenta2);   
    }
}