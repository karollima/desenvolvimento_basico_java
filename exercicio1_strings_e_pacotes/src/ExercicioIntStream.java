import java.util.stream.IntStream;

public class ExercicioIntStream {
    public static void main(String[] args) {
imprimeNumeros();
reveleNumeros();
contador();
    }

    public static void imprimeNumeros(){
        IntStream.of(1,2,3,4,5).forEach(n ->{
            System.out.println(n);
        });
    }
    public static void reveleNumeros(){
        IntStream.of(6,7,8,9,10).forEach(n ->{
            System.out.println(n);
        });
    }

    public static void contador(){
        IntStream.range(0,20).forEach(n ->{
            System.out.println("Numero=" +n);
        });
    }
}


//Exercício da DIO sobre desenvolvimento básico em JAVA
