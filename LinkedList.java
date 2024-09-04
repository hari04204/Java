import java.util.*;

class Node{
    int data;
    Node next;

    public Node(){
        this.data = data;
        this.next = null;
    }
    public Node(int data){
        this.data =  data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    public LinkedList(){
        head = null;
    }
    public void add(int data){
        Node curr;
        Node newNode = new Node();
        newNode.data = data;
        if(head==null){
            head = newNode;
        }
        else {
            curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = newNode;
        }
    }
    public void insertAtBeginning(int data){
        Node curr;
        Node newNode = new Node();
        newNode.data = data;
        if(head==null){
            head = newNode;
        }
        else{
            curr = head;
            head = newNode;
            head.next = curr;
        }
    }
    public void insertAtPos(int index, int data){
        Node curr;
        Node next;
        Node newNode =  new Node(data);
        if(head == null)
            head = newNode;
        else if (index == 1) {
            next = head;
            head = newNode;
            head.next = next;
        } else{
            curr = head;
            int i = 1;
            while(i<index){
                curr = curr.next;
                i++;
            }
            next = curr.next;
            curr.next = newNode;
            newNode.next = next;
        }
    }
    public void insertAfterVal(int val, int data){
        Node curr = head;
        int index = 0;
        while(curr.data != val){
            curr = curr.next;
            index++;
        }
        curr = curr.next;
        index++;
        this.insertAtPos(index,data);
    }
    public void insertBeforeVal(int val, int data){
        Node curr = head;
        int index = 0;
        while(curr.data != val){
            curr = curr.next;
            index++;
        }
        this.insertAtPos(index,data);
    }
    public void deleteAtEnd(){
        Node curr;
        if(head == null){
            System.out.println("List is empty");
        }
        else if(head.next == null){
            head = null;
        }
        else{
            curr = head;
            while(curr.next.next!=null){
                curr = curr.next;
            }
            curr.next = null;
        }
    }
    public void deleteAtBeginning(){
        Node curr;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            head = head.next;
        }
    }
    public void deleteByVal(int val){
        Node curr;
        Node next;
        if(head == null){
            System.out.println("List is empty");
        }
        else if(head.data == val){
            head = head.next;
        }
        else{
            curr = head;
            while(curr.next.data != val){
                curr = curr.next;
            }
            next = curr.next.next;
            curr.next = next;


        }
    }
    public void deleteAtPos(int index){
        Node curr;
        Node next;
        if(head == null)
            System.out.println("List is empty!");
        else if (index == 0) {
            deleteAtBeginning();
        }
        else{
            curr = head;
            int i = 0;
            while(i<index-1){
                curr = curr.next;
                i++;
            }
            next = curr.next.next;
            curr.next = next;
        }
    }
    public void display(){
        Node curr;
        curr = head;
        if(head == null)
            System.out.println("List is empty");
        else{
            while(curr.next != null){
                System.out.print(curr.data+ "->");
                curr = curr.next;
            }
            System.out.println(curr.data);
        }
    }
    public void revDisplay(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr.next!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next  = prev;
        head = curr;
        this.display();
    }
    public int getByElement(int element){
        Node curr = head;
        int index=0;
        while(curr!=null){
            if(curr.data == element){
                return index;
            }
            else{
                index++;
                curr = curr.next;
            }
        }
        return -1;
    }
    public int getByPos(int index){
        Node curr = head;
        int i = 0;
        if(head == null)
            System.out.println("List is empty");
        else {
            while (i != index) {
                curr = curr.next;
                i++;
            }
        }
        return curr.data;
    }
    public int length(){
        int length = 0;
        Node curr = head;
        if(head ==  null){
            return 0;
        }
        else{
            while(curr.next!=null){
                length++;
                curr = curr.next;
            }
            length++;
            return length;
        }
    }
    public int count(int element){
        int count = 0;
        Node curr = head;
        if (head == null) {
            return 0;
        }
        else{
            while(curr != null){
                if(curr.data == element){
                    count++;
                }
                curr = curr.next;
            }
            return count;
        }
    }
    public void sort(){
        int[] arr = new int[this.length()];
        Node curr = head;
        if(head == null) System.out.println("List is empty");
        else{
            int i = 0;
            while(curr != null){
                arr[i] = curr.data;
                curr = curr.next;
                i++;
            }
            Arrays.sort(arr);
            curr = head;
            for(int x : arr){
                curr.data = x;
                System.out.println(curr.data);
                curr = curr.next;
            }
        }
    }
    public void concat(Node p){
        if(head == null){
            head = p;
        }
        else{
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = p;
        }
    }
    public void removeDuplicates(){
        Node curr= head;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            Set<Integer> set = new HashSet<>();
            while(curr!= null){
                set.add(curr.data);
                curr = curr.next;
            }
            head = null;
            curr = head;
            for(Integer i : set){
                this.add(i);
            }
            curr = null;
        }
    }
    public void displayAsStk(){
        Node curr;
        curr = head;
        if(head == null)
            System.out.println("List is empty");
        else{
            while(curr.next != null){
                System.out.print(curr.data+ "\n");
                curr = curr.next;
            }
            System.out.println(curr.data);
        }
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        System.out.println("Harikrishnan K S 2022503567\nSTACK IMPLEMENTATION");
        Scanner sc = new Scanner(System.in);
        loop :while(true){
            System.out.println("1.PUSH  2.POP  3.PEEK  4.Display  5.exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter element to push: ");
                    int x = sc.nextInt();
                    list1.insertAtBeginning(x);
                    break;
                case 2:
                    list1.deleteAtBeginning();
                    System.out.println("Popped!");
                    break;
                case 3:
                    System.out.println("Top element -> "+ list1.head.data);
                    break;
                case 4:
                    list1.displayAsStk();
                    break;
                case 5:
                    break loop;
            }
        }
    }
}