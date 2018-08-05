public class InsertSort {

    public static void main(String[] args) {
        int[] array={20,25,15,42,36,16,12};

        for(int i=1;i<array.length;i++){
            int temp=array[i];
            int j=i;
            while (j>0 && temp<array[j-1]){
                array[j]=array[j-1];
                j--;
            }
            array[j]=temp;

        }

        for(int x:array){
            System.out.println(x);
        }

    }
}
