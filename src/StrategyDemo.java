public class StrategyDemo {

    public static void main(String[] args) {
      int[] array={1,2,3,32,90,80,70,55};
      ISort bubbleSort=new BubbleSort1();
      Context context=new Context(bubbleSort);
      context.sort(array);
      context.print(array);

    }

}

class Context{
    private ISort iSort=null;

    public Context (ISort iSort){
        this.iSort=iSort;
    }

    public void sort(int[] array){
        iSort.sort(array);
    }

    public void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }
}

interface ISort{
    public void sort(int[] array);
}

class BubbleSort1 implements ISort{

    @Override
    public void sort(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int x:array){
            System.out.println(x);
        }
    }
}

class SelectSort1 implements ISort{

    @Override
    public void sort(int[] array) {
        int min=0;
        for(int i=0;i<array.length;i++){
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
