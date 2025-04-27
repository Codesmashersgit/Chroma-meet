

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            // this.next= next;

        }
    }
    
    public static void main(String[] args) {
        Node a= new Node(3);
        Node b= new Node(0);
        Node c= new Node(7);
        Node d= new Node(8);
        Node e= new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
         
        Node temp=a;
        while (temp != null) {
             System.out.print(temp.data + " ");
             temp = temp.next;
        }

    }
}
