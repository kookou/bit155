package kr.or.bit;

/*
 기능, 행위 만드는 방법
 함수(function)(method)
 
 함수(method) : 행위 또는 기능의 최소단위 >>[**하나의 기능만 구현**]
 ex)먹는다, 걷는다, 잔다...
 
 클래스 : 필드 + 함수 + 생성자
 
ex) 게임방 : 게임기 동전넣고 .. 함수형태
         인형뽑기 : 동전넣고 인혀을 받는것.. 함수형태

Java 함수 종류 (4가지)
1. void , parameter(o) : void print(String str) {실행코드}
2. void , parameter(x) : void print() {실행코드}
3. return Type, parameter (o) : int print(int data){return 100;}
4. return Type, parameter (x) : int print(){return 200;}

void >> 돌려주는것이 없다 >> return value 없다
return Type >> (8가지 기본 타입 + String + 참조타입) + Array + collection + interface
ex) Car print(){ return new Car();}
ex) boolean print() {return true;}

parameter (인자, 인수, 매개값,전달값) : 게임기의 동전 구멍 (동전구멍 1개,여러개 일수 도 있다)
동전 구멍 2개면 2개에 다 동전 넣어야 실행, 동전구멍이 10개 면 10개에 다 넣어야됨
ex) void print(int a , int b, int c, int d, int f) >> print(10,20,30,40) (x)
 												   >> print(10,20,30,40,50) (o)
함수의 이름은 : 관용적 표현
의미있는 단어 조합
:getChnnelNumber(), getEmpListByEmpno()

함수라는 것은 반드시 호출(call) 되어야만 실행된다 : 누군가 그의 이름을 부르지 않으면 실행이 안된다
 */
public class Fclass {
	public int data;

	// void m()
	public void m() {
		System.out.println("일반함수 : void, parameter (x)");
	}

	// void m (int ..)
	public void m2(int i) {
		System.out.println("parameter value (scope :) : " + i);
		System.out.println("일반 함수 : void, parameter(o)");
	}

	public int m3() {
		return 100; // return type 이 있는 함수는 반드시 return 키워드를 사용
	}

	public int m4(int data) {
		return data + 1;
	}

	// 요기 까지가 기본..
	// 확장

	public int sum(int i, int j, int k) {
		return i + j + k;
	}

	// 함수를 만들었는데
	// 접근자가없다 >> default int subsum()
	// 다른폴더에서 사용할 수 없다
	/*
	 * int subSum(int i){ return i +100; }
	 */
	// 설계자의 의도 : subSum 함수의 활용은 내부에서 다른 함수를 도와주는 함수를 만들겠다.
	// 같은 폴더 내에서는 통용이 되지 않는다.
	// 의도 : subsum() 객체 (참조 변수) 접근하지 못하게 내부에서 사용
	// private 접근자, 한정자
	// 1.클래스 내부에서는 의미가 없다
	// 2.참조변수 (Fclass f = new Fclass()) f.private 볼수 없다.

	// subSum 함수는 [다른 함수를 보조]하는 함수다. 그래서 호출 되어서는 안된다
	// 내부에서 다른 함수가 호출해서 사용된다
	// 다른 함수가 사용하는 [ 공통 함수 ]
	private int subSum(int i) {
		return i + 100;
	}

	public void CallSubSum() {
		int result = subSum(100);
		print(result);
		
	}
	public void print(int data){
		System.out.println("data : " + data);
	}
	private int operationMethod(int data){
		return data *200;
	}
	public int opSum(int data){
		int result = operationMethod(data);
		if(result > 0){
			return 1;
			}else{
				return -1;
			}
	}
	//Quiz
	//a와 b 둘중에 큰 값을 return 하는 함수를 만드세요
	//ex) max(500,300) return 값이 500받게 하면 되요
	//public int max (int a, int b)
	
    //30점 return 문은 반복적 사용은 좋지 않다
	/*   public int max(int a, int b){  
		if(a < b ){
			return b;
		}else{
			return a;
		}
	}
	*/

	/*
	60점
	 
	int result = 0;
	if(a>b){
		return = a;
	}else {
		return = b;
	}
	return result;
	
	90점
	int max = (a>b)?a:b;
	return max;
	
	
	100점
	return (a>b) ? a:b;
	*/
	   public int max(int a, int b){
		   return (a>b) ? a:b;
	   }
	   public String concat(String s ,String s1 , String s2){
		   //String result = s+"/"+s1+"/"+s2;
		   //return result;
		   return s+"/"+s1+"/"+s2;
	   }
	   //요기까지가 함수의 기본편
	   //클래스는 타입이다....
	   
	   /*
	    public int call(int i , int j ){return i + j;}
	    public Tv call(){return}
	    
	    
	    
	    
	    
	    */
	   public Tv tcall(){ 
		  return new Tv();  //Tv 타입과 같은 객체 주소 를 넘겨준다
		  //Tv tv = new Tv(); return tv;
	   }
	   
	   public Tv tcall2(Tv t){
		   t.brandname = "A";
		   t.ch = 99;
		   return t;
		   
	   }
	   public int tcall3(int i){
		   return i+100;
	   }
	   
	   
	   //Today Point
	   //클래스는 memory 올려야 사용 가능하다
	   //Tv t = new Tv(); >> t 라는 변수는 Tv타입 객체의 주소를 갖는다
	   
	   public Tv objMethod(){ //Tv 라는 타입의 객체 주소를 돌려주네
		   Tv tv = new Tv();
		   return tv;
		   
	   }
	   public Tv objMethod2(){
		   return new Tv();
	   }
	   public Tv objMethod3(Tv t){  //Tv라는 타입을 같는 객체의 주소를 받겠다.
		   return t;
	   }
	   /*
	    main
	    1.Tv t = new Tv();
	    t.objMethod3(t);
	    
	    2.
	    t.objMethod3(new Tv());  //t 라는 변수는 new Tv() 의 주소 값을 받는다.
	      
	    */
	   
	   
	   

}	
	
	
