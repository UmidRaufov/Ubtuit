package widvan.uz;



import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

    


    public static void main(String[] args) {
	// write your code here
//
//        Scanner scanner = new Scanner(System.in);
//
//        float inputt = scanner.nextFloat();
//
//        float answer = 0;
//
//
//        for (int i = 1; i <= inputt ; i++) {
//            answer+= (i + 5)*1./(pow(i, 4) + 27 * i + 7);
//        }
//
//        System.out.println("answer = " + answer);

        Scanner kirituvchi = new Scanner(System.in);

        int inputtt = kirituvchi.nextInt();
        int inputt2 =kirituvchi.nextInt();

        if(inputtt > inputt2){
            System.out.println("> katta");
        }else{
            System.out.println("< 2-son katta");
        }



    }
}
