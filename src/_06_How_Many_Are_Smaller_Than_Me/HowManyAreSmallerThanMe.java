package _06_How_Many_Are_Smaller_Than_Me;

import _03_Intro_to_Binary_Trees.Node;
import _05_Intro_to_AVL_Trees.AVLNode;
import _05_Intro_to_AVL_Trees.AVLTree;

public class HowManyAreSmallerThanMe {

    /*
     * Given an AVLTree filled with the random numbers from 1 to 20, and a
     * single number within the AVL Tree, figure out how many numbers in the
     * AVLTree are smaller than the provided number and return the result.
     * 
     * You may want to create a helper method to search through the AVLTree and
     * count iteratively or recursively.
     */
	int count = 0;
	public int traversal(AVLNode<Integer> node, int me) {
		if (node != null) {
			if (node.getValue() < me) {
				count++;
			}
			traversal(node.getLeft(), me);
			traversal(node.getRight(), me);
		}
		return count;
	}
    public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
        int ans = traversal(avlTree.getRoot(), me);
        return ans;
    }

}
