package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {

	public static void main(String[] args) {
		//String Ŭ������ split (�п���Ű��. �ɰ��� ) �޼ҵ�
		
		String temp = "��� 90 88 79";
		String result[] = temp.split(" ");
		System.out.println("index 0 : " + result[0]);
		System.out.println("index 1 : " + result[1]);
		System.out.println("index 2 : " + result[2]);
		System.out.println("index 3 : " + result[3]);
		//for ������
		for(int i = 0; i < result.length; i++) {
			System.out.println(String.format("result[%d] : %s", i, result[i]));
		}
		
		//���� for
		System.out.println("3. ���� for ���");
		for(String t : result)
			System.out.println("result ��� : " + t);
		
		String temp2 = "���, 90, 88, 79";
		result = temp2.split(", ");
		System.out.println("4. split ���� ��ȣ ,");
		for(String t : result)
			System.out.println("result ��� : " + t);
		
		temp2 = "���,,90,,88,,79";
		result = temp2.split(",");
		System.out.println("5. split ���� ��ȣ ,,");
		System.out.println(result.length);
		for(String t : result)
			System.out.println("result ��� : " + t);
		
		result = temp2.split(",,");
		System.out.println("6. split ���� ��ȣ ,,");
		System.out.println(result.length);
		for(String t : result)
			System.out.println("result ��� : " + t);
		
		//split �� ������ ���ڿ��� ���Խ� ���ڿ� �Դϴ� ( �������� ����)
		// ���Խ�
		
		temp2 = "���,90 88()79";
		result = temp2.split("[,()]");  // [] �ȿ� ���� ���� ��ȣ�� or�� ��
		System.out.println("5. split ���� ��ȣ ,,");
		System.out.println(result.length);
		for(String t : result)
			System.out.println("result ��� : " + t);
		
		temp2 = "���,90,88,79";
		result = temp2.split(",", 3);  // limit ���� �� ���� ���� ���� ���ڰ� ��ŭ ����
		System.out.println("8. split limit Ȯ��");
		System.out.println(result.length);
		for(String t : result)
			System.out.println("result ��� : " + t);
		
		
		//�迭�� ������ �ڷᱸ�� list
		//�迭�� list�� ��ȯ�ϴ� ���
		result = temp.split(",");
		List<String> rlist = Arrays.asList(result);
		
		// list �� ���� ����Ʈ �̱� ������ �������� �ؾ���
		
		//���� list�� �ٲٱ� ���ڸ� �ٽ� ���ο� ��ü�� �־� ���� ����Ʈ �����
		List<String> rlist2 = new ArrayList<String>(rlist);
		System.out.println(rlist);
		
		//Arrays.aslist�� �׽�Ʈ������ ��� �Ǵ� ������ ���� ����Ʈ ����� ��
		
	}

}
