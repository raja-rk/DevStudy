package DSA;

public class LinkedList {
    class Node{
        public Node next;
        public int data;
        public Node (){
    
        }
        public Node(int data){
            this.data=data;
        }
    }
    class LL{
        public Node insert(Node head, int num){
            Node temp=new Node(num);
            temp.next=null;
            if(head==null){
                head=temp;
            }else{
                Node temp2=head;
                while (temp2.next!=null) {
                    temp2=temp2.next;
                }
                temp2.next=temp;
            }
            return head;
        }
        public void show(Node head){
            while(head!=null){
                System.out.println(head.data);
                head=head.next;
            }
        }
    }
    public static void main(String[] args){
        LinkedList newLinkedList = new LinkedList();
        LinkedList.LL newLL=newLinkedList.new LL();
        LinkedList.Node head= newLinkedList.new Node(10);
        head = newLL.insert(head,11);
        head = newLL.insert(head,12);
        head = newLL.insert(head,13);
        newLL.show(head);
    }
}
