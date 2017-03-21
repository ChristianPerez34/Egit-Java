
public class OrderedIntegerSet extends IntegerSet {

	public OrderedIntegerSet(int maxNumElements) {
		super(maxNumElements);
		// TODO Auto-generated constructor stub
	}
	
	public void add(int newMember){
		int insertPosition = -1;
		if(this.isFull()){
			int[] tempArray = new int[numElements * 2];
			for(int i = 0; i < numElements; i++){
				tempArray[i] = elements[i];
			}
			elements = tempArray; //Old array becomes garbage
		}
		for(int i = 0; i < this.cardinality(); i++){
			if(this.elements[i] == newMember){
				return;
			}
			else if(this.elements[i] > newMember){
				insertPosition = i;
			}
		}
		if(insertPosition == -1){
			this.elements[numElements] = newMember;
			this.numElements++;
			return;
		}
		// TO DO: Shift all members one position up
		for(int i = insertPosition; i < this.numElements; i++){
				this.elements[i + 1] = this.elements[i];
		}
		this.elements[insertPosition] = newMember;
		this.numElements++;
	}

}
