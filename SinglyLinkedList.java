import java.util.NoSuchElementException;

class SingleLinkedListStack implements SLLStackInterface {

    // This will be your only instance variable.
    Node head = null; 

     /**
     * The method places the value at 
     * the head of the Linked List.
     */
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    /**
     * The method places the value at 
     * the end of the linked list. You
     * will need to traverse the linked 
     * List until the next field is null.
     */
    public void addLast(int value) {
        if (head == null) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        Node newNode = new Node(value);
        current.next = newNode;
        newNode.next = null;

    }

    /**
     * The method returns the value at the
     * head of the stack but does not
     * remove it. Throws NoSuchElementException
     * if the stack is empty.
     */
    public int getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    /**
     * The method removes and returns the 
     * value at the head of the stack.
     * Throws NoSuchElementException if 
     * the stack is empty.
     */
    public int removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        // store value of head and remove it
        int value = head.data;
        head = head.next;
        return value;
    }

    /**
     * Empties the stack of all elements
     */
    public void clear() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            current = head.next;
            head.next = null;
            head = current;
        }
        head = null;
    }

    /**
     * The method empty returns true if 
     * the stack is empty otherwise it 
     * should return false.
     */
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    /**
     * The method returns true if the 
     * stack contains the specified value.
     * Otherwise it it returns false.
     */
    public boolean contains(int value) {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * The method toArray returns an array
     * containing all of the elements in 
     * the stack in the correct order. The 
     * head element should be at index 0.
     */
    public int[] toArray() {
        // create array with size equals to number of elements in linked list
        int[] arr = new int[nodeCount(head)];

        // iterate through the array
        Node current = head;
        int i = 0;
        while(current != null) {
            arr[i] = current.data;
            i++;
            current = current.next;
        }

        return arr;
    }


    // count number of elements in linked list
    public int nodeCount(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + nodeCount(node.next);
    }




}
