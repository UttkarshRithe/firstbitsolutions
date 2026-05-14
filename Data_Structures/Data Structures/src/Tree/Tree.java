package Tree;

public class Tree {

    Node root;

    public Tree() {
        root = null;
    }

    public void insert(int ele) {
        root = insert(ele, root);
    }

    private Node insert(int ele, Node temp) {
        if (temp == null) return new Node(ele);

        if (ele < temp.getData())
            temp.setLeft(insert(ele, temp.getLeft()));
        else if (ele > temp.getData())
            temp.setRight(insert(ele, temp.getRight()));

        return temp;
    }

    public void delete(int ele) {
        root = delete(ele, root);
    }

    private Node delete(int ele, Node temp) {
        if (temp == null)
            return null;

        if (ele < temp.getData()) {
            temp.setLeft(delete(ele, temp.getLeft()));
            return temp;
        } else if (ele > temp.getData()) {
            temp.setRight(delete(ele, temp.getRight()));
            return temp;
        } else {
            if (temp.getLeft() == null && temp.getRight() == null)
                return null;

            if (temp.getRight() == null)
                return temp.getLeft();

            if (temp.getLeft() == null)
                return temp.getRight();

            Node tp = temp.getRight();
            while (tp.getLeft() != null)
                tp = tp.getLeft();

            temp.setData(tp.getData());
            temp.setRight(delete(tp.getData(), temp.getRight()));
            return temp;
        }
    }

    
    public boolean search(int ele) {
        return search(ele, root);
    }

    private boolean search(int ele, Node temp) {
        if (temp == null) return false;
        if (ele == temp.getData()) return true;
        return ele < temp.getData()
                ? search(ele, temp.getLeft())
                : search(ele, temp.getRight());
    }

    public void inorder() {
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
    }

    private void inorder(Node temp) {
        if (temp == null) return;
        inorder(temp.getLeft());
        System.out.print(temp.getData() + " ");
        inorder(temp.getRight());
    }
}