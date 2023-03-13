public class InsertionSort
{
    /**
     *Insertion sort removes one element from the input data, find where it belongs to within the sorted list
     * **/
    public int array[];
    public InsertionSort(int array_to_sort[])
    {
        this.array = array_to_sort;
    }

    public int[] sort()
    {
        int n = this.array.length;
        for (int i = 1; i < n-1; i++)
        {
            int j = i;
            while (j > 0 && this.array[j-1] > this.array[j])
            {
                int temp = this.array[j];
                this.array[j] = this.array[j-1];
                this.array[j-1] = temp;
                j = j - 1;
            }
        }
        return this.array;
    }

}
