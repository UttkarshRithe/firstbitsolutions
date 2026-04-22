package generalizeLinkedlist;

public class GeneralizeLinkedlist<T extends Comparable<T>> {

    Node<T> start;
    int count;

    public GeneralizeLinkedlist() {
        start = null;
        count = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    // Insert at end
    public void insert(T element) {
        Node<T> node = new Node<>(element);
        if (isEmpty()) {
            start = node;
        } else {
            Node<T> currNode = start;
            while (currNode.getNext() != null)
                currNode = currNode.getNext();
            currNode.setNext(node);
        }
        count++;
    }

    // Insert at beginning
    public void insertAtBeg(T ele) {
        Node<T> newNode = new Node<>(ele);
        if (isEmpty()) {
            start = newNode;
            count++;
            return;
        }
        newNode.setNext(start);
        start = newNode;
        count++;
    }

    // Insert at position
    public void insertAtPosition(T ele, int position) {
        Node<T> newNode = new Node<>(ele);

        if (isEmpty()) {
            if (position == 1) {
                start = newNode;
                count++;
            } else {
                System.out.println("\nList is Empty, can't insert at position " + position + "\n");
            }
            return;
        }

        if (position == 1) {
            insertAtBeg(ele);
            return;
        }

        Node<T> p = start;
        int c = 1;

        while (p.getNext() != null && c < (position - 1)) {
            p = p.getNext();
            c++;
        }

        if (c == (position - 1)) {
            newNode.setNext(p.getNext());
            p.setNext(newNode);
            count++;
        } else {
            System.out.println("\nEntered position is not valid for the present list\n");
        }
    }

    // Delete from beginning
    public void deleteFromBeg() {
        if (isEmpty()) {
            System.out.println("\nList is Empty..!\n");
        } else {
            start = start.getNext();
            count--;
        }
    }

    // Delete from end
    public void deleteFromEnd() {
        if (isEmpty()) {
            System.out.println("\nList is Empty..!\n");
            return;
        }

        Node<T> p = start;
        if (p.getNext() == null) {
            start = null;
            count--;
            return;
        }

        while (p.getNext().getNext() != null)
            p = p.getNext();

        p.setNext(null);
        count--;
    }

    // Delete by element value — ⚠️ == se .equals() pe switch kiya
    public void deleteElement(T ele) {
        if (isEmpty()) {
            System.out.println("\nList is Empty..!");
            return;
        }

        if (start.getData().equals(ele)) {
            deleteFromBeg();
            return;
        }

        Node<T> p = start;
        while (p.getNext() != null && !p.getNext().getData().equals(ele))
            p = p.getNext();

        if (p.getNext() == null)
            System.out.println("\nElement Not found...!");
        else {
            p.setNext(p.getNext().getNext());
            count--;
        }
    }

    // Delete by position
    public void deleteFromPosition(int position) {
        if (isEmpty()) {
            System.out.println("\nList is Empty..!\n");
            return;
        }

        if (position <= 0 || position > count) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            deleteFromBeg();
            return;
        }

        Node<T> p = start;
        int c = 1;
        while (c < position - 1) {
            p = p.getNext();
            c++;
        }
        p.setNext(p.getNext().getNext());
        count--;
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node<T> currNode = start;
        System.out.print("Start-> [");
        while (currNode != null) {
            if (currNode.getNext() != null)
                System.out.print(currNode.getData() + ", ");
            else
                System.out.print(currNode.getData() + "] <-End\n\n");
            currNode = currNode.getNext();
        }
    }

    public void displayReverseRecursion() {
        displayReverseUsingRecursion(start);
    }

    private void displayReverseUsingRecursion(Node<T> p) {
        if (p != null) {
            displayReverseUsingRecursion(p.getNext());
            System.out.println("\n" + p.getData());
        }
    }

    // Bubble Sort — Comparable<T> use karta hai
    public void bubbleSort() {
        boolean swap = false;
        for (Node<T> i = start; i != null; i = i.getNext()) {
            for (Node<T> j = start; j.getNext() != null; j = j.getNext()) {
                if (j.getData().compareTo(j.getNext().getData()) > 0) {
                    T temp = j.getData();
                    j.setData(j.getNext().getData());
                    j.getNext().setData(temp);
                    swap = true;
                }
            }
            if (!swap) return;
        }
    }

    public int getCount() {
        return count;
    }
}
