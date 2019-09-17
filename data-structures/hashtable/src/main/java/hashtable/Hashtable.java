//add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
//get: takes in the key and returns the value from the table.

package hashtable;

import java.util.ArrayList;

public class Hashtable <Key, Value>
{
    public HashNode[] table;
    public int entryCount;

    public Hashtable() {}

    public Hashtable(int size)
    {
        this.table = new HashNode[size];
        this.entryCount = 0;
    }

    public int hash(Key key)
    {
        int hashValue = key.hashCode();
        hashValue %= table.length;
        if (hashValue < 0) { hashValue += table.length; }

        return hashValue;
    }

    public void add(Key key, Value value)
    {
        int target = hash(key);
        HashNode<Key, Value> entry = table[target];

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

    public Value get(Key key) {
        int target = hash(key);
        HashNode<Key, Value> entry = table[target];

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

    public ArrayList<Key> getKeys()
    {
        ArrayList<Key> arrayBuilder = new ArrayList<>();

        for (int i = 0; i < table.length; i++)
        {
            HashNode<Key, Value> entry = table[i];

            while (entry != null)
            {
                arrayBuilder.add(entry.key);
                entry = entry.next;
            }
        }

        return arrayBuilder;
    }

    public boolean contains(Key key)
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
                outputMessage.append("Target "+ i + " : " + entry.value + "\n");
                entry = entry.next;
            }
        }

        return outputMessage.toString();
    }




}