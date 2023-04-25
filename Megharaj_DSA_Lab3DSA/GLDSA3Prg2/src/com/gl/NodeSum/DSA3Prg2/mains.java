package com.gl.NodeSum.DSA3Prg2;

import java.util.Scanner;

import com.gl.bst.dsa3prg2.BST;

public class mains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST bst = new BST();

		System.out.print("Enter the number of Nodes: ");
		int n = sc.nextInt();

		System.out.print("Enter the Nodes: ");
		for (int i = 0; i < n; i++) {
			int data = sc.nextInt();
			bst.insert(data);
		}

		System.out.print("Enter the sum to find: ");
		int sum = sc.nextInt();

		if (!bst.isPairPresent(sum)) {
			System.out.println("Nodes are not found.");
		}
		sc.close();
	}
}