import java.util.EmptyStackException;

public class Stack {
	
	
	static class StackNode<T> {
		/*Class that represents a Node in a Stack.*/
		
		
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data) {
			/*Stack Node that indicates where data is*/
			this.data = data;
		}
		
		/*top of stack to pop*/
		private StackNode<T> top;
		
		public T pop() {
			/*
			 *  Stack Node that removes the top of the stack
			 * Return the element on the top of the stack 
			 */
			if(top == null) throw new EmptyStackException();
			T item = top.data;
			top = top.next;
			return item;
		}
		
		public void push(T item) {
			/*
			 *  Stack Node that removes the top of the stack
			 *  Return the element on the top of the stack
			 */
			StackNode<T> t = new StackNode<T>(item);
			t.next = top;
			top = t;
		}
		
		public T peek() {
			/*
			 *  Stack node that shows the top data of the stack
			 *  Return the element at the top of the stack. 
			 */
			if(top == null) throw new EmptyStackException();
			return top.data;
		}
		
		public boolean isEmpty() {
			/*
			 *  Stack node if a stack is empty or not
			 *  Returns whether the top of the private stack contains
			 *  data or not.  
			 */
			return top == null;
		}
		
		
	}
	
	
}
