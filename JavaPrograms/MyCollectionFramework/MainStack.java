package MyCollectionFramework;

public class MainStack<E> {
    private MainLinkedList<E> sl=new MainLinkedList<>();
    public static void main(String[] args) throws Exception {
        MainStack<Integer> st = new MainStack<>();
        st.push(3);
        st.push(32);
        st.push(13);
        System.out.println(st.peek());
    }
    void push(E e){
        sl.add(e);
    }
    E pop() throws Exception{
        if(sl.isEmpty())
            throw new Exception("Popping is not allowed in empty set.");
        return sl.removeLast();
    }
    E peek() throws Exception{
        if(sl.isEmpty())
            throw new Exception("Peeking is not allowed from empty stack.");
        return sl.getLast();
    }
}
