public class SelectSort {

    public static void main(String[] args) {
        int[] array=new int[]{1,5,3,2,6,7,9,13,54,20};
         int min=0;
         for(int i=0;i<array.length-1;i++){
             min=i;
             for(int j=i+1;j<array.length;j++){
                 if(array[min]>array[j]){
                     min=j;
                 }

             }
             if(i!=min){
                 int temp=array[i];
                 array[i]=array[min];
                 array[min]=temp;
             }

         }

         for(int x:array){
             System.out.println(x);
         }



    }

}
