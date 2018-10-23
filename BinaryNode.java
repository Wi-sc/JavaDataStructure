import javax.swing.tree.TreeNode;

public class BinaryNode {
    public Object element;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(Object element, BinaryNode left, BinaryNode right){
        this.element=element;
        this.left=left;
        this.right=right;
    }

    public BinaryNode(Object element, BinaryNode left, boolean x){
        this.element=element;
        this.left=left;
    }

    public BinaryNode(Object element, boolean x, BinaryNode right){
        this.element=element;
        this.right=right;
    }

    public BinaryNode(){
        this.element=null;
    }

    public BinaryNode(Object element){
        this.element=element;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public Object getElement() {
        return element;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public boolean isEmpty(){
        return (element==null);
    }

}
