package reflection2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Tommy on 2018/10/17.
 */
public class ReflectionAPIDemo {

    public static void main(String[] args) {
        try {
           Class<?> classType = Class.forName("reflection2.Employee");
           //透過反射機制構造一個Employee的實例對象,默認調用無參數的構造方法
           Employee employee=(Employee) classType.newInstance();


            //調用指定的構造方法來構造對象(調用無參數的構造方法)
            Constructor<?> constructor=classType.getConstructor(new Class[]{});
            Employee employee1=(Employee) constructor.newInstance(new Object[]{});
            System.out.println(employee1);

            //調用指定的構造方法來構造對象(調用帶參數的構造方法)
            Constructor<?> constructor2=classType.getConstructor(new Class[]{String.class,int.class});
            Employee employee2=(Employee) constructor2.newInstance(new Object[]{"張三",30});
            System.out.println(employee2);

            //獲取指定方法,包括私有的
            Method[] methods = classType.getDeclaredMethods();
            for(Method method:methods){
                System.out.println(method.getName()+"---"+method.getModifiers()+"---"+method.getReturnType());
            }

            //獲取class對象所指定的方法,包括私有的
            Method method = classType.getDeclaredMethod("toString",new Class[]{});
            System.out.println(method.getName());

            //使私有方法可被調用 不過會破壞OO
            method.setAccessible(true);

            //方法的調用
            String desc = (String) method.invoke(employee,new Object[]{});
            System.out.println(desc);

            Field field=classType.getDeclaredField("name");
            //可調用私有屬性
            field.setAccessible(true);
            field.set(employee,"李四");
            System.out.println(field.get(employee));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}

class Employee{

    private String name;
    private int age;

    public Employee(){}

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void work(){
        System.out.println("working...");
    }
}
