
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println(j);        
        
        System.out.println();
        
        j.add("magneto");
        System.out.println(j);
        
        System.out.println();
        
        j.add("mystique");
        System.out.println(j);
        
        System.out.println();
        
        j.add("phoenix");
        System.out.println(j);
        
        System.out.println("\n" + "------------------------test---------------");
       SimpleCollection c = new SimpleCollection("collection-258");
c.add("element-bf5");
c.add("element-bf5");
System.out.println(c);
    }
}
