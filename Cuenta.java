public class Cuenta {

    //public, todos puede ver o acceder a los datos
    //private, no todos pueden ver o acceder a los datos
    //protected, solo algunos pueden accederv

    //atributoa o variables
    private String titular;
    private double cantidad;

    //metodos o constructores
    public Cuenta(String titular){
        this.titular = titular;
    }
    public Cuenta(String titutal, double cantidad){
        this.titular = titular;

        if (cantidad < 0){
            this.cantidad = 0;

        }else{
            this.cantidad = cantidad;
        }

    }

    //metodos getter o setters

    public String getTitular(){
        return titular;
    }

    public void settitular(String titular){
        this.titular = titular;
    }

    //mostrar dato
    public double getcantidad(){
        return cantidad;
    }

    //no retornar valor
    public void setcantidad(double cantidad){
        this.cantidad = cantidad;
    }

    //metodos de verdad
    //contador
    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    //Codigo si el usuario retirsa la misma cantidad de la cuenta, queda en 0
    public void retirar (double cantidad){
        if (this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "el titular de la cuenta: " + titular + " tiene " + cantidad + " dolares.\n";
    }
}