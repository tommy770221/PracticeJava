package reflection2;

import java.lang.reflect.Array;

/**
 * Created by Tommy on 2018/10/17.
 */
public class ReflectionArrayDemo {

    public static void main(String[] args) {

        try {
            Class<?> classType=Class.forName("java.lang.String");
            Object array= Array.newInstance(classType,5);
            Array.set(array,3,"abc");
            System.out.println(Array.get(array,3));
            System.out.println(Array.get(array,5));
            System.out.println(Array.get(array,2));

            //創造三行三列的arrays
            int[] dimens={3,3};
            Object array1= Array.newInstance(int.class,dimens);
            //取第三行
            Object arrayObj = Array.get(array,2);
            Array.set(arrayObj,2,10);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
