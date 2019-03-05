package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Btree root;

	public void insert(int data) {
		System.out.print("[input: " + data + "]");
		if (root == null) {
			this.root = new Btree(data);
			System.out.println(" -> inserted: " + data);
			return;
		}
		insertData(root, data);
		System.out.print(" -> inserted: " + data);
		System.out.println();
	}

	public Btree insertData(Btree root, int data) {
		Btree tmpNode = null;
		System.out.print(" ->" + root.getData());
		if (root.getData() >= data) {
			System.out.print(" [L]");
			if (root.ltree == null) {
				root.setLtree(new Btree(data));
				return root.getLtree();
			} else {
				tmpNode = root.getLtree();
			}
		} else {
			System.out.print(" [R]");
			if (root.getRtree() == null) {
				root.setRtree(new Btree(data));
				return root.getRtree();
			} else {
				tmpNode = root.getRtree();
			}
		}

		return insertData(tmpNode, data);
	}

	public void insertRoot(int d) {

		if (this.root == null) {
			this.root = new Btree(d);
			return;
		}
		insert_data(root, d);

	}

	public Btree insert_data(Btree root, int d) {

		if (root.getData() >= d) {
			if (root.getLtree() == null) {
				root.setLtree(new Btree(d));
				return root.getLtree();
			} else {
				root = root.getLtree();
			}

		} else {

			if (root.getRtree() == null) {
				root.setRtree(new Btree(d));
				return root.getRtree();
			} else {
				root = root.getRtree();
			}
		}

		return insert_data(root, d);
	}

	public int minTree(Btree root) {
		if (root.getLtree() != null) {
			return minTree(root.getLtree());
		}
		return root.getData();
	}
	
	private Integer minValue(Btree node) {
		 
        if(node.getLtree() != null) {
            return minValue(node.getLtree());
        }
        return node.getData();
    }
	
	public int maxTree(Btree root) {
		int min = 0;
		if (root.getRtree() == null)
			min = root.getData();
		if (root.getRtree() != null) {
			root = root.getRtree();
			minTree(root);
		}
		return min;
	}

	public void levelOrderTraversal() {

		Queue<Btree> discovedNodeQueue = new LinkedList<>();
		if (this.root == null) {
			System.out.println("The tree is empty.");
			return;
		}
		discovedNodeQueue.add(this.root);
		while (!discovedNodeQueue.isEmpty()) {

			Btree tmpNode = discovedNodeQueue.poll();
			if (tmpNode.getLtree() != null) {
				discovedNodeQueue.add(tmpNode.getLtree());
			}
			if (tmpNode.getRtree() != null) {
				discovedNodeQueue.add(tmpNode.getRtree());
			}
			System.out.print(tmpNode.getData() + " ");
		}
		System.out.println(discovedNodeQueue);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bst = new BinaryTree();
		bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.insert(13);
        System.out.println("-------------------");
        System.out.println("Level order traversal");
        bst.levelOrderTraversal();
		

	}

}
