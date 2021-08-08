/*Main:-
RUntime polymorphism
Compiletime polymorphism
"Dynamic method dispatch is done when the same reference object is being used for creating different objects of other classes.(kinda) */

class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("in B");
    }
}
class C extends A{
    @Override
    public void show(){
        System.out.println("in C");
    }
}


//compile time and runtime polymorphism

public class Dynamic_method_dispatch {
    public static void main(String args[]){
        A obj2 = new B();       //this can obnly be done when there is same class in Superclass as well this is called runtime polymorphism
        obj2.show();

        obj2 = new C();
        obj2.show();
    }
}
