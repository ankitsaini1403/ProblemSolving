class Node {
     int val ;
     Node next ;

     public Node(int val){
         this.val  = val ;
         
     }
}
class MyLinkedList {

    Node head ;
    int size ;

    public MyLinkedList() {
      this.head = null ;
      this.size = 0;        
    }


    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
          Node curr = head ;

          for(int i = 0 ; i<index ; i++){
               curr = curr.next ;
          }

         return curr.val ;

    }
    
    public void addAtHead(int val) {
        Node newNode =  new Node(val);
       
     
        newNode.next = head;
        head = newNode ;

        size++ ;

    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head ==null) head = newNode ;
        else {
              Node temp = head ;

              while(temp.next != null){
                 temp = temp.next;
              }
              
              temp.next = newNode ;
            

        }
        size++;

    }
    
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if(index<0 || index>size) return ;
         
         if(index==0){ 
            addAtHead(val);
               return ;}
    
            Node temp = head ;

           for(int i =0 ;i<index-1 ; i++){
                 
                 temp = temp.next ;
           } 

           newNode.next = temp.next ;
           temp.next  = newNode ;
           size++;   

    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return ;
   if(index == 0)  head = head.next;
    else{
         Node temp = head ;

         for(int  i = 0 ; i<index-1 ; i++){
             temp =temp.next ;
         } 

         temp.next  =temp.next.next ;

    }
    size--;
        


    }
}

