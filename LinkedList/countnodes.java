class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class countnodes{
    public static int count(Node head) {
        if(head == null){
            return 0;
        }
        return 1 + count(head.next);
    }   
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println(count(head));
    }
}