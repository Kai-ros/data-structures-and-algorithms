package hashtable;

public class HashNode <Value>
{
    String key;
    Value value;
    HashNode next;

    public HashNode() {}

    public HashNode(String key, Value value)
    {
        this.key = key;
        this.value = value;
    }

    public String getKey()
    {
        return this.key;
    }

    public Value getValue()
    {
        return this.value;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public void setValue(Value value)
    {
        this.value = value;
    }

    public void setNext(HashNode node)
    {
        this.next = node;
    }
}
