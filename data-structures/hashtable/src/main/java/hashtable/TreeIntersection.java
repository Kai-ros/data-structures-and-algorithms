package hashtable;

import hashtable.tree.*;

import java.util.ArrayList;

public class TreeIntersection
{
    public Integer[] treeIntersection(BinarySearchTree<Integer> input1, BinarySearchTree<Integer> input2)
    {
        if ((input1.root == null) || (input2.root == null))
        {
            return null;
        }

        ArrayList<Integer> treeInput1 = input1.preOrder();
        Hashtable<Integer, Integer> valueStore = new Hashtable<>(10000);
        int entryCount = 0;

        for(Integer number : treeInput1)
        {
            if (input2.contains(number))
            {
                valueStore.add(number, 1);
                entryCount++;
            }
        }

        Integer[] resultArray = valueStore.getKeys().toArray(new Integer[entryCount]);

        return resultArray;
    }
}
