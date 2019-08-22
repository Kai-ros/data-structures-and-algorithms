package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiBracketValidationTest
{
    MultiBracketValidation testMultiBracketValidation = new MultiBracketValidation();

    @Before
    public void initializeTestData()
    {

    }

    @Test
    public void testMultiBracketValidation()
    {
        String testString1 = "{}"; // true
        String testString12 = "["; // false

        assertEquals(
                "Method asserts true for correct inputs.",
                true,
                testMultiBracketValidation.multiBracketValidation(testString1));
        assertEquals(
                "Method asserts false for incorrect inputs.",
                false,
                testMultiBracketValidation.multiBracketValidation(testString12));
    }

    @Test
    public void testMultiBracketValidation_TrueCases()
    {
        String testString2 = "[]"; // true
        String testString3 = "()"; // true
        String testString4 = "{}[]()"; // true
        String testString5 = "{}[](){}[]()"; // true
        String testString6 = "[]()"; // true
        String testString7 = "(text)"; // true
        String testString8 = "[text]"; // true
        String testString9 = "{text}"; // true
        String testString10 = "{}[]()[{()}]"; // true
        String testString11 = "{}[](){text}"; // true

        assertEquals(
                "Method asserts true for correct inputs.",
                true,
                testMultiBracketValidation.multiBracketValidation(testString2));
        assertEquals(
                "Method asserts true for correct inputs.",
                true,
                testMultiBracketValidation.multiBracketValidation(testString3));
        assertEquals(
                "Method asserts true for correct inputs.",
                true,
                testMultiBracketValidation.multiBracketValidation(testString4));
        assertEquals(
                "Method asserts true for correct inputs.",
                true,
                testMultiBracketValidation.multiBracketValidation(testString5));
        assertEquals(
                "Method asserts true for correct inputs.",
                true,
                testMultiBracketValidation.multiBracketValidation(testString6));
        assertEquals(
                "Method asserts true for correct inputs.",
                true,
                testMultiBracketValidation.multiBracketValidation(testString7));
        assertEquals(
                "Method asserts true for correct inputs.",
                true,
                testMultiBracketValidation.multiBracketValidation(testString8));
        assertEquals(
                "Method asserts true for correct inputs.",
                true,
                testMultiBracketValidation.multiBracketValidation(testString9));
        assertEquals(
                "Method asserts true for correct inputs.",
                true,
                testMultiBracketValidation.multiBracketValidation(testString10));
        assertEquals(
                "Method asserts true for correct inputs.",
                true,
                testMultiBracketValidation.multiBracketValidation(testString11));
    }

    @Test
    public void testMultiBracketValidation_FalseCases()
    {
        String testString13 = ")"; // false
        String testString14 = "{"; // false
        String testString15 = "("; // false
        String testString16 = "]"; // false
        String testString17 = "}"; // false
        String testString18 = "{}[](){text}["; // false
        String testString19 = "{}]({text["; // false
        String testString20 = "}]))]]]])))]"; // false
        String testString21 = "text!@*$^^%*%(#))@)$@($@($&&^%$^$#*#(){}]({text["; // false

        assertEquals(
                "Method asserts false for incorrect inputs.",
                false,
                testMultiBracketValidation.multiBracketValidation(testString13));
        assertEquals(
                "Method asserts false for incorrect inputs.",
                false,
                testMultiBracketValidation.multiBracketValidation(testString14));
        assertEquals(
                "Method asserts false for incorrect inputs.",
                false,
                testMultiBracketValidation.multiBracketValidation(testString15));
        assertEquals(
                "Method asserts false for incorrect inputs.",
                false,
                testMultiBracketValidation.multiBracketValidation(testString16));
        assertEquals(
                "Method asserts false for incorrect inputs.",
                false,
                testMultiBracketValidation.multiBracketValidation(testString17));
        assertEquals(
                "Method asserts false for incorrect inputs.",
                false,
                testMultiBracketValidation.multiBracketValidation(testString18));
        assertEquals(
                "Method asserts false for incorrect inputs.",
                false,
                testMultiBracketValidation.multiBracketValidation(testString19));
        assertEquals(
                "Method asserts false for incorrect inputs.",
                false,
                testMultiBracketValidation.multiBracketValidation(testString20));
        assertEquals(
                "Method asserts false for incorrect inputs.",
                false,
                testMultiBracketValidation.multiBracketValidation(testString21));
    }
}
