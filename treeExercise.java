import java.util.Scanner;

public class treeExercise {
    public static void main(String[] args){
//                      A
//                   B      C
//                 D   E       F
//               G  H
        BinaryNode t1 = new BinaryNode('G');
        BinaryNode t2 = new BinaryNode('H');
        BinaryNode t3 = new BinaryNode('D', t1, t2);
        BinaryNode t4 = new BinaryNode('E');
        BinaryNode t5 = new BinaryNode('B', t3, t4);
        BinaryNode t6 = new BinaryNode('F');
        BinaryNode t7 = new BinaryNode('C', true, t6);
        BinaryNode t8 = new BinaryNode('A', t5, t7);
        System.out.println("pre:");
        preOrder(t8);
        System.out.println();
        System.out.println("in:");
        inOrder(t8);
        System.out.println();
        System.out.println("post:");
        postOrder(t8);
        System.out.println();
    }

    public static void preOrder(BinaryNode t){
        if (t.element==null)
            return;
        System.out.print(t.element);
        System.out.print(' ');
        if (t.left!=null) preOrder(t.left);
        if (t.right!=null) preOrder(t.right);
    }

    public static void inOrder(BinaryNode t){
        if (t.element==null)
            return;
        if (t.left!=null) inOrder(t.left);
        System.out.print(t.element);
        System.out.print(' ');
        if (t.right!=null) inOrder(t.right);
    }

    public static void postOrder(BinaryNode t){
        if (t.element==null)
            return;
        if (t.left!=null) postOrder(t.left);
        if (t.right!=null) postOrder(t.right);
        System.out.print(t.element);
        System.out.print(' ');
    }
}
