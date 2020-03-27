package kr.or.bit;
//���� ���� ����� �ڷᱸ�� (stack)
//������� : �⺻������ Array : Objrct[]stackarr
//����� ���� �ִ� ��ġ ����(index) 
//��� : push , pop empty(����ִ��� Ȯ��), full(�����ִ��� Ȯ��)
public class MyStack {
	private Object[] stackarr; //�����
    private int maxsize;  // �ִ�ũ��
    private int top;  // �迭�� index ��
    
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
    	if(top+1 == stackarr.length){ //<top = -1 �̱� ������ ��ġ���� ���� 0,1,2 �� top���� 2 ������ stackarr.length(�迭�� ĭ�� ����)�� 3�̱� ������ +1�� ���ش�
    		return true;
    	}else{
    		return false;
    	}
    }
    public void push(Object i){
    	if(full() == true){
    		System.out.println("stack full");
    	}else{
    		stackarr[++top] = i; // <top = -1 �̱� ������ 0��° ĭ�� �־��ֱ� ���ؼ� ��ġ����(+�� �����ϰ�) �� ����Ѵ�
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
