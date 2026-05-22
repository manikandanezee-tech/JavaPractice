import java.util.ArrayList;

public class StackImplementation<T> {
   public ArrayList<T>stack=new ArrayList<>();
//   Add an element
    public void push(T data){
    stack.add(data);
    }
//    remove the top element
    public T pop(){
        if(stack.isEmpty()){
        return null;}
        T t=stack.remove(stack.size()-1);
        return t;
    }
//    return the top element

    public T peek(){
        if(stack.isEmpty()) {
            return null;
        }
        return stack.get(stack.size()-1);
    }
//    return stack is empty or not
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackImplementation stack=new StackImplementation();
        stack.push("mani");
        stack.push("hari");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());

    }
}
