public class PolynomialsAddition {
    public static void main(String[ ] args) {
        Node p1 = new Node(6, 5);
        Node p2 = new Node(-1,3);
        p1.addNode(new Node(2,4));
        p1.addNode(new Node(1,3));
        p1.addNode(new Node(-2,0));
        p2.addNode(new Node(2,0));
        System.out.println( "P1:\n"+p1);
        System.out.println( "P2:\n"+p2);
        System.out.println( "The addition result:");
//        res=polynomial(p1, p2);
        Node ans=addition(p1, p2);
        System.out.println(ans);
//        System.out.println(addition(p1, p2));

    }
    private static Node addition(Node p1, Node p2) {
        
        Node res = new Node();
        while (p1 !=null && p2 != null) {
            if (p1.exp==p2.exp){
                if (p1.coef+p2.coef==0){
                    p1=p1.next;
                    p2=p2.next;
                    continue;
                }
                res.addNode(new Node(p1.coef+p2.coef, p1.exp));
                p1=p1.next;
                p2=p2.next;
            }
            else if (p1.exp>p2.exp) {
                res.addNode(new Node(p1.coef, p1.exp));
                p1=p1.next;
            }
            else{
                res.addNode(new Node(p2.coef, p2.exp));
                p2=p2.next;
            }
        }

        if (p1==null && p2==null)
            return res;
        else if (p1 == null){
            res.addNode(p2);
            return res;
        }
        else{
            res.addNode(p1);
            return res;
        }
    }
}
