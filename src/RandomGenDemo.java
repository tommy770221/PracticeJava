import java.util.Random;

public class RandomGenDemo {

    public static void main(String[] args) {
         RandomGen randomGen=new RandomGen();
         String bc=randomGen.codeGen();
         System.out.println(bc);

    }
}

class RandomGen{

    public String codeGen(){
       char[] charSequence={'A','B','C','D','E','F','G','H','I'};
        Random random=new Random();
        StringBuilder sb=new StringBuilder();
        int count=0;
        while (true){
            char c=charSequence[random.nextInt(charSequence.length)];
            if(sb.indexOf(c+"")==-1){
                sb.append(c);
                count++;
            }

            if(count==4){
                break;
            }
        }
        return sb.toString();

    }


}
