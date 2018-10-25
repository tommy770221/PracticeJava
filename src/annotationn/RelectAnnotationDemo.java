package annotationn;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * Created by Tommy on 2018/10/25.
 */
public class RelectAnnotationDemo {

    public static void main(String[] args) {
        try {
           Class<?> classType=Class.forName("annotationn.AnnotationTest");
           boolean isAnnotation=classType.isAnnotationPresent(Desciption.class);
           System.out.println(isAnnotation);
           if(isAnnotation){
             Desciption desciption=(Desciption) classType.getAnnotation(Desciption.class);
             System.out.println("AnnotationTest's annotation ===>" + desciption);
             Method[] methods=classType.getDeclaredMethods();
             for(Method method:methods){
              Author author=(Author) method.getAnnotation(Author.class);
              System.out.println(author.name());
             }
           }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author{

    String name();
    String group();

}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@interface Desciption{
     String value();
}


@Desciption("這是一個測試類")
class AnnotationTest{

    @Author(name="tommy",group = "jr")
    public void test(){
        System.out.println("test over");
    }

}