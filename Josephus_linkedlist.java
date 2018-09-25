public class Josephus_linkedlist {
    public static void main(String[] args){
        int n=5;
        int m=3;
        ChainNode josephus = new ChainNode();
        for(int i=1;i<=n;i++){
            josephus.addChainNode(new ChainNode(i));
        }
        ChainNode tmp = josephus;
        while(josephus.getLength()>1){
            for (int i=0; i<m-1;i++){
                if (tmp.next==null)
                    tmp=josephus;
                tmp=tmp.next;

            }
            if (tmp.next==null)
                tmp=josephus;
            tmp.deleteChainNode();
        }
        System.out.println(josephus.next.label);
    }

}
