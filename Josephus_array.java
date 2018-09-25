public class Josephus_array {
    public static void main(String[] args){
        int n=5;
        int m=3;
        int[] label=new int[n];
        for(int i=0;i<n;i++){
            label[i]=i+1;
        }
        int tmp=0;
        for(int i=0;i<n-1;i++){
            int len=n-i;
            label=delete(label, (tmp+m-1)%len);
            tmp=(tmp+m-1)%len;
        }
        System.out.println(label[0]);
    }
    public static int[] delete(int[] array, int index){
        int[] res=new int[array.length-1];
        System.arraycopy(array, 0, res, 0, index);
        System.arraycopy(array, index+1, res, index, array.length-index-1);
        return res;
    }
}
