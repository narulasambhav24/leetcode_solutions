/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deepCopy(Node head){
        Node newHead = new Node(head.val);
        Node temp = head.next;
        Node curr = newHead;
        while(temp != null){
            curr.next = new Node(temp.val);
            curr = curr.next;
            temp = temp.next;
        }
        return newHead;
    }
    public void connectAlternatively(Node head, Node newHead){
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = head;
        Node temp2 = newHead;
        while(temp1 != null && temp2 != null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;
            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
    }
    public void splitLists(Node head, Node newHead){
        Node t1 = head;
        Node t2 = newHead;
        while(t1 != null){
            t1.next = t2.next;
            t1 = t1.next;
            if(t1 == null) break;
            t2.next = t1.next;
            t2 = t2.next;
        }
    }
    public Node copyRandomList(Node head) {
        //edge case handles empty list
        if(head == null) return null;
        // deep copying the given list
        Node newHead = deepCopy(head);
        // alternately making the connections with original and copied list
        connectAlternatively(head, newHead);
        //assigning random pointers
        Node t1 = head;
        Node t2 = newHead;
        while(t1 != null){
            t2 = t1.next;
            if(t1.random != null) t2.random = t1.random.next;
            t1 = t1.next.next;
        }
        //split the two lists
        splitLists(head, newHead);
        // return the head of new list
        return newHead;
    }
}