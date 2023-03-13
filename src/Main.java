public class Main {

    public static void print_array(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        int unsorted_array[] = {64, 25, 12, 22, 11};
        System.out.print("Unsorted array: ");
        print_array(unsorted_array);

//        System.out.print("Selection Sort: ");
//        SelectionSort selection_sort = new SelectionSort(unsorted_array);
//        print_array(selection_sort.sort());
//
//        System.out.print("Insertion Sort: ");
//        InsertionSort insertion_sort = new InsertionSort(unsorted_array);
//        print_array(insertion_sort.sort());
//
//        System.out.print("Bubble Sort:    ");
//        BubbleSort bubble_sort = new BubbleSort(unsorted_array);
//        print_array(bubble_sort.sort());

        System.out.println("Merge Sort:     ");
        print_array(unsorted_array);
        MergeSort merge_sort = new MergeSort();
        print_array(merge_sort.sort(unsorted_array));

    }
}