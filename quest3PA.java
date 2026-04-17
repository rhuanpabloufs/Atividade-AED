public class Node {
  public Object item ; // dado armazenado ( generico )
  public Node next ; // referencia ao proximo no
  public Node(Object item){
      this.item = item;
      this.next = null;
  }
  public Node(Object item, Node next){
    this.item = item;
    this.next = next;
  }
}
