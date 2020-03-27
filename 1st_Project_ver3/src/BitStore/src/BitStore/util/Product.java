package BitStore.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import BitStore.domain.ProductVO;
import BitStore.domain.UserVO;

public class Product {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public void insertProduct() {
		int productNo = Integer.parseInt("880" + (r.nextInt(900000) + 100000));
		System.out.print("�߰��� ��ǰ�� �̸��� �Է��ϼ���: ");
		String productName = sc.nextLine();
		System.out.print("�߰��� ��ǰ�� ����� �Է��ϼ���: ");
		int stock = Integer.parseInt(sc.nextLine());
		String dateDate;
		while (true) {
			System.out.print("�߰��� ��ǰ�� ��������� �Է��ϼ���: ");
			dateDate = sc.nextLine();
			Pattern idPattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
			Matcher matcher = idPattern.matcher(dateDate);
			if (!matcher.matches()) {
				System.out.println("YYYY-MM-DD ������ ����ϼ���.");
			} else {
				break;
			}
		}
		System.out.print("�߰��� ��ǰ�� ������ �Է��ϼ���: ");
		int price = Integer.parseInt(sc.nextLine());
		BitStore.productList.put(productNo, new ProductVO(productNo, 
				productName, stock, dateDate, price));
		writeProduct();
	}

	public void writeProduct() {
		File file = new File("productList.txt");
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file, true);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(BitStore.productList);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void selectProduct() {
		System.out.println("[��ǰ��� ��ȸ]");
		Iterator<Integer> mapIter = BitStore.productList.keySet().iterator();
		while (mapIter.hasNext()) {
			int key = mapIter.next();
			ProductVO value = BitStore.productList.get(key);
			System.out.println(value + " / ");
		}
	}

	
//	public void selectProduct() {
//		File file = new File("productList.txt");
//		FileInputStream fis = null;
//		BufferedInputStream bis = null;
//		ObjectInputStream ois = null;
//		try {
//			fis = new FileInputStream(file);
//			bis = new BufferedInputStream(fis);
//			ois = new ObjectInputStream(bis);
//			System.out.println("??????");
//			BitStore.productList = (HashMap<Integer, ProductVO>) ois.readObject();
//			System.out.println("??????2222222222");
//			System.out.println(BitStore.productList);
//			Set<Integer> keys = BitStore.productList.keySet();
//			for (int key : keys) {
//				System.out.println(key);
//			}
//
//		} catch (Exception e) {
//			e.getStackTrace();
//		} finally {
//			try {
//				ois.close();
//				bis.close();
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return null;
//	}

	public void updateProduct() {
		//������Ʈ ����
		writeProduct();
	}

	public void deleteProduct() {
		//���� ����
		writeProduct();
	}

}