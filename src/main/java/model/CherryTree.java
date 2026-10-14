package model;

import exceptions.ValidationException;

public class CherryTree implements FruitTree {
    private final int age;
    public CherryTree(int age)
    {
        if (age < 0) {
            throw new ValidationException("Age cannot be negative");
        }
        this.age = age;
    }

    @Override
    public int getAge()
    {
        return this.age;
    }

    @Override
    public String getType()
    {
        return "Cherry";
    }

    @Override
    public String toString()
    {
        return "Cherry tree of age " + this.age;
    }
}
