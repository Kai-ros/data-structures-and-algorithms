//add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
//get: takes in the key and returns the value from the table.

package hashtable;

public class Hashtable <Value>
{
    private HashNode[] table;
    private int entryCount;

    public Hashtable() {}

    public Hashtable(int size)
    {
        this.table = new HashNode[size];
        this.entryCount = 0;
    }

    public int hash(String key)
    {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for ( int i = 0; i < letters.length; i++)
        {
            hashValue += letters[i];
        }
        hashValue = (hashValue * 599) % table.length;

        return hashValue;
    }
    public void add(String key, Value value)
    {
        int target = hash(key);
        HashNode<Value> entry = table[target];

        while (entry != null)
        {
            if (entry.key.equals(key))
            {
                break;
            }
            entry = entry.next;
        }
        if (entry != null)
        {
            entry.value = value;
        }
        else
        {
            HashNode newNode = new HashNode();
            newNode.key = key;
            newNode.value = value;
            newNode.next = table[target];
            table[target] = newNode;
            entryCount++;
        }
    }

    public Value get(String key) {
        int target = hash(key);
        HashNode<Value> entry = table[target];

        while (entry != null)
        {
            if (entry.key.equals(key))
            {
                return entry.value;
            }
            entry = entry.next;
        }

        return null;
    }

    public boolean contains(String key)
    {
        int target = hash(key);
        HashNode entry = table[target];

        while (entry != null)
        {
            if (entry.key.equals(key))
            {
                return true;
            }
            entry = entry.next;
        }

        return false;
    }

    public String toString()
    {
        StringBuilder outputMessage = new StringBuilder();

        if (table == null)
        {
            return outputMessage.toString();
        }

        for (int i = 0; i < table.length; i++)
        {
            HashNode entry = table[i];

            while (entry != null)
            {
                outputMessage.append("Target "+ (i + 1) +" : " + entry.value + "\n");
                entry = entry.next;
            }
        }

        return outputMessage.toString();
    }



    /* goodHash() which gives a hash value for a given string/Object */
//    private int goodHash(String key )
//    {
//        int hashVal = key.hashCode();
//        hashVal %= TABLE_SIZE;
//        if (hashVal < 0)
//            hashVal += TABLE_SIZE;
//        return hashVal;
//    }
}