package reflection2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Tommy on 2018/10/17.
 */
public class CopyObjectDemo {

    public static void main(String[] args) {

        Student student=new Student("張三",1,30);
        try {
            Student student1=(Student) ObjectCopyUtil.copyObj(student);
            System.out.println(student1.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


class ObjectCopyUtil{

    public static Object copyObj(Object obj) throws Exception{

        Class<?> classType = obj.getClass();

        Object objRes = classType.newInstance();

        for(Field field: classType.getDeclaredFields()){

            String getMethodName="get"
                                 + field.getName().substring(0,1).toUpperCase()
                                 + field.getName().substring(1);

            String setMethodName="set"
                    + field.getName().substring(0,1).toUpperCase()
                    + field.getName().substring(1);

            //調用getMethodName
            Method getMethod = classType.getDeclaredMethod(getMethodName,new Class[]{});
            Object value = getMethod.invoke(obj,new Object[]{});
            //調用setMethodName
            Method setMethod = classType.getDeclaredMethod(setMethodName,new Class[]{field.getType()});
            setMethod.invoke(objRes,new Object[]{value});

            //方法二
           // field.setAccessible(true);
           // Object value2=field.get(obj);
           // field.set(objRes,value);

        }



        return objRes;
    }

}

class Student{

    private String name;
    private int id;
    private int age;

    public Student(){
    }

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}