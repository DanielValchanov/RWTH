class List {
    Element head;




    void add(int i){
        this.last().next = new Element(i,head);
    }

    Element last(){
        if(head.equals(null)){return null;}
        else{
        Element cur = head;
        while(cur.next != head){
            cur=cur.next;
        }
        return cur;
        }
    }
}


class Element{
    int value;
    Element next;


    public Element(int value, Element next){
        this.value= value;
        this.next = next;

    }

}

public static void main(String[] args) {
    
}