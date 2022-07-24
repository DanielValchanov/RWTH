package mySets;

import java.util.Iterator;
import java.util.NoSuchElementException;


class MySetIterator<T> implements Iterator<T> {

   public MySetIterator(MySetElement<T> current){
       this.current=current;
   } 


   MySetElement<T> current; 

   @Override
   public boolean hasNext() {
       // TODO Auto-generated method stub
       if(current==null){
           return false;
       }
       return current.next!=null;
      
   }

   @Override
   public T next() {
       // TODO Auto-generated method stub
       
        T tmp;
        if(current==null){
            throw new NoSuchElementException();
        }else{
            tmp=current.value;
            current=current.next;
            return tmp;

        }

    }   

    @Override
    public void remove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    
    
}