package com.gl.bst.dsa3prg2;

import java.util.Stack;

import com.gl.node.dsa3prg2.Nodes;

public class BST {
    Nodes root;

    public BST() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Nodes insert(Nodes Nodes, int data) {
        if (Nodes == null) {
            Nodes = new Nodes(data);
            return Nodes;
        }

        if (data < Nodes.data) {
            Nodes.left = insert(Nodes.left, data);
        } else if (data > Nodes.data) {
            Nodes.right = insert(Nodes.right, data);
        }

        return Nodes;
    }

    public boolean isPairPresent(int sum) {
        return isPairPresent(root, sum);
    }

    private boolean isPairPresent(Nodes Nodes, int sum) {
        if (Nodes == null) {
            return false;
        }

        Stack<Nodes> s1 = new Stack<Nodes>();
        Stack<Nodes> s2 = new Stack<Nodes>();
        Nodes curr1 = Nodes;
        Nodes curr2 = Nodes;

        while (true) {
            while (curr1 != null) {
                s1.push(curr1);
                curr1 = curr1.left;
            }

            while (curr2 != null) {
                s2.push(curr2);
                curr2 = curr2.right;
            }

            if (s1.isEmpty() || s2.isEmpty()) {
                return false;
            }

            int val1 = s1.peek().data;
            int val2 = s2.peek().data;

            if (val1 + val2 == sum) {
                System.out.println("Pair is (" + val1 + "," + val2 + ")");
                return true;
            } else if (val1 + val2 < sum) {
                curr1 = s1.pop();
                curr1 = curr1.right;
            } else {
                curr2 = s2.pop();
                curr2 = curr2.left;
            }
        }
    }
}