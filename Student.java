package HomeWorkPackage;

//26
//import java.util.*;

import java.util.*;

@SuppressWarnings("unused")
public class Student {
	//��Ա����
	private String name; //ѧ������
	private int stuId; //ѧ��
	private String birDate; //����
	private boolean gender; //�Ա�

// 8	
//	public String getName() {
//		return name;
//	}
//	public int getStuId() {
//		return stuId;
//	}
//	public String getBirDate() {
//		return birDate;
//	}
//	public boolean getGender() {
//		return gender;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setStuId(int id) {
//		this.stuId = id;
//	}
//	public void setBirData(String birDate) {
//		this.birDate = birDate;
//	}
//	public void setGender(boolean gender) {
//		this.gender = gender;
//	} 
	
//������
	//���ܣ���ȡ or ����ѧ������
	public String getName() {
		return name;
	}
	//���ܣ���ȡ or ����ѧ��ѧ��
	public int getStuId() {
		return stuId;
	}
	//���ܣ���ȡ or ����ѧ������
	public String getBirDate() {
		return birDate;
	}
	//���ܣ���ȡ or ����ѧ���Ա�
	public boolean getGender() {
		return gender;
	}
	
	//���룺����(�ַ���)
	//���ܣ��޸�ѧ������ or ��ѧ��������ֵ
	public void setName(String name) {
		this.name = name;
	}
	//���룺ѧ��(����)
	//���ܣ��޸�ѧ��ѧ�� or ��ѧ��ѧ�Ÿ�ֵ
	//���أ��޷���ֵ
	public void setStuId(int id) {
		this.stuId = id;
	}
	//���룺����(�ַ���)
	//���ܣ��޸�ѧ������ or ��ѧ�����ձ�����ֵ
	//���أ��޷���ֵ
	public void setBirData(String birDate) {
		this.birDate = birDate;
	}
	//���룺�Ա�(������)
	//���ܣ��޸�ѧ���Ա� or ��ѧ���Ա������ֵ
	//���أ��޷���ֵ
	public void setGender(boolean gender) {
		this.gender = gender;
	} 
	
}
