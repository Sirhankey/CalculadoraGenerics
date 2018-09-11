package sample;

public class GenericClass <T extends Number>  {
    T objeto;
    float x = objeto.floatValue();


    public GenericClass(T objeto) {
        this.objeto = objeto;
    }

    public static <T> void caixa (T x){
        System.out.println(x);
    }
}

