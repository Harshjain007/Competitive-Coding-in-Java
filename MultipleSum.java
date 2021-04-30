import java.util.Scanner;

public class MultipleSum {
    public static void main(String args[]) {
        int num, sumFive=0, sumThree=0,sumFTeen=0,tSum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        num = sc.nextInt();
        for(int i=0; i<= num; i+=3 ) {
            if(i%3 == 0 ) {
                sumThree+=i;
            }
        }
        for(int j=0; j<= num; j+=5 ) {
            if(j%5 == 0 ) {
                sumFive += j;
            }
            
        }
        if (num >= 15){
            for(int k=0; k<= num; k+=15 ) {
                if(k%5 == 0 ) {
                    sumFTeen += k;
                }
                
            }
        }
        tSum = sumThree + sumFive - sumFTeen;
        System.out.println(tSum);
        sc.close();

    }
}
