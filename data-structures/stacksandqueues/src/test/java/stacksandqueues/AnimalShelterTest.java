package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalShelterTest
{
    AnimalShelter testAnimalShelter;
    AnimalShelter strictlyCatsAnimalShelter;
    AnimalShelter emptyAnimalShelter;

    @Before
    public void initializeTestData()
    {
        testAnimalShelter = new AnimalShelter();
        strictlyCatsAnimalShelter = new AnimalShelter();
        emptyAnimalShelter = new AnimalShelter();

        Dog masterChief = new Dog("Master Chief");
        Dog rook = new Dog("Rook");
        Cat mittens = new Cat("Mittens");
        Cat isis = new Cat("Isis");
        Cat sister = new Cat("Sister");
        Animal knives = new Animal("Knives");

        testAnimalShelter.enqueue(masterChief);
        testAnimalShelter.enqueue(mittens);
        testAnimalShelter.enqueue(rook);
        testAnimalShelter.enqueue(isis);
        testAnimalShelter.enqueue(sister);
        testAnimalShelter.enqueue(knives);

        strictlyCatsAnimalShelter.enqueue(mittens);
        strictlyCatsAnimalShelter.enqueue(isis);
        strictlyCatsAnimalShelter.enqueue(sister);

    }

    @Test
    public void testAnimalShelter()
    {
        assertEquals(
                "Enqueue() successfully adds dogs to the internal dog queue.",
                2,
                testAnimalShelter.numberOfDogs);
        assertEquals(
                "Enqueue() successfully adds dogs to the internal cat queue.",
                3,
                testAnimalShelter.numberOfCats);
    }

    @Test
    public void testAnimalShelter_Enqueue()
    {
        assertEquals(
                "Enqueue() successfully adds the Animal objects in the correct order.",
                "Master Chief",
                        testAnimalShelter.dogStack.front.data.name);
    }

    @Test
    public void testAnimalShelter_EnqueueFaultyArguments()
    {
        assertEquals(
                "Enqueue will only work on inputs of the correct data type.",
                5,
                testAnimalShelter.getAnimalShelterSize());
    }

    @Test
    public void testAnimalShelter_Dequeue()
    {
        assertEquals(
                "Enqueue() successfully adds the Animal objects in the correct order.",
                "Master Chief",
                testAnimalShelter.dequeue(new Dog()).name);
    }

    @Test
    public void testAnimalShelter_DequeueEmptyAnimalShelter()
    {
        assertEquals(
                "Dequeue() successfully returns null if the Animal Shelter is empty.",
                null,
                emptyAnimalShelter.dequeue(new Dog()));
    }

    @Test
    public void testAnimalShelter_DequeueWrongAnimalType()
    {
        assertEquals(
                "Enqueue() successfully returns null if the Animal Shelter has no animals of that type.",
                null,
                strictlyCatsAnimalShelter.dequeue(new Dog()));
    }
}
