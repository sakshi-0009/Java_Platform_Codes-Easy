/* Problem Statement :-
Create a link list of size N according to the given input literals. Each integer input is accompanied by an indicator which can either be 0 or 1. If it is 0, insert the integer in the beginning of the link list. If it is 1, insert the integer at the end of the link list. 
Hint: When inserting at the end, make sure that you handle NULL explicitly.  
*/

// Answer :-

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}

class Solution
{
    Node insertAtBeginning(Node head, int x)
    {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }
    
    Node insertAtEnd(Node head, int x)
    {
        Node newNode = new Node(x);
        if (head == null)
            return newNode;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
}
