public class LinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty!!");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        int i=0;
        Node temp = head;
        Node newNode = new Node(data);
        size++;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        int val = head.data;
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            head = tail = null;
            size = 0;
            return val;
        }
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        int val;
        Node prev = head;
        if(head == null){
            System.out.println("LL is already empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            head = tail = null;
            size = 0;
            val = tail.data;
            return val;
        }
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp = head;
        int idx = 0;
        while (temp != null){
            temp = temp.next;
            idx++;
            if(temp.data==key){
                return idx;
            }
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthfromEnd(int pos){
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if(pos==sz){
            head = head.next;
            return;
        }
        int toFind = sz-pos;
        Node prev = head;
        int i = 1;
        while (i<toFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public Node midNode(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head == null || head.next==null){
            return true;
        }
    Node mid = midNode();
    Node curr = mid;
    Node prev = null;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = tail;
    Node left = head;
    while(right != null){
        if(right.data != left.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
}  
    
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        //l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(2);
        l1.addLast(1);
        l1.print();
        System.out.println(l1.checkPalindrome());
        
    }
}