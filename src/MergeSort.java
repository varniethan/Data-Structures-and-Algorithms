import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
public class MergeSort
{
    public int[] sort(int[] array)
    {
        System.out.println(Arrays.toString(array));
        int n =array.length;
        if (n == 1)
            return array;
        else
            return this.merge(this.sort(this.findSlice(array, 0, n/2)), this.sort(this.findSlice(array,n/2, n)));
    }

    public int[] merge(int[] left, int[] right)
    {
        System.out.println("Left "+Arrays.toString(left));
        System.out.println("Right "+Arrays.toString(right));
        List<Integer> result = new ArrayList<>();
        while (left.length > 0 && right.length > 0)
        {
            if (left[0] <= right[0])
            {
                result.add(left[0]);
                int[] tempArray = new int[left.length - 1];
                for (int i = 1, k=0; i < left.length; i++)
                {
                    tempArray[k++] = left[i];
                }
                left = tempArray;
            }
            else
            {
                result.add(right[0]);
                int[] tempArray = new int[right.length - 1];
                for (int i = 1, k=0; i < right.length; i++)
                {
                    tempArray[k++] = right[i];
                }
                right = tempArray;
            }
        }
        System.out.println("Start:");
        for (Integer a : result)
        {
            System.out.println(a);
        }
        System.out.println("End:");
        return result.stream().mapToInt(i->i).toArray();
    }

    public int[] findSlice(int[] array,int startIndex, int endIndex)
    {
        return IntStream.range(startIndex, endIndex).map(i -> array[i]).toArray();
    }
}
