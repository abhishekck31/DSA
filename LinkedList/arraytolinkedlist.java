class arraytolinkedlist {
    public static Node arraytolinked(int[] arr, int index) {
        if (index == arr.length) {
            return null;
        }
        Node newNode = new Node(arr[index]);
        newNode.next = arraytolinked(arr, index + 1);
        return newNode;
    }
    
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = arraytolinked(arr, 0);
        printList(head);
    }
}