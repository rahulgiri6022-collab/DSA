class MyQueue {
    Stack<Integer> s1=new Stack();
    private int size;
    Stack<Integer> s2=new Stack();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        
        s1.push(x);
        size++;
        
       
        
    }
    
    public int pop() {
        if(s2.isEmpty()){
            if(!s1.isEmpty()){
                for(int i=1;i<=size;i++){
            s2.push(s1.pop());

            }
             
        }

           
        }
        size--;
       
        return s2.pop();
        
    }
    
    public int peek() {

        if(s2.isEmpty()){
            if(!s1.isEmpty()){
                for(int i=1;i<=size;i++){
            s2.push(s1.pop());
        }
            }
           
        }
         
        return s2.peek();
        
    }
    
    public boolean empty() {
        return s2.isEmpty()&&s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */