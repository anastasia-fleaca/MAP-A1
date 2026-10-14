package repository;

import exceptions.RepositoryException;
import model.FruitTree;

public interface Repository {
    void add(FruitTree tree) throws RepositoryException;
    void remove(int position)  throws RepositoryException;
    FruitTree[] getAll();
    int getSize();
}
