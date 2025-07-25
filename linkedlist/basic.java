package linkedlist;
class listnode{
    int val;
    listnode next;
    listnode(int val){
        this.val=val;
        this.next=null;
    }
}
public class basic {
    public static void deletion(listnode head, int delete){
        listnode current = head;
        while(current!=null){
            if(current.val==delete){
                current.val=current.next.val;
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }
    }
    public static void traversal(listnode head){
        listnode current = head;
        while(current!=null){
                System.out.print(current.val);
                if(!(current.next==null))
                System.out.print(" -> ");
                current=current.next;
            }  
    }
    public static void main(String[] args){
        listnode n1 = new listnode(10);
        listnode n2 = new listnode(20);
        n1.next=n2;
        listnode n3 = new listnode(30);
        n2.next=n3;
        listnode n4 = new listnode(40);
        n3.next=n4;
        deletion(n1,20);
    }                             
}
