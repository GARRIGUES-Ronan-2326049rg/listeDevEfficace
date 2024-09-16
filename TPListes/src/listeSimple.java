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
		System.out.println("-------");
		liste.inverser();
		System.out.println(liste.toString());
		}
	
	
	}
	

