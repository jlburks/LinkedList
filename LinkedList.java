public class LinkedList {
    Node head;

    public static void main(String[] args){
        LinkedList llist = new LinkedList();

        llist.addNode(1);
        llist.addNode(2);
        
        System.out.println(llist.showList());
        
    }
// System.out.println();
    void addNode(int x){
        if (head == null){
            head = new Node(x);
        } else {
            // Node backupTag = head;
            Node pointer = head.next;
            
            while(pointer != null){
                head = pointer;
                pointer = head.next;
                System.out.println("vamooo");
            }
            System.out.println("vamooo");

            Node y = new Node(x);
            System.out.println("shjfjshdf "+ y+" "+ head);
            pointer = y;
            
            // head = backupTag;
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


