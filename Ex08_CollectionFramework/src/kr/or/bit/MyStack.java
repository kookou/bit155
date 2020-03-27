package kr.or.bit;
//내가 직접 만드는 자료구조 (stack)
//저장공간 : 기본적으로 Array : Objrct[]stackarr
//저장소 값이 있는 위치 정보(index) 
//기능 : push , pop empty(비어있는지 확인), full(꽉차있는지 확인)
public class MyStack {
	private Object[] stackarr; //저장소
    private int maxsize;  // 최대크기
    private int top;  // 배열의 index 값
    
    public MyStack(int maxsize){
    	this.maxsize = maxsize;
    	stackarr = new Object[maxsize];
    	top = -1;
    	
    }
    public boolean isEmpty(){
    	//return (top == -1);
    	if(top+1 == 0){
    		return true;
    	}else{
    		return false;
    	}
    }
    public boolean full(){
    	//return (top == maxsize -1);
    	if(top+1 == stackarr.length){ //<top = -1 이기 때문에 전치증가 사용시 0,1,2 로 top값은 2 이지만 stackarr.length(배열의 칸의 갯수)는 3이기 때문에 +1을 해준다
    		return true;
    	}else{
    		return false;
    	}
    }
    public void push(Object i){
    	if(full() == true){
    		System.out.println("stack full");
    	}else{
    		stackarr[++top] = i; // <top = -1 이기 때문에 0번째 칸에 넣어주기 위해서 전치증가(+를 먼저하고) 를 사용한다
    	}
    }
    public Object pop(){
    	Object value = null;
    	if(isEmpty()){
    		System.out.println("stack empty");
    	}else{
    		value = stackarr[top];
    		top--;
    	}
    	return value;
    	
    }
    
    
    
    
    
}
