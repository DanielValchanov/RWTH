package mySets;
import java.util.*;

public class MyMutableSet<T> extends MyAbstractSet<T> implements Set<T>{
    public static void main(String[] args) {
        ;
    }
    @Override
    boolean add(T t) {
        if(contains(t))
            return false;
        head = new MySetElement<T>(t, head);
        return true;
    }
    boolean addAll(Collection<? extends T> c) {
        boolean res = false;
        for(Object o : c) {
            if(add(o))
                res = true;
        }
        return res;
    }
    void clear() {
        head = null;
    }
    boolean remove(Object o) {
        if(head == null)
            return false;
        if(head.value.equals(o)) {
            head = head.next;
            return true;
        }
        MySetElement<T> cur = head;
        while(cur.next != null) {
            if(cur.next.value.equals(o)) {
                cur.next = cur.next.next;
                return true;
            }
        }
        return false;
    }
    boolean removeAll(Collection<?> c) {
        boolean res = false;
        for(Object o : c) {
            if(remove(o))
                res = true;
        }
        return res;
    }
    boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
    public MyMutableSet<T>() {
        super(null);
    }
    public MyMutableSet<T>(MySetElement<T> head) {
        super(head);
    }
    MyMutableSet<MyMutableSet<T>> powerset() {
        MyMutableSet<MyMutableSet<T>> res = new MyMutableSet<MyMutableSet<T>>();
        if(this.isEmpty())
            return new MyMutableSet<MyMutableSet<T>>();
        if(this.head.next == null) {
            res.add(this);
            res.add(null);
            return res;
        }
        MyMutableSet<MyMutableSet<T>> recursion = (new MyMutableSet<T>(this.head.next)).powerset();
        for(MyMutableSet<T> t : recursion) {
            MyMutableSet<T> t1 = new MyMutableSet(t.head);
            MyMutableSet<T> t2 = new MyMutableSet(t.head);
            t1.add(head);
            t2.add(head);
            res.add(t1);
            res.add(t2);
            res.add(t);
        }
        return res;
    }
    private MyMutableSet<T> subset(int k, Boolean[][] bitmasks) {
        if(k == bitmasks.length)
    }
}
