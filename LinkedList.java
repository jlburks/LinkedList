public class LinkedList {
    Node head;

    public static void main(String[] args){
        LinkedList llist = new LinkedList();

        llist.addNode(1);
        llist.addNode(2);
        llist.addNode(3);
        llist.addNode(000);
        llist.addNode(5);
        llist.addNode(6);
        System.out.println(llist.showList());
        
    }

    void addNode(int x){
        if (head == null){
            head = new Node(x);
        } else {
            // begin the chain of checking if next == null and inserting new node
            Node spear = head;
            while (spear.next != null){
                head = spear;
                spear = spear.next;
            }
            System.out.println(spear.val);
            spear.next = new Node(x);
        }
    }
    void deleteNode(){

    }

    String showList() {
        String listView = "";
        Node startingPoint =  head;
        while (startingPoint != null){
            listView += String.valueOf(head.val);
            startingPoint = startingPoint.next;
        }
        return listView;
    }
    
}


