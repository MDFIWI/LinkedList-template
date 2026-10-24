import java.util.*;
public class myNode1App
{
    public static void main(String[] args){
        
        Node<String> head,tail;
        
        head = tail = null;
        
        //add R, as head and tail
        Node<String> node = new Node<>("R");
        head = node;
        tail = head;
        System.out.print("head:" +head.element+ ", tail:" +tail.element);
        //print
        print(head);
       
        //add U, as head and tail
        node = new Node<> ("U");
        tail.next = node;
        tail = tail.next;
        System.out.print("head:" +head.element+ ", tail:" +tail.element);
        print(head);
        
        //add T, as head and tail
        tail.next = new Node<>("T");
        tail = tail.next;
        System.out.print("head:" +head.element+ ", tail:" +tail.element);
        print(head);
        
        //add T, as head 
        node = new Node<> ("S");
        node.next = head;
        head = node;
        System.out.print("head:" +head.element+ ", tail:" +tail.element);
        print(head);
        
        //add Q, as the 2nd after head
        node = new Node<> ("Q");
        node.next = head.next;
        head.next = node;
        System.out.print("head:" +head.element+ ", tail:" +tail.element);
        print(head);
        
        //add T, as the 2nd after head [Q]
        node = new Node<>("T");
        node.next = head.next.next;
        head.next = node;
        System.out.print("head:" +head.element+ ", tail:" +tail.element);
        print(head);
        
        //homework, add C before tail (output: S -> T -> R -> U -> C -> T)
        Node<String> current = head;
        while(current.next != tail ){
            current = current.next;
        }
        node = new Node<>("C");
        node.next = current.next;
        current.next = node;
        System.out.print("head:" +head.element+ ", tail:" +tail.element);
        print(head);
    }
    public static void print(Node<String> node){
        System.out.println();
        Node<String> current = node;
        
        while(current !=  null){
            System.out.print(current.element+ " ");
            
            if(current.next != null)
                System.out.print("->");
        
            current = current.next;
            
        }
        System.out.println();
    }
}