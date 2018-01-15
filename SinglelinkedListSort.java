package assignment;

import java.util.Scanner;

public class SinglelinkedListSort {
	static Node head;
	static class Node{
		public int number;
		public Node next;
		Node(int number){
			this.number = number;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		SinglelinkedListSort list = new SinglelinkedListSort();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers to be sorted!");
		list.head = new Node(input.nextInt());
		Node two = new Node(input.nextInt());Node three = new Node(input.nextInt());
		Node four = new Node(input.nextInt());Node five = new Node(input.nextInt());
		Node six = new Node(input.nextInt());Node seven = new Node(input.nextInt());
		Node eight = new Node(input.nextInt());Node nine = new Node(input.nextInt());
		Node ten = new Node(input.nextInt());Node eleven = new Node(input.nextInt());
		Node twelve = new Node(input.nextInt());Node thirteen = new Node(input.nextInt());
		Node fourteen = new Node(input.nextInt());Node fifteen = new Node(input.nextInt());
		head.next=two; two.next=three;three.next=four;four.next=five;five.next=six;six.next=seven;
		seven.next=eight;eight.next=nine;nine.next=ten;ten.next=eleven;eleven.next=twelve;
		twelve.next=thirteen;thirteen.next=fourteen;fourteen.next=fifteen;
		System.out.println("Unsorted list:");
		list.printlist();
		for(Node current1=head;current1!=null;current1=current1.next){
			for(Node current2=current1.next;current2!=null;current2=current2.next){
				if(current1.number>current2.number){
					int temp = current1.number;
					current1.number=current2.number;
					current2.number = temp;
				}
			}
		}
		System.out.print("\n");
		System.out.println("Sorted list:");
		list.printlist();
	}
	public void printlist(){
		Node n = head;
		while(n!=null){
			System.out.print(n.number+" ");
			n = n.next;
		}
	}

}
