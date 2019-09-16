package hashtable;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;


public class HashtableTest
{
    Hashtable hashTable;

    @Before
    public void initializeTestData()
    {
        hashTable = new Hashtable(1024);

        hashTable.add("John", "Husband");
        hashTable.add("Cathy", "Boss");
        hashTable.add("Amanda", "The Real Boss");
        hashTable.add("Allie", "Kid");
        hashTable.add("Zach", "Kid");
        hashTable.add("Rosie", "Dog");
        hashTable.add("Justin", "Student");
        hashTable.add("Demi", "Dog");
        hashTable.add("Ovi", "Student");
        hashTable.add("Ben", "Student");
        hashTable.add("Khalil", "Student");
        hashTable.add("Michael", "Student");
        hashTable.add("Timea", "Student");
        hashTable.add("Jason", "Student");
    }

    // Unimplemented:
    // Successfully retrieve a value from a bucket within the hashtable that has a collision
    // Successfully handle a collision within the hashtable

    @Test
    public void hashTable()
    {
        Hashtable hashTableTest = new Hashtable();
        assertEquals("A new hash table with no values is instantiated when the constructor is called.", "", hashTableTest.toString());
    }

    @Test
    public void hash()
    {
        assertEquals(
                "The hash() succesffuly hashes a key to an in-range value.",
                352,
                hashTable.hash("Test"));
    }

    // Adding a key/value to your hashtable results in the value being in the data structure
    @Test
    public void add()
    {
        hashTable.add("Test", "Value");
        assertEquals(
                "The add() successfully adds a key/value pair to the hash table.",
                "Value",
                hashTable.get("Test"));

    }

    @Test
    public void get()
    {
        assertEquals("The get() returns the correct value when supplied with a key.", "Dog", hashTable.get("Demi"));
    }

    @Test
    public void contains()
    {
        assertEquals(
                "The contains() will return a false for any value not contained in the hash table.",
                false,
                hashTable.contains("Emperor Palpatine"));
    }

    @Test
    public void testToString()
    {
        assertEquals(
                "The toString()prints all of the entries contained in the hash table.",
                "Target 36 : Student\n" +
                        "Target 42 : Dog\n" +
                        "Target 111 : The Real Boss\n" +
                        "Target 139 : Kid\n" +
                        "Target 145 : Student\n" +
                        "Target 214 : Student\n" +
                        "Target 228 : Student\n" +
                        "Target 410 : Husband\n" +
                        "Target 416 : Boss\n" +
                        "Target 590 : Student\n" +
                        "Target 636 : Student\n" +
                        "Target 675 : Student\n" +
                        "Target 687 : Dog\n" +
                        "Target 898 : Kid\n",
                hashTable.toString());
    }


}

