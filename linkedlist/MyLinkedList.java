package linkedlist;

public class MyLinkedList {

	Node head;

	void add(int data) {

		Node toadd =new Node(data);
		Node temp =head;


		if(head==null) {
			head=toadd;
			return;
		}

		while(temp.next!=null) {
			temp= temp.next;
		}

		temp.next=toadd;
	}

	void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp= temp.next;
		}
	}

	static class Node{

		int data;
		Node next;

		Node(int data){
			this.data=data;
			next=null;
		}
	}
}
