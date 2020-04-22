# Leetcode 138 - Copy a list with random pointer   O(n) Space O(n) memory
```java
class Solution {
    class Pair{
        int index1, index2;
        Pair(int i1, int i2){
            this.index1=i1;
            this.index2=i2;
        }
    }
    public Node copyRandomList(Node head) {
        if(head==null)return head;
        Node temp = head;
        int index=0;
        Map<Node, Integer> map1 = new HashMap<>();
        while(temp!=null){
            map1.put(temp,index++);
            temp=temp.next;
        }
        List<Pair> list = new ArrayList<>();
        temp=head;
        while(temp!=null){
            int index1 = map1.get(temp);
            int index2 = map1.getOrDefault(temp.random,-1);
            list.add(new Pair(index1,index2));
            temp=temp.next;
        }
        Map<Integer,Node> map2 = new HashMap<>();
        index=0;
        temp=head;
        Node dummy = new Node(Integer.MIN_VALUE);
        Node tail=dummy;
        while(temp!=null){
            Node newNode = new Node(temp.val);
            tail.next=newNode;
            tail=newNode;
            map2.put(index++,newNode);
            temp=temp.next;
        }
        for(Pair p: list){
            Node source = map2.get(p.index1);
            Node dest = map2.get(p.index2);
            source.random=dest;
        }
        return dummy.next;
    }
}
```
