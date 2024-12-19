public class C extends A {
    public void test() {
        System.out.print("C");
    }

    public static void main(String[] args) {
        A b1 = new A(); 
        A b2 = new C(); 
        // A b3 = (B)b2; // This line is the one that causes compilation error the result will be AC.
        b1.test(); 
        b2.test(); 
    }
}