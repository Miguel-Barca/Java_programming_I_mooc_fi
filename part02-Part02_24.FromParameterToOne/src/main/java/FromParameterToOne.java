

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    
    public static void printFromNumberToOne(int lastNumber) {
        int i = lastNumber;
        
        while(i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
