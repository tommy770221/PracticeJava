import java.lang.reflect.Array;
import java.util.Arrays;

public class MycontainerT {

    public static void main(String[] args) {
       ArrayList<String> stringArrayList=new ArrayList<String>();
       stringArrayList.add("abc");
       stringArrayList.add("edf");
       System.out.println(stringArrayList.get(1));

    }
}

interface IContainer<T>{

    public void add(T obj);

    public T get(int index);

    public int size();

}

class ArrayList<T> implements IContainer<T>{

     // private T[] t=new T[10]; 編譯錯誤 泛型不能創建array

    private Object[] data=null;
    private int size=0;


    public ArrayList(){
        data=new Object[10];
    }

    public ArrayList(int capacity){
        data=new Object[capacity];
    }

    @Override
    public void add(T obj) {

         ensureCapacity(size+1);
         data[size++]=obj;


    }

    @Override
    public T get(int index) {

        return (T) data[index];
    }

    @Override
    public int size() {
        return size;
    }

    public void ensureCapacity(int capacity){
        if(capacity>data.length){
            int oldCapathity=data.length;
            int newCapathity=oldCapathity+(oldCapathity>>1);//擴容為原有的1.5倍
            data= Arrays.copyOf(data,newCapathity);
        }
    }
}