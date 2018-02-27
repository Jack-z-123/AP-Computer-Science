
public class BST<T extends Comparable<T>> {
	private T datum;
	private BST<T> left;  
	private BST<T> right;
	
	public BST(T datum) {
		this.datum = datum;
	}
	
	public T getDatum() {
		return this.datum;
	}
	
	public BST<T> getLeft(){
		return this.left;
	}
	
	public BST<T> getRight(){
		return this.right;
	}
	
	
	
	
	
}
