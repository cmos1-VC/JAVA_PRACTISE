class ABC
{
    public int add(int ...n)    //goes asa an Array {5,4,3,2,1} // variable Length arguments
    {
        int sum = 0;
        for(int i : n)
        {
            sum+= i;
        }
        return sum;
    }
}
public class hello
{
    public static void main(String args[])
    {
        ABC obj = new ABC();
        System.out.println(obj.add(5,4,3,2,1));

    }
}
