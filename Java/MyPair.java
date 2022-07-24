package mySets;

class MyPair<T,U>{
    T first;
    U second;
    public MyPair(T t, U u) {
        first = t;
        second = u;
    }
    public T getFirst() {
        return first;
    }
    public U getSecond() {
        return second;
    }
    @Override
    public String toString() {
        return "(" + first.toString() + ", " + second.toString() + ")";
    }
    
}