package java_exception;
import java.util.Scanner;

public class BasicLinkedList {
    
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    ListNode head = null;

    public void insertnode(int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            head = newnode;
        } else {
            ListNode temp = head;
            while (temp.next != null) { 
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
   

    public void deletenode() {
        if (head == null) {
            System.out.println("Cannot delete node. List is empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void disply() {
        if (head == null)
            System.out.println("Linked list is empty!");
        else {
            ListNode temp = head;
            System.out.print("List: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BasicLinkedList list = new BasicLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, data;

        do {
            System.out.println("\n--- Linked List Operations ---");
            System.out.println("1. Insert Node");
            System.out.println("2. Delete Node");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    data = sc.nextInt();
                    list.insertnode(data);
                    break;
                case 2:
                    list.deletenode();
                    break;
                case 3:
                    list.disply();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

      
    }
}
