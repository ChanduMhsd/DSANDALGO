package ALGO;

class DLList{

    private int size;
    private Node head;
    private Node tail;
    public DLList(){
        this.size=0;
    }

    public void insertAtStart(int val){
        if (tail==null){
            tail=head;
        }

        Node node=new Node(val);
        node.next=head;
        if (head!=null){
            head.prev=node;
        }
        head=node;
        size++;
    }
    public void insertAtLast(int val){
        if (tail==null){
            insertAtStart(val);
            return;
        }

        Node node=new Node(val);
        node.prev=tail;
        if (head==null){
            node.prev=null;
            head=node;
            return;
        }
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val,int indx){
        if (indx==0){
            insertAtStart(val);
            return;
        }
        if (indx==size-1){
            insertAtLast(val);
            return;
        }

        Node temp=find(indx-1);

       Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        node.next.prev=node;


    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){

        Node temp=head;

        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();
        Node tl=tail;

        while (tl!=null){
            System.out.print(tl.val+"<-");
            tl=tl.prev;
        }
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }


        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}