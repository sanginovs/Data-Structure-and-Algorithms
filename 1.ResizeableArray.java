/*
 
 This is a Resizeable Array class, the array of list which will grow as you append items; 
 offers dynamic resizing; In Java, one can use an ArrayList;
 Each doubling takes O(n) time, but it happens so rarely that its amortized insertion
 time is still O(1).
 
 Why amortized insertion runtime is O(1)?
 When we increase an element to K elements, the array was previously half that size.
 Therefore, the total number of copies to insert N elements is roughly N/2+N/4+N/8+...+2+1
 which is less than N.
 E.g
 [1,2,3,4,5]
 [1,2,3,4,5 ,n,n,n,n,n]   N
 [1,2,3,4,6,7,8,9,10]
 [[1,2,3,4,6,7,8,9,10][n,n,n,n,n,n,n,n,n,n]]  N/2
 N/3 ...N/4
 
 */

public class ResizeableArray {
	private int[] items_array = new int[10]; //the array starts off with 10 empty spots
	private int size=0; //the actual size of array is zero; no items in it
	
	public int size(){
		return size;
	}
	
	
	public void set(int index, int item){ 
	    if(index<0 || index >= size){   //checking whether the index is out of bounds
	    	throw new ArrayIndexOutOfBoundsException(index);
	    } 
		items_array[index]=item;
	}
	
	public void append(int item) //this method appends item to an end of the list
	{
		ensureExtraSpace(); //check if there's extra space in the array
		items_array[size]=item;
		size++;
	}
	
	private void ensureExtraSpace()
	{
		if (size==items_array.length) //is size of array equal to an actual size of array, then there's no space
		{
			int[] new_array = new int[2*size];  //create new array with twice the current size
			System.arraycopy(items_array, 0, new_array, 0, size); //copies all the items to a new array
			items_array=new_array; //items_array should point to new array now
		}
	}
		
	public int get(int index){  //this function returns an item from a specified array index
		if(index<0 && index >= size){   //checking whether the index is out of bounds
	    	throw new ArrayIndexOutOfBoundsException(index);
	    }
		return items_array[index];
		
	}
	
}
