/*package com.list;

public class SingleLinkedList {
	
	Node head;
	
	public void isEmpty(){
		if(head ==null)
			System.out.println("list is empty");
	}
	public void insertEle(int data){
		
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
				
	}
	
	public void deleteEle(){
		Node current = head;
		head= current.next;
	}
	
	
	public void deleteNode(int ele){
		Node current = head;
		while(current!=null){
			if(current.data ==ele)
				break;
			current = current.next;
		}
		if(current.next !=null){
			current.next =current.next.next;
		}
	}
	

	public void dispalyList(){
		Node current = head;
		
		while(current!=null){
			current.dispaly();
			current  = current.next;
			
		}
	}
	public static void main(String[] args) {
		SingleLinkedList list= new SingleLinkedList();
		System.out.println("before insertion");
		list.insertEle(10);
		list.insertEle(20);
		list.insertEle(30);
		list.insertEle(40);
		list.dispalyList();
		System.out.println("after deletion");
		list.deleteNode(40);
		list.dispalyList();
		System.out.println("after deletion");
		list.deleteEle();
		list.dispalyList();
		
	}

}
*/