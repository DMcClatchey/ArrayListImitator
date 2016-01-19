//David McClatchey CSC3410
//
//Program purpose: to replicate aspects of the ArrayList class in java and
//to replicate some of its methods as well. These methods include adding, getting
//the array size, getting a value, determining if the array is empty, determining
//if a value is in the array, finding the location of a value, and removing
//
//How to use, expected input/output: The program is used through the driver where
//two arrays are created and all of the methods are executed. If a method returns
//a value, that value is printed, but if it is a void method, then a message is 
//printed that the method executed.
//
//Purpose of each class: the Driver class executes the program and the ArrayList
//class includes the constructors, methods, and all of the functionality
//required.


import java.util.*;
public class ArrayList {
	
	protected Object[] thearray;
			
	//default constructor
	public ArrayList(){
		thearray = new Object[10];
	}
	
	//constructor with size specified
	public ArrayList(int i){
		thearray = new Object[i];
	}
	
	//add method, uses arrays copyOf method
	public void add(Object x){
		thearray = Arrays.copyOf(thearray, (thearray.length + 1));//extends array
		thearray[thearray.length-1] = x; //fills the last index with x
	}
	
	//add at specific location
	public void add(int index, Object x){
		thearray[index]=x;
	}
	
	//get method
	public Object get(int index){
		return thearray[index];
	}
	
	//size method, counts the number of indexes that contain elements
	public int size(){
		//case where there are no indexes
		if(thearray.length==0){
			return 0;
		}
		int count=0;
		//for loop counts the number of null elements
		for(int i=0; i<=thearray.length-1; i++){
			if(thearray[i]==null){
				count++;
			}
		}
		//if no null elements counted, return array length
		if(count==0){
			return thearray.length;
		}
		//case where some, but not all, indexes are null
		else return (thearray.length-count);
	}
	
	//isEmpty method
	public boolean isEmpty(){
		//case where there are no indexes
		if(thearray.length==0){
			return true;
		}
		else{
			int count=0;
			//for loop counts the number of null elements
			for(int i=0; i<=thearray.length-1; i++){
				if(thearray[i]==null){
					count++;
				}
			}
			//if count==array length, then all indexes null, empty 
			if(thearray.length==count)
				return true;
			else return false;
		}
	}
	
	//isIn method
	public boolean isIn(Object ob){
		int j=0;
		//for loop changes j value to 1 if object is found in array
		for(int i=0; i<=thearray.length-1; i++){
			//compares ob and array value, j becomes 1 when found
			if(thearray[i].equals(ob)){
				j=1;
				break;
			}
		}
		if(j==1){
			return true;
		}
		else return false;
	}
	
	//find method
	public int find (Object n){
		int index=-1;//default return value if object not found
		//compares n and array values, changes index to i if found
		for(int i=0; i<=thearray.length-1; i++){
			if(thearray[i].equals(n)){
				index = i;
				break;
			}
		}
		return index;
	}
	
	//remove method
	public void remove (Object n){
		int i;
		//loop breaks when i is found to be equal to n
		for(i=0; i<=thearray.length-1; i++){
			if(thearray[i].equals(n)){
				break;
			}
		}
		//if i is never equal to n above, then i=array.length at end of for loop. So
		//if i!=array.length, then n was found, gets removed by loop below
		if(i!=thearray.length){
				//loop shifts values to the left starting at index i, where n was 
				//found, then copy made and last index deleted.
				for(int j=i; j<=thearray.length-2; j++){
					thearray[j]=thearray[j+1];
				}
				thearray = Arrays.copyOf(thearray, (thearray.length-2));
		}
	}
	
}

