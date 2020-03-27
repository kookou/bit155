import java.util.ArrayList;

class EmpData{
	private String name;
	private int[] numbers;
	private ArrayList elist;
	
	EmpData(){
		this.name = "아무개";
		//초기화 (메모리를 갖는것 : heap 만들어진 객체의 주소)
		this.numbers = new int[10];
		elist = new ArrayList();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//private int[] numbers;
	//getter , setter
	public int[] getNumbers() {
		return this.numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	//private ArrayList elist;
	public ArrayList getElist() {
		return this.elist;
	}
	public void setElist(ArrayList elist) {
		this.elist = elist;
	}
}
public class Ex04_ArrayList_Parameter {
	public static void main(String[] args) {
		EmpData empdata = new EmpData();
		System.out.println(empdata.toString());
		System.out.println(empdata.getElist().toString());
		
		ArrayList li = new ArrayList();
		li.add(100);
		li.add(200);
		
		empdata.setElist(li);
		System.out.println(empdata.getElist().toString());
		
	}

}








