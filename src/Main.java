public class Main {
    public static void main(String[] args) {

    int val1 = 15;
    int val2 = 42;
    int val3 = 85;

    int resultado = suma(val1,val2,val3);

    System.out.println(resultado);

    Coche miCoche = new Coche();
    miCoche.aumentarPuertas();
    miCoche.aumentarPuertas();

    System.out.println(miCoche.getNum_puertas());

    }

    public static int suma (int a, int b, int c){
        return a+b+c;
    }
}