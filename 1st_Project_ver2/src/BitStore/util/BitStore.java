package BitStore.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import BitStore.domain.BoardVO;
import BitStore.domain.ProductVO;
import BitStore.domain.UserVO;

public class BitStore {
	public static Map<String, UserVO> userList = new HashMap<>();
	public static Map<Integer, ProductVO> productList = new HashMap<>();
	public static Map<Integer, ProductVO> discardProductList = new HashMap<>();
	public static Map<Integer, BoardVO> boardList = new HashMap<>();
	public static UserVO currentLoginUser;
	private Scanner sc;
	private UserVO user;

	public BitStore() {
		sc = new Scanner(System.in);
	}

	public void join() {
		user = new UserVO();
		checkID();
		checkPwd();
		System.out.println("ȸ������ �̸��� �Է��� �ּ���.");
		user.setUserName(sc.nextLine().trim());
		checkPhone();
		user.setUserPoint(1000);
		System.out.println("ȸ������ �ܾ��� �Է��� �ּ���.");
		user.setMoney(Integer.parseInt(sc.nextLine().trim()));
		checkPoint();
		user.setOrderList(null);
		userList.put(user.getID(), user);
		writeUserList();

	}

	public void checkID() {
		System.out.println("�� Bit ������ ȸ�������� ȯ�� �մϴ١�");
		System.out.println("����� ���̵� �Է����ּ��� ");
		System.out.println("(5~15�� ������ ���� �� ���ڸ� �������ּ���.)");
		Set<String> keys = userList.keySet();

		while (true) {
			String userID = sc.nextLine().trim();
			Pattern idPattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*[^!@#$%^*+=-])(?=.*[^��-�R])(?=.*[0-9]).{5,15}$");
			Matcher matcher1 = idPattern.matcher(userID);

			for (String key : keys) {
				if (key.equals(userID)) {
					System.out.println("�̹� ������� ���̵��Դϴ�. �ٽ� �Է��� �ּ���");
					checkID();
				}
			}
			if (!matcher1.matches()) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("5~15�� ������ ���ڸ� �����Ͽ� �ٽ� �Է��� �ּ���");

			} else {
				user.setID(userID);
				return;
			}
		}
	}

	public void checkPwd() {
		System.out.println("����� ��й�ȣ�� �Է����ּ���.");
		System.out.println("(8~20�� ������ ���� �� ����,Ư�����ڸ� �������ּ���.)");
		while (true) {
			String userPwd = sc.nextLine().trim();
			Pattern pwPattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,20}$");
			Matcher matcher1 = pwPattern.matcher(userPwd);
			if (!matcher1.matches()) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("8~20�� ������ ���� �� ����,Ư�����ڸ� ������ �ٽ� �Է��� �ּ���.");
			} else {
				user.setPwd(userPwd);
				return;
			}
		}
	}

	public void checkPhone() {
		System.out.println("ȸ������ �ڵ��� ��ȣ�� �Է��� �ּ���.");
		System.out.println("(010-0000-0000 �������� �Է��� �ּ���.)");
		while (true) {
			String userPhone = sc.nextLine().trim();
			Pattern phonePattern = Pattern.compile("^01([0|1|0]?)-?([0-9]{3,4})-?([0-9]{4})$");
			Matcher matcher1 = phonePattern.matcher(userPhone);
			if (!matcher1.matches()) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("010-0000-0000 �������� �Է��� �ּ���.");
			} else {
				user.setUserPhone(userPhone);
				return;
			}
		}
	}
	public void checkPoint(){
		System.out.println("����ī�带 �����ϼ̴ٸ� 1���� ���ٸ� 2���� �Է��� �ּ���");
		while (true) {
			if (sc.nextLine().equals("1")) {
				user.setDiscount(true);
				break;
			} else if (sc.nextLine().equals("2")) {
				user.setDiscount(false);
				break;
			} else {
				System.out.println("�߸��Է� �ϼ̽��ϴ�.");
			}
		}
	}

	public void writeUserList() {
		String filename = "UserList.txt";
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream out = null;

		try {
			fos = new FileOutputStream(filename);
			bos = new BufferedOutputStream(fos);
			out = new ObjectOutputStream(bos);
			out.writeObject(userList);

			out.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void login() {

		while (true) {
			System.out.println("�� Bit ������ �α��Ρ�");
			System.out.println("���̵� �Է����ּ��� : ");
			String userID = sc.nextLine().trim();

			if (!userList.containsKey(userID)) {
				System.out.println("�ش��ϴ� ID�� �����ϴ�.");
				login();
			} else if (userList.containsKey(userID)) {
				System.out.println("��й�ȣ�� �Է����ּ��� : ");
				String userPwd = sc.nextLine().trim();
				if (userList.get(userID).getPwd().equals(userPwd)) {
					System.out.println("Bit �������� �α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("Password�� Ȯ���� �ּ���");
				}
			}
		}

	}

	public void logout() {

	}

	public String findID(String userName, String userPhone) {
		return "ID";
	}

	public String findPwd(String ID, String userName) {
		return "pwd";
	}

	public void readUserList() {

	}

	public void readProductList() {

	}

	public void readDiscardProductList() {

	}

	public void readBoardList() {

	}
}
