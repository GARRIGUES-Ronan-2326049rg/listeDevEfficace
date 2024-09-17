
public class listesDouble {
	private DNode header, trailer;
	private long size;
	
	private listesDouble() {
		header = new DNode(null, null, null);
		trailer = new DNode(null, header, null);
		header.setNext(trailer);
		size = 0;
	}
	
	public void addBegin(int valeur) {
		DNode newNode = new DNode(valeur, header, null);
		this.header = newNode;
		++this.size;
	}
	
	public String toString() {
        DNode nodeProvisoire = this.header;       
        String affichage = "[" + header.toString();
        while (nodeProvisoire.getNext() != null) {
            nodeProvisoire = nodeProvisoire.getNext();
            affichage = affichage + ", "+ nodeProvisoire;
        }
        return (affichage + ']' +'\n');
    }
	

	
	public static void main(String[] args) {
		listesDouble liste = new listesDouble();
		System.out.println(liste.toString());
		}
		
	
	
}
