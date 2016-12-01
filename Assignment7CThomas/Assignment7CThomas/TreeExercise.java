import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Queue;
/**
 *
 * @author csu
 */
public class TreeExercise 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String[] myStringChars = new String[26];

        for(int i = 0; i < 26; i++)
        {
            myStringChars[i] = new String(Character.toChars(i+65));
        }

        // create the Tree as a linked structure from the array myStringChars
        // the Strings are stored using the representation for trees as arrays in the book
        // (e.g. for an element i, the left child is stored in position 2*i + 1, right child is 
        // on position 2*(i + 1). Also specify the level of a TreeNode
        
        TreeNode[ ] binaryTree = new TreeNode[myStringChars.length];
        
        
        for(int index = 0; index < myStringChars.length; index++)
        {
            TreeNode parent;
            
            int indexOfparent = (index-1)/2;
            
            if(indexOfparent < 0)
            {
                parent = null;
            }
            else
            {
                parent = binaryTree[indexOfparent];
            }

            TreeNode newNode = new TreeNode(myStringChars[index], parent);     
            
            binaryTree[index] = newNode;     
        }
        
        for(int index = 0; index < myStringChars.length; index++)
        {
            
            TreeNode lChild = null;
            TreeNode rChild = null; 
            
            int lIndex = 2*index+1;
            int rIndex = 2*index+2;
            
            if(lIndex <= 25)
            {
                lChild = binaryTree[lIndex];
            }
            
            if(rIndex <= 25)
            {
                rChild = binaryTree[rIndex];
            }
            
            binaryTree[index].setLeftChild(lChild);
            
            binaryTree[index].setRightChild(rChild);
        }

        // create a traversal by levels and print as you traverse to check that the creation of the tree has happened correctly
        System.out.println("The Binary Tree By Levels");
        System.out.println("");
        
        
        Queue myQueue = new LinkedList();
        
        int lvl = 0;
        int count = 1;
        
        myQueue.add(binaryTree[0]);
        
        while( !myQueue.isEmpty() )
        {
            lvl = myQueue.size();
            System.out.print("level " +count++ +"");
            
            while(lvl > 0)
            {
                TreeNode node = (TreeNode)myQueue.remove();
                System.out.print(" " + node.getContents()); 
                
                if(node.getLeftChild()!= null) 
                {
                    myQueue.add(node.getLeftChild());
                }
                
                if(node.getRightChild()!= null)
                {
                    myQueue.add(node.getRightChild());
                }
                
                lvl --;
            }
            
            System.out.println("");
        }

        // create the code that asks the user for two letters in uppercase and searches for the nodes in the tree that contain
        // such letters     
        System.out.println("_________________________");
        
        System.out.print("\nPlease enter an uppercase letter -  ");
        
        String firstLetter = scan.nextLine();
        
        firstLetter = firstLetter.toUpperCase();
        
        System.out.print("Please enter a second uppercase letter -  ");
        
        String secondLetter = scan.nextLine();
        
        secondLetter = secondLetter.toUpperCase(); 
        
        System.out.println("");
        System.out.println("----------Results----------");
        System.out.println("");

        TreeNode node1 = binaryTree[0].findNodeOnTree(firstLetter);
        
        TreeNode node2 = binaryTree[0].findNodeOnTree(secondLetter);

        // create the code that calls the static method below and finds the lowest common ancestor of two TreeNodes
        TreeNode commonAncestor = findLowestCommonAncestor(node1, node2);

        if(commonAncestor != null)
        {
            System.out.println("The lowest common ancestor - " + commonAncestor.getContents());
        }    
        else{
            System.out.print("The lowest common ancestor - " + binaryTree[0].getContents());
        }
    }   

    public static TreeNode findLowestCommonAncestor(TreeNode nOne, TreeNode nTwo)
    {
        // Given two nodes on the same tree, this method should return the lowest common ancestor.
        // if no common ancestor is found, this method returns null .
        TreeNode[ ] lArr = new TreeNode[5];
        
        TreeNode[ ] rArr = new TreeNode[5];
        
        TreeNode lNode = nOne;
        
        TreeNode rNode = nTwo;
        
        lArr[0] = nOne;
        
        for(int i= 1; i < lArr.length; i++)
        {             
            if(nOne.getParent() != null)
            {
                lArr[i] = nTwo.getParent();
                
                nOne = nOne.getParent();
            }
            else
            {
                break;
            }
        }
        
        rArr[0] = nTwo;
        
        for(int i = 1; i < rArr.length; i++)
        {             
            if(nTwo.getParent() != null)
            {
                rArr[i] = nTwo.getParent();
                
                nTwo = nTwo.getParent();
            }
            else
            {
                break;
            }
        }
        
        
        
        TreeNode ancestor = null;

        outerloop:
        for(int lIndex = 0; lIndex < lArr.length; lIndex++)
        {
            if(lArr[lIndex] == null)
            {
                break;
            }
            
            for(int rIndex = 0; rIndex < rArr.length; rIndex++)
            {
                if(rArr[rIndex] == null)
                {
                    continue;
                }
                else if(rArr[rIndex].getContents() == lArr[lIndex].getContents() )
                {
                    ancestor = rArr[rIndex];
                    break outerloop; 
                }
            }     
        }

        return ancestor;
    }      
}
