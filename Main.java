import java.util.*;
public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Enter the no of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int i,j;
        int[][] triangle = new int[rows][];

        for(i=0;i<rows;i++)
        {
            triangle[i]= new int[i+1];
        }

        for(i=0; i< rows;i++)
        {
            for(j=0; j<=i ; j++)
            {
                if(j== 0 || j== i)
                     triangle[i][j] = 1;

                else
                    triangle[i][j] =  triangle[i-1][j-1] + triangle[i-1][j];
            }
        }


        for(i=0;i<rows;i++)
        {
            for(j=0; j<=i ;j++)
            {
                System.out.print(triangle[i][j]+" ");

            }
            System.out.println();
        }
    }
}