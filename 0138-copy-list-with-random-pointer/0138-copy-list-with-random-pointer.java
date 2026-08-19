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
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        //deep copy of the original list
        Node newHead = new Node(head.val);
        Node curr = newHead;
        Node temp = head.next;
        while(temp != null){
            curr.next = new Node(temp.val);
            curr = curr.next;
            temp = temp.next;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node t1 = head;
        Node t2 = newHead;
        while(t1 != null){
            map.put(t1, t2);
            t1 = t1.next;
            t2 = t2.next;
        }
        for(Node original : map.keySet()){
            Node duplicate = map.get(original);
            if(original.random != null){
                duplicate.random = map.get(original.random);
            }
        }
        return newHead;
    }
}