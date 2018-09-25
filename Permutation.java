public class Permutation {
    public static void main(String[] args){
//        permute("abcde");
        String s="Madam, I'm Adam.";
        char[] listChar = s.toCharArray();
        System.out.println(judge(listChar, 0, s.length()-1));
    }
//    public static void permute(String strs){
//        char[] listChar = strs.toCharArray();
//        permute(listChar, 0, strs.length()-1);
//    }
//    private static void permute(char[ ] list ,  int k,  int m) {
//        int i;
//        if (k==m) {
//            for (i = 0; i <= m; i++)
//                System.out.print(list[i]);
//            System.out.println();
//        }
//        else{
//            for (i=k; i<=m; i++) {
//                char tmp=list[k];
//                list[k]=list[i];
//                list[i]=tmp;
//                //   swap(list[k], list[i]);
//                permute(list, k+1, m);
//                list[i]=list[k];
//                list[k]=tmp;
//            }
//        }
//    }
    private static boolean judge(char[] s, int left, int right){
        if (left==right || left==right+1) return true;
        if ((s[left]>='a'&& s[left]<='z')||(s[left]>='A'&& s[left]<='Z')){
            if ((s[right]>='a'&& s[right]<='z')||(s[right]>='A'&& s[right]<='Z')){
                if(s[left]>='A') s[left] = Character.toLowerCase(s[left]) ;
                if(s[right]>='A') s[right] = Character.toLowerCase(s[right]);
                if (s[right]==s[left]) return judge(s, left+1, right-1);
                else return false;
            }
            else return judge(s, left, right-1);
        }
        else return judge(s, left+1, right);
    }

}
