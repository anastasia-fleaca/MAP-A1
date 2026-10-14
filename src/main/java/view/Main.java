package view;

import controller.Controller;
import exceptions.RepositoryException;
import exceptions.ValidationException;
import repository.Repository;
import repository.TreeRepository;
import model.AppleTree;
import model.CherryTree;
import model.FruitTree;
import model.PearTree;

public class Main {
    static void main() {
        Repository repo = new TreeRepository(10);
        Controller controller = new Controller(repo);

        try {

            controller.add_tree(new AppleTree(5));
            controller.add_tree(new PearTree(2));
            controller.add_tree(new CherryTree(4));
            controller.add_tree(new AppleTree(1));
            controller.add_tree(new PearTree(6));

            System.out.println("All Fruit Trees:");
            FruitTree[] allTrees = controller.get_trees();
            for (int i = 0; i < allTrees.length; i++) {
                System.out.println(allTrees[i]);
            }

            System.out.println("Fruit Trees Older Than 3 Years:");
            FruitTree[] oldTrees = controller.get_old_trees();
            for (int i = 0; i < oldTrees.length; i++) {
                System.out.println(oldTrees[i]);
            }

            System.out.println("Removing tree on position 2");
            controller.remove_tree(2);
            System.out.println("All Fruit Trees:");
            FruitTree[] allTrees2 = controller.get_trees();
            for (int i = 0; i < allTrees2.length; i++) {
                System.out.println(allTrees2[i]);
            }
        }
        catch (RepositoryException e) {
            System.out.println(e.getMessage());
        }
        catch (ValidationException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
