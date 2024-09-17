import java.util.Iterator;
import java.util.LinkedList;


public class listeSimple {
	
	private Node head;
	private long size;
		
	public listeSimple() {
		head = null;
		size = 0;
	}
	
	public listeSimple(Node head) {
		size = 0;
	}
	
	public listeSimple(Node head, long size) {

	}
	
	public void addBegin(int valeur) {
		Node newNode = new Node(valeur, null);
		newNode.setNext(head);
		this.head = newNode;
		++this.size;
	}
	
	public Node avantDernier() {
		Node node = head;
		while (node.getNext().getNext()!= null) {
            node = node.getNext();
        }
		return node;
	}
	
	public void inverser() {	
	 	Node temporaire1 = null;
	 	Node temporaire2 = null;
	    Node pointeur = head;
	    

	    while (pointeur != null) {
	        temporaire2 = pointeur.getNext(); 
	        pointeur.setNext(temporaire1);
	        temporaire1 = pointeur;
	        pointeur = temporaire2;
	    }
	    
	    head = temporaire1;
	}
	
	
	public void echanger(Node x, Node y) {
		Node xTemp = null;
		Node yTemp = null;
		Node parcours = head;
	    
	    while ((xTemp != x || yTemp != y) && parcours.getNext() != null ) {
	    	
	    	if ( parcours.equals(x)) {
	    		xTemp = x;
	    		if (!(yTemp == null)) {
	    			parcours = yTemp;
	    		}
	    	}
	    	else if (parcours.equals(y)) {
	    		yTemp = y;
	    		if (!(xTemp == null)) {
	    			parcours = xTemp;
	    		}
	    	}
	    	parcours = parcours.getNext();
	    }
	    
	    
	}
	
	public String toString() {
		Node node = head;
		String result = "[" + head.toString();
		
		while (node.getNext() != null) {
            node = node.getNext();
            result = result + ", "+ node;
        }
		

		return (result + "]"); 
	}
	
	public static void main(String[] args) {
		listeSimple liste = new listeSimple();
		liste.addBegin(1);
		liste.addBegin(2);
		liste.addBegin(3);
		System.out.println(liste.avantDernier());
		System.out.println(liste.toString());
		liste.inverser();
		System.out.println(liste.toString());
		liste.addBegin(4);
		System.out.println(liste.toString());
		liste.echanger(new Node(3,null), new Node(4,null));
		System.out.println(liste.toString());
		}
	
	
	}
	

