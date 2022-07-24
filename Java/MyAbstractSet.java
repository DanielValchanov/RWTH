package mySets;

import java.util.*;


 abstract class MyAbstractSet<T> implements Iterable<T> {


//MySetIterator<T> current=iterator();


MySetElement<T> head;
public MyAbstractSet(MySetElement<T> head){
    this.head=head;
}

@Override
public MySetIterator<T> iterator() {

    return new MySetIterator<T>(this.head);
    
}


public boolean contains(Object o) {
    
    for(T t:this){
        if(t.equals(o)){
            return true;
        }
    } return false;
    
    
    
}



public boolean containsAll(Collection  c) {
    boolean isIn=true;
    for(Object tmp:c){
        if(!this.contains(tmp)){
            isIn=false;

        }

    }
    return isIn;
    
}




public boolean isEmpty() {
    return head==null;
}


public int size() {
    int big=0;
    for(T obj:this){
        big++;
    }
    return big;
}


public Object[] toArray() {
    throw new UnsupportedOperationException();
}



public <E> E[] toArray(E[] a) {
    throw new UnsupportedOperationException();
}

@Override
public String toString() {
    if(this.isEmpty())
        return "{}";
    MySetIterator<T> iter=this.iterator();
    String result = "{";
    while(iter.hasNext()){
        result=result +iter.next().toString() + ",";

    }
    result+=iter.next().toString() + "}";
    return result;

 }








}

