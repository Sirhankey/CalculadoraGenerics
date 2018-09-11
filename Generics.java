package sample;

public class Generics  {

    public static <T extends Number> double soma (T x , T y ){
        return x.doubleValue()+y.doubleValue();
    }

    public static <T extends Number> double subtracao (T x , T y){
        return x.doubleValue()-y.doubleValue();
    }

    public static <T extends Number> double multiplicacao (T x , T y){
        return x.doubleValue()*y.doubleValue();
    }

    public static <T extends Number> double divisao (T x , T y){
        if(y.doubleValue() == 0) {
            System.out.println("Impossivel dividir por zero");
            return -1;
        }else
            System.out.println(x.doubleValue()/y.doubleValue());
            return x.doubleValue()/y.doubleValue();

    }

    public static <T extends Number> double desconto (T x , T y){
        return x.doubleValue()-(x.doubleValue()*(y.doubleValue()/100));
    }
}
