package reflection;

/**
 * Created by Tommy on 2018/10/16.
 */
public class TestClass {
    public static void main(String[] args) {
        //對象名.getClass
        Employee employee=new Employee("張三",30);
        Class<?> classType=employee.getClass();
        System.out.println(classType.getName());
        System.out.println(classType.getSuperclass().getName());

        //類名
        Class<?> classType2=Employee.class;
        System.out.println(classType2.getName());
        System.out.println(classType2.getSuperclass().getName());

        //ClassForName
        try {
            Class<?> classType3=Class.forName("reflection.Employee");
            System.out.println(classType3.getName());
            System.out.println(classType3.getSuperclass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Class<?> classType4=int.class;
            System.out.println(classType4.getName());
            System.out.println(classType4.getSuperclass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Class<?> classType5=Double.class;
            System.out.println(classType5.getName());
            System.out.println(classType5.getSuperclass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Class<?> classType6=Double.TYPE;
            System.out.println(classType6.getName());
            System.out.println(classType6.getSuperclass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


class Employee{

    private String name;
    private int age;

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
}