public class Driver {

	public static void main(String[] args) {
		
		//Array of 50 with the "add at specified index" method
		ArrayList TestList = new ArrayList(50);
		for(int i=0; i<=49; i++){
			TestList.add(i, new Integer((int)(Math.random()*20+1))) ;
		}
		System.out.println("50 random numbers have been added to the array!");
		
		//default constructor, creates empty array of size 10 and prints it
		ArrayList TestList2 = new ArrayList();
		System.out.print("This is my default constructor array: ");
		System.out.print("[");
		int i;
		for(i=0; i<=8; i++){
			System.out.print(TestList2.get(i)+", ");
		}
		System.out.print(TestList2.get(i));
		System.out.println("]");
		
		//add to end of array, extending array by one element
		TestList.add(10);
		System.out.println("Now the value of the last index is 10. Success!");
		
		//get method
		System.out.println("Get value of 25th element: " + TestList.get(25));
		
		//size method
		System.out.println("The size of the first array is now: " + TestList.size());
		
		//isEmpty method
		System.out.println("Is the first array empty: " + TestList.isEmpty());
		
		//IsIn method
		System.out.println("Does 15 exist in the array? " + TestList.isIn(15));
		
		//find method
		System.out.println("Where is 15 in the array? At index " + TestList.find(15));
		
		//remove method with confirmation message
		TestList.remove(15);
		System.out.println("I removed the number 15 if it existed.");
		
	}

}
