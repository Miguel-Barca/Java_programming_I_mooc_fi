

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int lastNumber) {
        int i = 1;
        
        while(i<= lastNumber) {
            System.out.println(i);
            i++;
        }
    }
}
