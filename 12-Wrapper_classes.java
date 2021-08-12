//Wrapper classes are slow compared to primitive data-types.....
public class wrapper_classes {
    public static void main(String args[])
    {
        int i = 5; //primitive data type
        Integer ii = new Integer(i);   //Boxing- Wrapping.
        int j = ii.intValue();//Unboxing-unWrapping.

        Integer value = i; //Auto-Boxing

        int k = value;//Auto-unboxing

    }
}
