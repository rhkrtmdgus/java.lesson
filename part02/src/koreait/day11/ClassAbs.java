package koreait.day11;
//�߻�Ŭ���� : ��ü�� ������������ �ʴ� ������ Ŭ���� �Դϴ�.
//�߻�޼ҵ带 ���� �ֽ��ϴ�. �߻�(abstract): ��üȭ���� ���� ����.
//�θ�Ŭ�������� ��üȭ���� ���� �߻�޼ҵ带 �ڽ�Ŭ������ ������(�������̵�)�ϵ��� �ϴ� ���Դϴ�.

public abstract class ClassAbs {
	
	protected String name;
	public abstract void test(); //�߻�޼ҵ� : �ڽĵ��� ������ �ؾ���
	
	public void pront() {
		System.out.println("name = " + name);
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
