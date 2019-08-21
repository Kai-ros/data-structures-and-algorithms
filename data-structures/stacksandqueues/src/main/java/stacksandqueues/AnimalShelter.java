package stacksandqueues;

import java.util.NoSuchElementException;

public class AnimalShelter
{
    Queue <Animal> dogStack;
    Queue <Animal> catStack;
    int numberOfDogs;
    int numberOfCats;
    int animalShelterSize;

    public AnimalShelter()
    {
        this.dogStack = new Queue<>();
        this.catStack = new Queue<>();
        this.numberOfDogs = 0;
        this.numberOfCats = 0;
        this.animalShelterSize = 0;
    }

    public void enqueue(Animal species)
    {
        if (species.getClass() == Dog.class)
        {
            this.dogStack.enqueue(species);
            this.numberOfDogs++;
        }
        else if (species.getClass() == Cat.class)
        {
            this.catStack.enqueue(species);
            this.numberOfCats++;
        }
    }

    public Animal dequeue(Animal preference)
    {
        Animal animalToReturn = null;

        if ((preference instanceof Dog) && (numberOfDogs != 0))
        {
            animalToReturn = dogStack.dequeue();
            this.numberOfDogs--;
        }
        else if ((preference instanceof Cat) && (numberOfCats != 0))
        {
            animalToReturn = catStack.dequeue();
            this.numberOfCats--;
        }
        return animalToReturn;
    }

    public String toString()
    {
        StringBuilder outputMessage = new StringBuilder();

        outputMessage.append("Dog ").append(dogStack.toString());

        outputMessage.append("Cat ").append(catStack.toString());

        return outputMessage.toString();
    }

    public int getAnimalShelterSize()
    {
        animalShelterSize = this.numberOfDogs + this.numberOfCats;

        return animalShelterSize;
    }

}
