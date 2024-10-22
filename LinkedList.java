public class LinkedList {
    Node head;

    public static void main(String[] args){
        LinkedList llist = new LinkedList();

        llist.addNode(1);
        llist.addNode(2);

        String x = llist.showList();
        System.out.println(x);
        
    }
// System.out.println();
    void addNode(int x){
        if (head == null){
            head = new Node(x);
            return;
        } else {
            Node backupTag = head;
            Node pointer = head.next;
            
            while(pointer != null){
                head = pointer;
                pointer = head.next;
            }
            

            Node y = new Node(x);
            pointer = y;            
            head = backupTag;
        }
    }
    void deleteNode(){

    }

    String showList() {
        String listView = "";
        Node startingPoint =  head;
        while (startingPoint != null){
            System.out.println("hit");
            listView += String.valueOf(head.val);
            startingPoint = startingPoint.next;
        }
        return listView;
    }
    
}


