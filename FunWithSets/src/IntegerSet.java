
public class IntegerSet {
	
	public int[] elements;
	
	public int numElements;
	
	public IntegerSet(int maxNumElements){
		this.elements = new int[maxNumElements];
		this.numElements = 0;
	}
	
	public boolean isMember(int key){
		for(int i = 0; i < this.numElements; i++){
			if(key == (elements[i])){
				return true;
			}
		}
		return false;
	}
	
	public boolean isFull(){
		return (this.numElements == elements.length);
	}
	
	public void add(int newMember){
		if(this.isFull()){
			int[] tempArray = new int[numElements * 2];
			for(int i = 0; i < numElements; i++){
				tempArray[i] = elements[i];
			}
			elements = tempArray;
		}
		elements[numElements] = newMember;
		numElements++;
		}
	}

