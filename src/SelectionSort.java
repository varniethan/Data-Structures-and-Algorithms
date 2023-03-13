public class SelectionSort {

    /**
     * Algorithm divides the input list in two parts: sorted sublist of items, remaining unsorted items
     * Initially, the sorted sublist is empty and the unsorted sublist is the entire input list.
     * The algorithm proceeds by finding the smallest element in the unsorted sublist, swapping it with the leftmost unsorted element.
     * **/
    public int array[];
    public SelectionSort(int array_to_sort[])
    {
        this.array = array_to_sort;
    }

    public int[] sort()
    {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
        {
            int k = i; //smallest value so far
            for (int j = i+1; j < n; j++)
            {
                if (this.array[j] < this.array[k])
                {
                    k = j;
                }
            }
            int temp = this.array[i];
            this.array[i] = this.array[k];
            this.array[k] = temp;
        }
        return this.array;
    }

}
