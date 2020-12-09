package ArrayList;

public class LinkdListConcept {
	Node  head;
	
	class Node{
		int data;
		Node Next;
		
		Node(int data){
			this.data= data;
			Next=null;
			
		}
		

	}
	
	public void printMyNodelist() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.Next;
		}
	}
	
	
	public static void main(String[] args) {
		LinkdListConcept ll =new LinkdListConcept();
		
      Node first = ll. new Node(10);
         
         ll.head=first;
         
        Node second= ll.new Node(20);
        first.Next=second;
        
       Node third= ll.new Node(30);
       second.Next=third;
       
      ll.printMyNodelist();
      
	}

}
