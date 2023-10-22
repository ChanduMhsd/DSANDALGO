package LinkedList;

public class LinkedList{
    private Node head;
    private Node tail;

    private int size;

    public LinkedList(){
        this.size=0;
    }

    // To insert At Start
    public void insertAtStart(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        size++;
        if (tail==null){
            tail=head;
        }

    }

    // To insert at Last

    public void insertAtLast(int val){
        if (tail==null){
            insertAtStart(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    // Insert At random index

    public void insert(int val,int indx){
        if (indx==0){
            insertAtStart(val);
            return;

        } else if (indx==size) {
            insertAtLast(val);
            return;
        }

        Node temp=head;
        for (int i=1;i<indx;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    // To delete at Start

    public int deleteAtStart(){
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;

        return head.val;
    }

    // Deleting Last element

    public int deleteLast(){
        if (size<=1){
            return deleteAtStart();
        }

        Node sl=get(size-2);
        int val=tail.val;
        tail=sl;
        tail.next=null;
        size--;
        return val;
    }

    // Delete at a index

    public int delete(int indx){
        if (indx==0) {
            return deleteAtStart();
        } else if (indx==size-1) {
            return deleteLast();
        }
        Node prev=get(indx-1);
        int val=prev.next.val;
        prev.next=prev.next.next;
        return val;
    }

    // Find the Node
    public Node findNode(int val){
        Node node=head;
        while (node!=null){
            if (node.val==val){
                return node;
            }
            node=node.next;
        }

        return null;
    }
    public Node get(int indx){
        Node node=head;

        for (int i=0;i<indx;i++){
            node=node.next;
        }
        return node;
    }


    // To Display Elements;



    public void display()
    {
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("!");
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

    public static class Main {

        public static void main(String[] args) {


        }

    }
}
