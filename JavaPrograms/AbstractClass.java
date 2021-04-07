interface NodeList{
	ListItem getRoot();
	boolean addItem(ListItem item);
	boolean removeItem(ListItem item);
	void traverse(ListItem root);
}

abstract class ListItem{
	protected ListItem rightLink = null;
	protected ListItem leftLink = null;

	protected Object values;

	public ListItem(Object values){
		this.values=values;
	}

	abstract ListItem next();
	abstract ListItem setNext(ListItem item);
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem item);

	abstract int compareTo(ListItem item);

	public Object getValue(){
		return values;
	}
	public Object setValue(){
		this.values=values;
		return values;
	}
}
class Node extends ListItem{
	public Node(Object values){
		super(values);
	}

	@Override
	ListItem next(){
		return this.rightLink;
	}

	ListItem setNext(ListItem item){
		this.rightLink = item;
		return this.rightLink;
	}
	ListItem previous(){
		return this.leftLink;
	}

	ListItem setPrevious(ListItem item){
		this.leftLink = item;
		return this.leftLink;
	}
	int compareTo(ListItem item){
		if (item!=null) {
			return ((String) super.getValue()).compareTo((String) item.getValue());
		}else{
			return -1;
		}
	}
}
class MyLinkedList implements NodeList{
	
	private ListItem root = null;
	
	public MyLinkedList(ListItem root){
		this.root=root;
	}

	public ListItem getRoot(){
		return this.root;
	}
	
	public boolean addItem(ListItem item){
		if(this.root == null){
			this.root = item;
			return true;
		}
		ListItem currentItem = this.root;
		while(currentItem!=null){
			int comparison = (currentItem.compareTo(item));
			if (comparison<0) {
				//New itemis greater, mow right if possible
				if (currentItem.next()!=null) {
					currentItem = currentItem.next();
				}else{
					//We reached at the end of the List
					currentItem.setNext(item);
					item.setPrevious(currentItem);
					return true;
				}
			}else if (comparison>0){
				//New itemis is less, so set before
				if (currentItem.previous() != null) {
					currentItem.previous().setNext(item);
					item.setPrevious(currentItem.previous());
					item.setNext(currentItem);
					currentItem.setPrevious(item);
					return true;
				}else{
					item.setNext(this.root);
					this.root.setPrevious(item);
					this.root = item;
					return true;
				}
			}else{
				//Equal
				System.out.println(item.getValue() +" is already present in the list, not added");
				return false;
			}
		} 
		return false;
	}
	
	public boolean removeItem(ListItem item){
		if (item!=null) {
			System.out.println(item.getValue() + " is Deleting");
		}

		ListItem currentItem = this.root;
		while(currentItem!=null){
			int comparison = currentItem.compareTo(item);
			if (comparison==0) {
				//found the item to delete
				if (currentItem==this.root) {
					this.root = currentItem.next();
				}else{
					currentItem.previous().setNext(currentItem.next());
					if (currentItem.next()!=null) {
						currentItem.next().setPrevious(currentItem.previous());
					}
				}
				return true;
			}else if (comparison<0) {
				currentItem = currentItem.next();
			}else{
				return false;
			}
		}
		return false;
	}
	public void traverse(ListItem root){
		if(root==null){
			System.out.println("The list is Empty");
		}else{
			while(root!=null){
				System.out.println(root.getValue());
				root = root.next();
			}
		}
	}
}

public class AbstractClass{
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList(null);
		list.traverse(list.getRoot());	

		String stringData = "Delhi Mumbai Banglore Chennai Kolkata Ahemdabad Surat Jaipur Udaipur Delhi";
		String[] data = stringData.split(" ");
		for (String s : data) {
		 	list.addItem(new Node(s));
		} 
		list.traverse(list.getRoot());
		list.removeItem(new Node("Udaipur"));
		list.traverse(list.getRoot());
	}
}