package stacksandqueues;

public class MultiBracketValidation
{

    MultiBracketValidation() {}

    public static boolean multiBracketValidation(String input)
    {
        boolean validation = false;

        Stack<Character> validationStack = new Stack();

        for (int i = 0; i < input.length(); i++)
        {
            char letter = input.charAt(i);

            if ((letter == '(') || (letter == '{')  || (letter == '['))
            {
                validationStack.push(letter);

            }
            else if (letter == ')')
            {
                char matchingBracket = ' ';
                if (validationStack.size() > 0)
                {
                    matchingBracket = validationStack.pop();
                }
                if (matchingBracket == '(')
                {
                    validation = true;
                }
                else
                {
                    validation = false;
                }
            }
            else if (letter == '}')
            {
                char matchingBracket = ' ';
                if (validationStack.size() > 0)
                {
                    matchingBracket = validationStack.pop();
                }
                if (matchingBracket == '{')
                {
                    validation = true;
                }
                else
                {
                    validation = false;
                }
            }
            else if (letter == ']')
            {
                char matchingBracket = ' ';
                if (validationStack.size() > 0)
                {
                    matchingBracket = validationStack.pop();
                }
                if (matchingBracket == '[')
                {
                    validation = true;
                }
                else
                {
                    validation = false;
                }
            }
        }
        if (validationStack.size() != 0)
        {
            validation = false;
        }

        return validation;
    }
}

// Resources
// https://stackoverflow.com/questions/196830/what-is-the-easiest-best-most-correct-way-to-iterate-through-the-characters-of-a