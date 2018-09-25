public class Node {
    public int coef;
    public int exp;
    public Node next;
    public Node previous;

    public Node (){
        this.next=null;
        this.previous=null;
    }
    public Node(int coef, int exp){
        this.coef = coef;
        this.exp = exp;
    }

    public void addNode(Node node){
        Node tmp = this;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        node.previous=tmp;
        tmp.next = node;

    }

    public void deleteNode(){
        this.next=this.next.next;
    }

    public String toString(){
        String output;
        switch (this.coef){
            case 0:
                output="";
                break;
            case 1:
                if(this.exp==1) {
                    output = "x";
                    break;
                }
                else if (this.exp==0) {
                    output = "1";
                    break;
                }
                else{
                    output = "x^" + this.exp;
                    break;
                }
            case -1:
                if(this.exp==1) {
                    output = "-x";
                    break;
                }
                else if (this.exp==0) {
                    output = "-1";
                    break;
                }
                else{
                    output = "-x^" + this.exp;
                    break;
                }
            default:
                output = String.valueOf(this.coef);
                if (this.exp==0) {
                    break;
                }
                else if (this.exp==1) {
                    output += "x";
                    break;
                }
                else
                    output += "x^"+this.exp;
        }
        if (this.previous !=null && this.previous.coef!=0 && this.coef > 0)
            output = "+" + output;
        if (this.next == null)
            return output;
        else
            return (output + this.next);
    }


}
