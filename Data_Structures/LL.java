public class LL{

    Node head;
    private int size;

    LL(){
        this.size = 0;
    }
    public class Node{
        String  data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //Add Data from front
    public void AddFirst(String data){
        Node node = new Node(data);
        if(head == null)
        {   
            head = node;
            return ;
        }
        node.next = head;
        head = node;
    }
    //add data from back
    public void AddLast(String data)
    {
        Node node = new Node(data);
        if(head == null)
        {   
            head = node;
            return ;
        }
        Node curNode = head;
        while(curNode.next != null)
        {
            curNode = curNode.next;
        }
        curNode.next = node;
    }    


    //delete from first
    public void DeleteFirst(){
        if(head == null)
        {
            System.out.println("Already Empty");
            return;
        }
        head = head.next;
    }

    //delete from last
    public void DeleteLast()
    {
        if(head == null)
        {
            System.out.println("Already Empty");
            return;
        }
        Node second = head;
        Node lastNode = head.next;

        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            second = second.next;
        }

        second.next = null;     
    }

    public void PrintList(){

        if(head == null)
        {
            System.out.println("Linked List is empty");
            return;
        }

        Node currnode = head;
        while(currnode != null)
        {
            System.out.println(currnode.data);
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        LL newlink = new LL();
        newlink.AddFirst("Manvith");
        newlink.AddFirst("Sanjana");
        // newlink.PrintList();
        // System.out.println("hlloe");
    }
}