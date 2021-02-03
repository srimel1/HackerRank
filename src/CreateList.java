public class CreateList {
    //Represents the node of list.  
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    //Declaring head and tail pointer as null.  
    public Node head = null;
    public Node tail = null;

    //This function will add the new node at the end of the list.  
    public void add(int data) {
        //Create new node  
        Node newNode = new Node(data);
        //Checks if the list is empty.  
        if (head == null) {
            //If list is empty, both head and tail would point to new node.
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            //tail will point to new node.  
            tail.next = newNode;
            //New node will become new tail.  
            tail = newNode;
            //Since, it is circular linked list tail will point to head.  
            tail.next = head;
        }
    }

    //Displays all the nodes in the list  
    public void traverse() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Nodes of the circular linked list: ");
            do {
                //Prints each node by incrementing pointer.  
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public boolean contains(int search){
        Node current = head;
        if (head == null) {
            return false;
        }else{
            do{
                if (current.data == search) {
                    return true;
                }
                current = current.next;
            }while(current != head);
            return false;
        }
    }

    public void delete(int delete) {
        Node current = head;
        if (head != null) {
            if (current.data == delete) {
                head = head.next;
                tail.next = head;
            }else{
                do{
                    Node next = current.next;
                    if (next.data == delete) {
                        current.next = next.next;
                        break;
                    }
                    current = current.next;

                }while(current != head);
            }
        }
    }

    public static void main(String[] args) {
        CreateList cl = new CreateList();
        //Adds data to the list  
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        //Displays all the nodes present in the list  
        cl.traverse();
        cl.delete(4);
        cl.traverse();
        System.out.println(cl.contains(2));
    }
}  