public class ArrayDemo2 {

    public static void main(String[] args) {
       int [][] array=new int[3][];

        array[0]=new int[2];
        array[1]=new int[4];
        array[2]=new int[3];

        array[0][0]=1;
        array[0][1]=2;
        array[1][0]=1;
        array[1][1]=2;
        array[1][2]=3;
        array[2][0]=1;
        array[2][1]=2;
        array[2][2]=3;

        for(int[] x:array){
            for(int i:x){
                System.out.println(i);
            }
        }

    }
}
