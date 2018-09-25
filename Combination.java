import java.io.*;

public class Combination {
    private  static final int N=10;
    private  static final int R=3;
    public static void main(String[] arg){
        int[] ans = new int[R];
        combination(ans, 1, 0);
    }
    public static void combination(int[] ans, int begin, int nums){
        for(int i=begin;i<=N;i++) {
            if (i+R-nums-1>N)
                return;
            ans[nums]=i;
            if (nums+1==R){
                printArray(ans);
                System.out.println();
            }
            else
                combination(ans, i+1, nums+1);
        }

    }

    private static void printArray(int[] array) {
        for (int x: array) {
            System.out.print(x + " ");
        }
    }
}
