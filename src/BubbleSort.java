public class BubbleSort {

    public static void main(String[] args) {
         int[] array=new int[]{1,5,3,2,6,7,9,13,54,20};


         for(int x=0;x<array.length-1;x++){
             for(int y=0;y<array.length-1-x;y++){
                 if(array[y]<array[y+1]){
                     int temp=array[y];
                     array[y]=array[y+1];
                     array[y+1]=temp;
                 }
             }
         }

         for(int x:array){
            System.out.println(x);
         }
    }
}
