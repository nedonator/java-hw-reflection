public class Carrier<T> {
    public T item;

    public Carrier(){
    }
    public Carrier(T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }
    public void setItem(T item){
        this.item = item;
    }
}
