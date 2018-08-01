
import java.util.Arrays;

public class InnerClassDemo {

    public static void main(String[] args) {
        MyContainer myContainer=new MyContainer();
        myContainer.put("jack","陳豪");
        myContainer.put("john","小明");
        myContainer.put("jay","周杰倫");
        myContainer.put("rose","羅絲");
        myContainer.put("jack","陳豪");
        MyContainer.Entry[] entries=myContainer.entryArrays();
        for(int i=0;i<entries.length;i++){
            System.out.println("key : "+entries[i].getKey());
            System.out.println("value : "+entries[i].getValue());
        }

    }

}
class MyContainer {

    private Entry[] entrys = new Entry[5];
    private int count = 0;

    public void put(String key, String value) {
        Entry entry = new Entry();
        entry.setKey(key);
        entry.setValue(value);
        entrys[count++] = entry;
        if (count >= entrys.length) {
            int newCapacity = entrys.length * 2;
            entrys = Arrays.copyOf(entrys, newCapacity);
        }
    }

    public Entry [] entryArrays(){
        return Arrays.copyOfRange(entrys, 0, count);
    }

      public static class Entry{

            private String key;
            private String value;

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

    }


