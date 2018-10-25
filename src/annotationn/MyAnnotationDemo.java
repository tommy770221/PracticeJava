package annotationn;

import java.lang.annotation.*;

/**
 * Created by Tommy on 2018/10/25.
 */
public class MyAnnotationDemo {

    @MyAnnotation2(value = "tommy",age=20,color = Color.Blue,test={"aa","bb"})
    public static void main(String[] args) {

    }

}

@Inherited//表示一個注解是否可以被子類繼承
@Documented//使用者製作apidoc時要一併將Annotaion加到API中
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.CONSTRUCTOR,ElementType.METHOD})
@interface MyAnnotation{}

enum Color{ Blue,Yellow,Red }

@interface MyAnnotation2{
    String value() default "abc";
    int age();
    Color color();
    String[] test();
}