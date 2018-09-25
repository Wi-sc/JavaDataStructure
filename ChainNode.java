public class ChainNode{
    public int label;
    public static int length=0;
    public ChainNode next;

    public ChainNode(){
        this.label=0;
    }
    public ChainNode(int label){
        this.label=label;
    }
    public void addChainNode(ChainNode nextChain){
        ChainNode tmp = this;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next=nextChain;
        length++;
    }
    public void deleteChainNode(){
        this.next=this.next.next;
        length--;
    }
    public int getLength(){
        return length;
    }
    public String toString(){
        if (this.next!=null){
            return (String.valueOf(this.label)+"->"+this.next);
        }
        else
            return String.valueOf(this.label);
    }
}