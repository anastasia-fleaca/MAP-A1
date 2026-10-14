package repository;

import exceptions.RepositoryException;
import model.FruitTree;

public class TreeRepository implements Repository {
    private final FruitTree[] trees;
    private int size;

    public TreeRepository(int capacity) {
        this.size = 0;
        this.trees = new FruitTree[capacity];
    }

    @Override
    public void add(FruitTree tree) throws RepositoryException {
        if (size >= trees.length) {
            throw new RepositoryException("The repository is full");
        }
        trees[size] = tree;
        size++;
    }

    @Override
    public void remove(int position) throws RepositoryException {
        if (position < 0 || position >= size) {
            throw new RepositoryException("The position is out of range");
        }

        for (int i = position; i < size-1; i++) {
            trees[i] = trees[i+1];
        }
        trees[size-1] = null;
        size--;
    }

    @Override
    public FruitTree[] getAll() {
        FruitTree[] result = new FruitTree[size];
        for (int i = 0; i < size; i++) {
            result[i] = trees[i];
        }
        return result;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
