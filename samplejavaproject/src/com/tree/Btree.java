package com.tree;

public class Btree {
	Btree rtree;
	Btree ltree;
	int data;
	public Btree(int data){
		this.data= data;
	}
	public Btree getRtree() {
		return rtree;
	}
	public void setRtree(Btree rtree) {
		this.rtree = rtree;
	}
	public Btree getLtree() {
		return ltree;
	}
	public void setLtree(Btree ltree) {
		this.ltree = ltree;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
