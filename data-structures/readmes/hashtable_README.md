# Hashtables
Implement a hashtable.

## Challenge
Implement a Hashtable with the following methods:

1. ```add```: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
2. ```get```: takes in the key and returns the value from the table.
3. ```contains```: takes in the key and returns a boolean, indicating if the key exists in the table already.
4. ```hash```: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency
I implemented what I believe to be a standard hash table template.
Time Complexity: O(1) - Average / O(n) - Worst
Space Complexity: O(n)

## API
* -- Hashtable.java
* ---- Hashtable()
* ---- setTableSize()
* ---- add()
* ---- get()
* ---- contains()
* ---- hash()
* ---- toString()
