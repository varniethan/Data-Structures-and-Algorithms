public class BubbleSort
{
    public int array[];
    public BubbleSort(int array_to_sort[])
    {
        this.array = array_to_sort;
    }

    public int[] sort()
    {
        int n = this.array.length;
        boolean swapped;
        do
        {
            swapped = false;
            for (int i = 1; i < n-1; i++)
            {
                if (this.array[i-1] > this.array[i])
                {
                    int temp = this.array[i-1];
                    this.array[i-1] = this.array[i];
                    this.array[i] = temp;
                    swapped = true;
                }
            }
        }while (swapped != false);
        return this.array;
    }


}
