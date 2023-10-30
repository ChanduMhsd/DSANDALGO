package ALGO;

class List{

    private int size;
    private Node head;
    private Node tail;
    public List(){
        this.size=0;
    }
    public void insertAtStart(int val){
        if (tail==null){
            tail=head;
        }
        Node node=new Node(val);
        node.next=head;
        size++;
        head=node;
    }
    public void display(){
        Node temp=head;
        for (int i=0;i<size;i++){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }


    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}