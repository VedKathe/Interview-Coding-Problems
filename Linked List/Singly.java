

class Singly{
    public Node head = null;    
      
    //create
    void create(int x)
    {
        Node obj = new Node(x);
        
        if(this.head == null)
        {
            this.head = obj;
        }
        else{
            obj.link = head;
            this.head = obj;
        }
    }
    //insert
    void insertAtLast(int x){
        Node temp=head;
        
        Node obj = new Node(x);
  
        while(temp.link!=null)
        {   
            temp=temp.link;
        }

        temp.link=obj;

    }

    void insertAt(int data,int index){

        Node obj = new Node(data);
        Node temp = head;
        int i = 1;
        while(i<index-1){
            temp=temp.link;
            i++;
        }
        obj.link=temp.link;
        temp.link=obj;
    }
    //delete
    void deleteAt(int data){
        Node temp = head;

        if(temp.data==data)
        {
            head = temp.link;
        }
        while(temp.link!=null){
            if(temp.link.data==data)
            {
                temp.link = temp.link.link;
                break;
            }
            temp = temp.link;
        }
    }
    //peek

    //print
    void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.link;
        }

    }

    int size(){
        Node temp = head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp = temp.link;
        }
        return count;
    }

    void reverse(){
        Node next = null;
        Node current = head;
        Node prv = null;

        while(current!=null)
        {
            next = current.link;
            current.link = prv; 
            prv = current;
            current = next;
        }
        head = prv;

    }
 
}