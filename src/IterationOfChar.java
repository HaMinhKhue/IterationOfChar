import java.util.Scanner;
import java.util.stream.IntStream;

public class IterationOfChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string= "aiyeubahochiminhhonthienniennhidong";
        int times=0;
        System.out.print("Charater: ");
        char charater=scanner.next().charAt(0);
        for(char element: string.toCharArray()){
            /*if(Character.compare(charater,element)==0){
                times++;
            }*/
            if(element==charater){
                times++;
            }
        }
        System.out.println("times: "+times);
        }

    }
