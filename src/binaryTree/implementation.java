package binaryTree;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
class Pair{
    int level;
    Node node;
    Pair(int level,Node node){
        this.level=level;
        this.node=node;
    }
}
public class implementation {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        Node h = new Node(80);
        Node i = new Node(90);
        Node j = new Node(100);
        Node k = new Node(111);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        d.left = h;
        d.right = i;
        e.left=j;
        e.right=k;
        System.out.println(rightView(a));

    }

    // binary tree paths
    private static ArrayList<ArrayList<Integer>> paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, ans, arr);
        return ans;
    }

    private static void dfs(Node root, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        arr.add(root.val);
        if (root.left == null && root.right == null) {
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(arr);
            ans.add(list);
        }
        dfs(root.left, ans, arr);
        dfs(root.right, ans, arr);
        arr.remove(arr.size() - 1);
    }

    public static void printTree(Node node) {
        if (node == null) return;
        System.out.print(" " + node.val);
        printTree(node.left);
        printTree(node.right);
    }

    public static int size(Node root) {

        return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
    }

    public static int sum(Node root) {
        if (root == null) return 0;

        return root.val + sum(root.left) + sum(root.right);
    }

    public static int product(Node root) {
        if (root == null) return 1;

        return root.val * product(root.left) * product(root.right);
    }

    public static int max(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int min(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

    // levels of binary tree
    public static int levels(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    // Invert Binary tree
    public static void Invert(Node root) {
        if (root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        Invert(root.left);
        Invert(root.right);
    }

    // isIdentically binary tree  (same tree or not)
    public static boolean isIdentical(Node r1, Node r2) {
        if (r1 == null && r2 == null) return true;
        if (r1 == null || r2 == null) return false;
        if (r2.val != r1.val) return false;
//        if (!isIdentical(r1.left,r2.left))return false;
//        if (!isIdentical(r1.right,r2.right))return false;
//        return true;
        // ya fir

        return !isIdentical(r1.left, r2.left) && !isIdentical(r1.right, r2.right);
    }

    // isIdentically practice
    public static boolean isIdentical2(Node r1, Node r2) {
        if (r1 == null && r2 == null) return true;
        if (r1 == null || r2 == null) return false;
        if (r1.val != r2.val) return false;

        if (!isIdentical2(r1.left, r2.left)) return false;
        if (!isIdentical2(r1.right, r2.right)) return false;
        return true;
    }

    // isSymmetric
    public boolean isSymmetric(Node root) {
        Invert(root.left);
        return isIdentical(root.left, root.right);
    }

    // root to leaf path sum
    public boolean rootToPathSum(Node root, int target) {
        if (root == null) {
            if (target == 0) {
                return true;
            } else return false;
        }
        return rootToPathSum(root.left, target - root.val) || rootToPathSum(root.right, target - root.val);
    }

    //level order traversal (BFS) breadth first search
    public static void LevelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            Node front = q.remove();
            System.out.println(front.val + " ");
            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }
    }

    // level order traversal LineWise
    private static void LevelOrderLineWise(Node root) {
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(0, root));
        while (q.size() > 0) {
            Pair front = q.remove();
            if (front.level != currLevel) {
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val + " ");
            if (front.node.left != null) q.add(new Pair(currLevel + 1, front.node.left));

            if (front.node.right != null) q.add(new Pair(currLevel + 1, front.node.right));
        }
    }

    //zing-zag traversal tree
    private static void zigZagTraversal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, root));
        while (q.size() > 0) {
            Pair front = q.remove();
            int level = front.level;
            Node node = front.node;
            System.out.print(front.node.val + " ");
            if (level % 2 == 0) {
                if (front.node.right != null) q.add(new Pair(level + 1, node.right));
                if (front.node.left != null) q.add(new Pair(level + 1, node.left));

            } else {
                if (front.node.left != null) q.add(new Pair(level + 1, node.left));
                if (front.node.right != null) q.add(new Pair(level + 1, node.right));

            }
        }
    }

    //print kTh level element
    private static void kThLevel(Node root, int level, int k) {
        if (root == null) return;
        if (level == k) System.out.print(root.val + " ");
        kThLevel(root.left, level + 1, k);
        kThLevel(root.right, level + 1, k);
    }

    public static void vowel(char ch) {
        if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
            System.out.println("wowel");
        } else {
            System.out.println("consonent");
        }
    }

    //check tree are balanced or node
    public static boolean isBalanced(Node root) {
        if (root == null) return true;
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);
        if (Math.abs(leftLevel - rightLevel) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    static boolean flag;

    public static boolean isBalancedBinaryTree2(Node root) {
        if (root == null) {
            return true;
        }
        flag = true;
        level2(root);
        return flag;
    }

    public static int level2(Node root) {
        if (root == null) return 0;
        int leftLevel = level2(root.left);
        int rightLevel = level2(root.right);
        if (Math.abs(leftLevel - rightLevel) > 1) {
            flag = false;
            return 1 + Math.max(leftLevel, rightLevel);
        }
        return 1 + Math.max(leftLevel, rightLevel);
    }

    //Diameter of a tree
    public static int Diameter(Node root) {
        if (root == null) return 0;
        int selfDia = levels(root.left) + levels(root.right);
        int leftDia = Diameter(root.left);
        int right = Diameter(root.right);
        return Math.max(selfDia, Math.max(leftDia, right));

    }

    static int max;

    public static int DiaMeterApproach2(Node root) {
        max = 0;
        levelsForDia(root);
        return max;
    }

    public static int levelsForDia(Node root) {
        if (root == null) return 0;
        int leftLevel = levelsForDia(root.left);
        int rightLevel = levelsForDia(root.right);
        max = Math.max(max, leftLevel + rightLevel);
        return 1 + Math.max(leftLevel, rightLevel);
    }

    // right view of binary tree
    public static ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        view(root, list, 0);
        return list;
    }

    static void view(Node root, ArrayList<Integer> list, int level) {
        if (root == null) return;
        if (list.size() <= level) list.add(root.val);
        else {list.set(level,root.val);}
        view(root.left,list,level+1);
        view(root.right,list,level+1);
    }
}