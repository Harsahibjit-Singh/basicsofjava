package stack;
public class stack{
    int arr[] = new int [100];
    int top =-1;

    public void push(int x){
        if(top==99){
            System.out.println("Stack is full\n");
        }
        else{
            top++;
            arr[top]=x;
            System.out.println("Pushed");
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty\n");
        }
        else{
            System.out.println("Popped "+arr[top]);
            top--;
        }
    }
    void status(){
        if(top==-1){
            System.out.println("Stack is empty\n");
        }
        else if(top==99){
            System.out.println("Stack is full\n");
        }
        else{
            System.out.println("Stack is neither full nor empty");
        }
    }
     public static void main(String[] args) {
        {
            stack a = new stack();
            a.push(20);
            a.pop();
            a.status();
            a.push(30);
        }
    }
}
