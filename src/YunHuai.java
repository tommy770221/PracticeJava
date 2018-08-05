public class YunHuai {

    public static void main(String[] args) {
          int row=8;
          int[][]p=new int[row][row];
          for(int i=0;i<row;i++){
              for(int j=0;j<=i;j++){
                  if(j==0 || j==i){
                      p[i][j]=1;
                      System.out.print(p[i][j]);
                  }else{
                      p[i][j]=p[i-1][j]+p[i-1][j-1];
                      System.out.print(p[i][j]);
                  }
              }
              System.out.println();
          }


    }
}
