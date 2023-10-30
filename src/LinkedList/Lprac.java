package LinkedList;

public class Lprac {

    private Node head;
    private Node tail;

    private int size;

    public Lprac(){
        this.size=0;
    }

    public void insertAtStart(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        size++;
        if (tail==null){
            tail=head;
        }
    }

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


    public void insert(int val,int indx){
        if (indx==0){
            insertAtStart(val);
            return;
        } else if (indx==size) {
            insertAtLast(val);
        }
        Node temp=head;
        for (int i=1;i<indx;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public int delAtStart(){
        int val= head.val;
        if (head==null){
            tail=null;
        }
        head=head.next;
        size--;

        return val;
    }
    public void display()
    {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
    }
    public int delAtlast()
    {
        int val=tail.val;
        if (size<=1){
            return delAtStart();
        }
        Node sl=get(size-2);

        tail=sl;
        tail.next=null;
        size--;
        return val;
    }

    public int del(int indx){
        if (indx==0){
            return delAtStart();
        } else if (indx==size-1)
        {
            return delAtlast();
        }
        Node temp=get(indx-1);
        temp.next=temp.next.next;

        return -1;
    }
    public Node get(int indx){
        Node node=head;
        for (int i=0;i<indx;i++){
            node=node.next;
        }
        return node;
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
