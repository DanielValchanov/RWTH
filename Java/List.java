public class List{
    int value;
    List next;
    private static final List EMPTY=new List(null,0);


    




     public List(List n,int v){
         next=n;
         value=v;
     }





     public int  getValue(){
            return value;
     }

     public List getNext(){
        return next;
     }
     public boolean isEmpty(){
         return this==EMPTY;
     }

     public int length(){
         return 

     }
}
if(this.isEmpty){
    return 0;
}else {
    return 1+this.getNext().length();
}

@Override
public String toString(){
    if(this.isEmpty()){
        return "";

    }else if(this.getNext().isEmpty(){
        return this.value=this.value+" .";
    }) else {
        return this.value + ", " + this.getNext();
    }


    public List getSubList(int i{
        if(this.isEmpty()|| i<=0){
            return EMPTY;
        }
        else {
            List next=this.getNext().getSubList(i-1);
            return new List(next,this.getValue());





        }
        }   
}