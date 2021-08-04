\\Create a ABC pattern
A
AB
ABC
\\

public class hello {

    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            int alphabet = 65;
            for(int j=1;j<=i;j++){
                System.out.print((char)alphabet +"");
                alphabet++;
        }
        System.out.println();
        
        }
    }
}
