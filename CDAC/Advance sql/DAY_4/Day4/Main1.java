package com.sunbeam;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int v) {
        val = v;
        next = null;
    }
}

class LinkList {
    ListNode head;
    public LinkList() {
        head = null;
    }
    public void addLast(int v) {
        ListNode nn = new ListNode(v);
        if(head == null)
            head = nn;
        else {
            ListNode trav = head;
            while(trav.next != null)
                trav = trav.next;
            trav.next = nn;
        }
    }
    public void display() {
        ListNode trav = head;
        while(trav != null) {
            System.out.print(trav.val + ", ");
            trav = trav.next;
        }
        System.out.println();
    }
    public void reverese() {
    	// consider cur list as old list
    	ListNode oldhead = head;
    	// new list as empty
    	head = null;
    	while(oldhead != null) {
    		// delete first node from old list
    		ListNode temp = oldhead;
    		oldhead = oldhead.next;
    		// add that node at start of new list
    		temp.next = head;
    		head = temp;
    	} // repeat until old list is empty
    }
    
    public void displayReverse(ListNode cur) {
    	if(cur == null)
    		return;
    	displayReverse(cur.next);
    	System.out.print(cur.val + ", ");
    }
    
    /*
    public ListNode recReverse(ListNode cur) {
    	// if cur node is last node, then make it head
    	if(cur.next == null) {
    		head = cur;
    		return cur;
    	}
    	// reverse rest of the list
    	ListNode tail = recReverse(cur.next);
    	// add cur node in tail's next
    	tail.next = cur;
    	// make cur's next as null
    	cur.next = null;
    	// return tail of reversed list
    	return cur;
    }
    */

    public ListNode recReverse(ListNode cur) {
    	// if cur node is last node, then make it head
    	if(cur.next == null) {
    		head = cur;
    		return cur;
    	}
    	// reverse rest of the list
    	// add cur node in tail's next
    	recReverse(cur.next).next = cur;
    	// make cur's next as null
    	cur.next = null;
    	// return tail of reversed list
    	return cur;
    }
}

public class Main1 {
	public static void print(int n) {
		if(n == 5) {
			System.out.println(n);
			return;
		}
		print(n+1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		//print(1);
		
		LinkList l = new LinkList();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.addLast(40);
		l.addLast(50);
		l.display();
		if(l.head != null)
			l.recReverse(l.head);
		//l.reverese();
		l.display();
		//l.displayReverse(l.head);
		//System.out.println();
		//l.display();
	}
}
