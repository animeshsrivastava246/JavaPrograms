package MyCollectionFramework;

public class MainLinkedList<element> {
    Node<element> head;
    public void add(element data){
        Node<element> toAdd = new Node<element>(data);
        if(isEmpty()){
            head = toAdd;
            return;
        }
        Node<element> temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public element removeLast() throws Exception {
        Node<element> temp = head;
        if(temp==null)
            throw new Exception("List is Empty");
        if(temp.next == null){
            Node<element> toRemove = head;
            head=null;
            return toRemove.data;
        }
        while(temp.next.next!=null){
            temp = temp.next;
        }
        Node<element> toRemove = temp.next;
        temp.next = null;
        return toRemove.data;
    }
    public element getLast() throws Exception{
        Node<element> temp = head;
        if(temp==null)
            throw new Exception("List is Empty");
        while(temp.next!=null){
            temp = temp.next;
        }
        return temp.data;
    }
    public static class Node<element>{
        element data;
        Node<element> next;
        Node(element data){
        this.data = data;
        next = null;
        }
    }
    void print(){
        for(Node<element> temp = head; temp!=null ; temp=temp.next)
            System.out.print(temp.data+" ");
    }
}