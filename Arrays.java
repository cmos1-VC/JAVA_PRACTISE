/*1-D Array*/

public class hello
{
    public static void main(String args[])
    {
        int nums[] = {9,6,5,7}; //int nums[] = new int[4]

      
        for(int i =0;i<4;i++)
        {
            System.out.println(nums[i]);
        }
    }
}



//2-D Array

public class hello
{
    public static void main(String args[])
    {
        //int a[] = {1,2,3,4};
        //int b[] = {9,7,6,5};
        //int c[] = {6,5,4,0};

        int d[][] = {
            {1,2,3,4},
            {9,7,6,5},
            {6,5,4,0}
        };
        
        //System.out.println(d[1][3]);
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<4;j++)
           {
               System.out.print(" " + d[i][j]);
           }
           System.err.println();
       }

    }
}


//Jagged Array (uneven 2-d Array)

public class hello
{
    public static void main(String args[])
    {
        //int a[] = {1,2,3,4};
        //int b[] = {9,7,6,5};
        //int c[] = {6,5,4,0};

        int d[][] = {          //jagged array
            {1,2,3},
            {9,7,6,5,1,},
            {6,5,4,0,6,8}
        };
        
        //System.out.println(d[1][3]);
       for(int i=0;i<d.length;i++)               //i = d.lemgth length of whole d array i.e 3
       {
           for(int j=0;j<d[i].length;j++)        //j = d[i].length length of each row in d array
           {
               System.out.print(" " + d[i][j]);
           }
           System.err.println();
       }

    }
}



