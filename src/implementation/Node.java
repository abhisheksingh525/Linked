package implementation;

public class Node {
    private float data;
    private implementation.Node next;

    //create getter and setter
    public float getData(){
        return data;
    }
    public implementation.Node getNext(){
        return next;
    }
    public void setData(float data){
        this.data = data;
    }
    public void setNext(implementation.Node next){
        this.next = next;
    }
    public Node(float data){
        this.data = data;
        next = null;
    }
}