package controller;

import exceptions.RepositoryException;
import model.FruitTree;
import repository.Repository;

public class Controller {
    private final Repository repo;

    public Controller(Repository repo) {
        this.repo = repo;
    }

    public void add_tree(FruitTree fruitTree) throws RepositoryException{
        repo.add(fruitTree);
    }

    public void remove_tree(int position) throws RepositoryException {
        repo.remove(position);
    }

    public FruitTree[] get_trees() {
        return repo.getAll();
    }

    public FruitTree[] get_old_trees() {
        FruitTree[] all_trees = repo.getAll();
        int count = 0;

        for (int i = 0; i < all_trees.length; i++) {
            if(all_trees[i].getAge()>3)
                count++;
        }

        FruitTree[] new_trees = new FruitTree[count];
        int index=0;

        for (int i = 0; i < all_trees.length; i++) {
            if(all_trees[i].getAge()>3) {
                new_trees[index] = all_trees[i];
                index++;
            }
        }
        return new_trees;
    }
}
