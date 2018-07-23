import java.util.Arrays;

public class ArrayUtils {

    public static void main(String[] args) {

        int[] arraySrc={1,2,3,4,5};
        int[] arrayDest1=Arrays.copyOf(arraySrc,10);

        for(int x:arrayDest1){
            System.out.println(x);
        }

    }

}
