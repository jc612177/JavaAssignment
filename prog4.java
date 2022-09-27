import java.util.Scanner;
public class prog4 
{
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);

    System.out.print("Enter the number of rows:");
    int r=in.nextInt();
    int i,j;
    System.out.print("Enter the number of columns:");
    int c=in.nextInt();
    int arr[][]=new int [r][c];
    System.out.println("Enter the elements of the 2D array: ");
    for(i=0;i<r;i++) {
        for(j=0;j<c;j++) {
            arr[i][j]= in.nextInt();
        }
    }
    int sum=0;
    for( i=0;i<r;i++) {
        int rowSum=0;
        for( j=0;j<c;j++) {
            sum += arr[i][j];
            rowSum += arr[i][j];
        }
    System.out.println((i+1)+" "+ "Rowssum=" + rowSum);
    }
    for( i=0;i<c;i++) {
        int columnSum=0;
        for( j=0;j<r;j++) {
            columnSum += arr[i][j];
        }
    System.out.println((i+1)+" "+ "Columnsum=" + columnSum);
    }

    System.out.println("Sum of all the elements in an array=" + sum);
    in.close();
    }
}
