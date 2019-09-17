package hashtable;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RepeatedWord
{

    public RepeatedWord() {}

    public String repeatedWord(String input)
    {
        if (input == null)
        {
            return " Invalid data set.";
        }
        if (input.isEmpty())
        {
            return " No repeated words.";
        }

        String[] individualWords = input.split("\\W+");
        Hashtable<String, Integer> wordBank = new Hashtable<>(10000);

        for(String word : individualWords)
        {
            word = word.toLowerCase();
            // If the word is already an entry in the hash table, return that word.
            if(wordBank.contains(word))
            {
                return word;
            }
            else
            {
                wordBank.add(word, 1);
            }
        }
        return "No repeated words.";
    }

}

// Resources:
// https://javarevisited.blogspot.com/2015/07/how-to-find-duplicate-words-in-string-java.html
// https://javaconceptoftheday.com/find-most-repeated-word-in-text-file-in-java/
