
public class listesDouble {
	private DNode header, trailer;
	private long size;
	
	public void setHeader(DNode header) {
		this.header = header;
	}
	
	public DNode getHeader() {
		return this.header;
	}
	
	public void setTrailer(DNode trailer) {
		this.trailer = trailer;
	}
	
	public DNode getTrailer() {
		return this.trailer;
	}
	
	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	private listesDouble() {
		header = new DNode(0, null, null);
		trailer = new DNode(0, header, null);
		header.setNext(trailer);
		setSize(0);
	}
	
	public int nbNoeuds() {
        DNode dNode = this.header;
        int compteur = 1;
        
        while(dNode.getNext() != this.header) {
            dNode = dNode.getNext();
            ++compteur;
        }    
        return compteur;
    }
	

	
	public static void main(String[] args) {
		listesDouble liste = new listesDouble();
		}
		
	
	
}
