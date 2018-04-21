package lesson.a.java.di;

public class SortThenSearch {
	
	private Isort sort;
	
	public SortThenSearch(Isort sort) {
		this.sort = sort;
	}
	
	public int FindTheIndex(int[] arr, int indexFor) {
		
		int[] sorted = sort.SortThisArray(arr);
		
		@SuppressWarnings("unlikely-arg-type")
		int index = getArrayIndex(arr,indexFor);
		
		return index;
	}
	
	private int getArrayIndex(int[] arr,int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
    return k;
}
	

}
