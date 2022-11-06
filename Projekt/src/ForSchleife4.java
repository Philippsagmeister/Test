

public class ForSchleife4 {

    public static void main(String[] args) {
        
    	double china = 1314;
        
    	double indien = 1095;
       
    	double jahr = 2006;
       
    	for (double jahre = 2006; indien < china; indien = indien + indien/100 * 1.38, china = china + china/100 * 0.59, jahre++) {
                        System.out.println(jahre);
                        
                        System.out.println(indien);
                       
                        System.out.println(china);
                        
        }
    }
}


	