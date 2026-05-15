// Interface A
interface A {
    void methodA();
}

// Interface B
interface B {
    void methodB();
}

// Class implementing multiple interfaces
class C implements A, B {

    @Override
    public void methodA() {
        System.out.println("Method A is called");
    }

    @Override
    public void methodB() {
        System.out.println("Method B is called");
    }
}

// Main Class
public class MultipleInheritanceUsingInterface{

    public static void main(String[] args) {

        C obj = new C();

        obj.methodA();  // Calling method from Interface A
        obj.methodB();  // Calling method from Interface B
    }
}