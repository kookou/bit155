package BitStore.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import BitStore.domain.ProductVO;

public class PurChase {
	private Scanner in = new Scanner(System.in);
	public static List<ProductVO> basket;
	
	public void selectPoint() {
		System.out.print("���� ���� ����Ʈ : ");
		System.out.println(BitStore.currentLoginUser.getUserPoint());
	}
	
	public void discountProduct() {
	
	}
	
	public void insertBasket() {
		while(true) {
			System.out.println("��ٱ��Ͽ� ���� ��ǰ��ȣ�� �Է��ϼ���,");	
			int productNo = in.nextInt();
			//	public static Map<Integer, ProductVO> productList = new HashMap();
			// ���⿡�� key ������ �ٱ��ؼ� ProductVO��ü ���� ���� ����Ʈ�� �ֱ�~
			
		}
		
		
	}
	
}
