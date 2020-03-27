class Human{
	String name;
}
class OverTest{
	int add(int i,int j){
		return i+j;
	}
	void add(Human human){
		System.out.println(human.name);
	}
	int add(int param){
		return param;
	}
	
	//point : 배열도 타입이다
	int [] add(int[] param){
		int[] target = new int[param.length];
		for(int i = 0; i <param.length; i++){
			target[i] = param[i]+1;
		}
		return target;
		
	}
	int[] add(int[]so,int[]so2){
		int length = (so.length > so2.length) ? so.length:so2.length;
		int [] resultarray = new int[length];
		
		int[] aaa = new int[so.length];
		for(int i =0; i<so.length;i++){
			so[i] = i+1;
			for(int j =0; i<so2.length;i++){
				so2[j] = j+i;
			}
		}
		return aaa;
	}
}
public class Ex09_Array_Parameter {

	public static void main(String[] args) {
		OverTest ot = new OverTest();
		int[] soruce = {10,20,30,40,50};
		int[] target = ot.add(soruce);
		for(int ta : target){
			System.out.println(ta);
		}
		int[] bb = {1,2,3,4,5};
		int[] aa = {3,4,5,6,7};
		int[] b = ot.add(bb,aa);
		for(int taa : b){
			System.out.println(b);
		}
	}
}
