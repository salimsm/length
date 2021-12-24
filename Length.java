import java.util.Scanner;

public class Length {
    static String unit;
    public static void main(String args []){
       // System.out.println("h");
                   Scanner input=new Scanner(System.in);
            int initialUnit;
        do{ 
            System.out.println("Choose unit \n 1] Km \n 2] m");
            initialUnit=input.nextInt();
        }while(initialUnit==1);//initialUnit<1 && initialUnit >2);
       
        getUnit(initialUnit);
        System.out.println("Enter vlaue in "+unit+": ");
        int value=input.nextInt();

        System.out.println("Choose unit to convert in: \n 1] km \n 2] m");
        int finalUnit=input.nextInt();




       
    }
     static void getUnit(int initalUnit){
        switch(initalUnit){
            case 1:
                unit="km";
            break;
            case 2:
                unit="m";
            break;
                
        }
       // return unit;
    } 
}
