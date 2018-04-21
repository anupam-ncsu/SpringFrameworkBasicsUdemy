package lesson.a.ten.java.di;

public class Main {
	
	public static void main(String[] args) {
		
		int[] unsorted = {2,3,1,4,5,7,6,0,9,8};
		
		SortThenSearch sortSearch = new SortThenSearch(new BubbleSort());
		
		int result = sortSearch.FindTheIndex(unsorted, 4);
		System.out.println("index is: "+ result);
	}

}
