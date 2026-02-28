/*2️⃣ Move Zeroes
Problem:
Move all zeroes to the end of the array
while maintaining the order of non-zero elements.
Example 1
Input:
[0, 1, 0, 3, 12]
Output:
[1, 3, 12, 0, 0]
Example 2
Input:
[0, 0, 1]
Output:
[1, 0, 0]
Example 3:
Input:
[4, 5, 6]
Output:
[4, 5, 6]
(No change)
*/

import java.util.Arrays;
import java.util.Scanner;

class Movezeroes
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int k=sc.nextInt();
        int[] arr=new int[k];
        System.out.print("Enter the numbers greater than 0: ");
        for(int i=0;i<k;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" "+Arrays.toString(Solution2.moveZeroes(arr)));
        sc.close();
    }
}
class Solution2
{
    public static int[] moveZeroes(int[] arr)
    {
        int i=0;
        int j=0;
        while(j<arr.length)
        {
            if(arr[j]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        return arr;
    }
}