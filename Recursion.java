import java.util.Scanner;

public class Recursion
{

    public static int findPascal(int row, int col)
    {
        if(col == 0 || col == row )
            return 1;
        else
            return findPascal(row-1,col-1)+ findPascal(row-1,col);

    }


        public static void main(String[] args) {
            System.out.println("Hello world!");
            System.out.println("Enter the no of rows");
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();

            int i,j;


            int result ;
            for(i=0; i< rows;i++)
            {
                for(j=0; j<=i ; j++)
                {


                      result = findPascal(i,j);
                      System.out.print(result+" ");
                }
                System.out.println();
            }


        }
    }

