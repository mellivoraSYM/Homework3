package HomeWorkPackage;

import java.util.*;

//6
//public class StudentManager {

//�޸�
public class StudentManager {
	//��Ա����
	//����
	//�������������ѧ����Ϣ��
	private static Student[] std = new Student[100]; 
	//�������Ԫ�ظ���
	private static int StuNum = 0;
	
//  6��8
//	public void StuInsert() {
	
//�޸�
	//���ܣ��������ѧ����Ϣ����Student������
	//���룺ѧ����Ϣ���ַ��ͣ�ÿ����಻��20����
	//���أ��޷���ֵ
	public void StuInsert() {
//		26
//		Scanner sc1 = new Scanner(System.in);
		
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		System.out.println("��������Ҫ������Ϣ��������(�������20��)");
		int num = sc1.nextInt();
		if(num > 20) {
			System.out.println("Ҫ�������Ϣ�����������������룡");
			StuInsert();
		}
		
//26
//		Scanner sc2 = new Scanner(System.in);
		
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		//��nextLine����
		String str;
		//strȥ�ո���γɵ����ַ�����ϳɵ�����
		String[] tempImfor = new String[4];
		System.out.println("������������Ϣ��(�����ʽΪ��ѧ������ ѧ�� �������� �Ա�)");
		
		//�ж�StuNum�Ƿ�==0������=0������Ҫ���������ݵĻ���֮�ϲ��룬����Ḳ��ԭ������
		
//6
//		if(StuNum == 0) {
		if(StuNum == 0) {
			for(int n = 0; n < num; n++) {
				//str�������һ����
				str = sc2.nextLine();
				//ȥ���ո�
				tempImfor = str.split(" ");
				
				Student st = new Student();
				st.setName(tempImfor[0]);
				st.setStuId(Integer.parseInt(tempImfor[1]));
				st.setBirData(tempImfor[2]);
				if(tempImfor[3].equals("Ů"))
					st.setGender(false);
				else if(tempImfor[3].equals("��"))
					st.setGender(true);
				
				std[n] = st;
				StuNum++;
			}
		}//if(StuNum==0)-end
		
//6
//		else {
//			for(int n = 0; n < num; n++) {
		else {
			for(int n = 0; n < num; n++) {
				//str�������һ����
				str = sc2.nextLine();
				//ȥ���ո�
				tempImfor = str.split(" ");
				
				Student st = new Student();
				st.setName(tempImfor[0]);
				st.setStuId(Integer.parseInt(tempImfor[1]));
				st.setBirData(tempImfor[2]);
				if(tempImfor[3].equals("Ů"))
					st.setGender(false);
				else if(tempImfor[3].equals("��"))
					st.setGender(true);
				
				std[StuNum++] = st;
			}//for-end
		}//else-end
		
		returnMenu();
	}//StuInsert()

//6��8
//	public void StuOutput() {
	
//�޸�
	//���ܣ����ѧ����Ϣ�����顿
	//���룺������
	//����ֵ���޷���ֵ
	public void StuOutput() {
		
//		18
//		if(std[0] == null) //δ�������ݣ��������
//			System.out.println("��ǰ�����ݿ���������ɳ����Ȳ�����Ϣ���������");
		if(std[0] == null) { //δ�������ݣ��������
			System.out.println("��ǰ�����ݿ���������ɳ����Ȳ�����Ϣ���������");
		}
		
//		5��6
//		else {
		
//�޸�
		//������
		else {
			//Ϊѧ������[ѧ�ŵ���]
			for(int i = 0; i < StuNum; i++) {
				for(int j = i+1; j < StuNum; j++) {
					if(std[i].getStuId() > std[j].getStuId()) {
						Student tmp = std[i];
						std[i] = std[j];
						std[j] = tmp;
					}
				}
			}
			
			System.out.println("   ���        " + " ����    " + "            ѧ��           " + 
									"           ��������        " + "     ��    �� ");
//			6
//			for(int n = 0; n < StuNum; n++) {
			
			for(int n = 0; n < StuNum; n++) {
				int i = n+1;
				
//				18
//				if(std[n].getGender())
//					System.out.println("  "+i+"  "+"  "+std[n].getName()+"  "+"  "+std[n].getStuId()
//						+"  "+"  "+std[n].getBirDate()+"  "+"  ��      ");
//				else 
//					System.out.println("  "+i+"  "+"  "+std[n].getName()+"  "+"  "+std[n].getStuId()
//							+"  "+"  "+std[n].getBirDate()+"  "+"  Ů      ");
				
				if(std[n].getGender()) {
					System.out.println("  "+i+"  "+"  "+std[n].getName()+"  "+"  "+std[n].getStuId()
						+"  "+"  "+std[n].getBirDate()+"  "+"  ��      ");
				}
				else {
					System.out.println("  "+i+"  "+"  "+std[n].getName()+"  "+"  "+std[n].getStuId()
							+"  "+"  "+std[n].getBirDate()+"  "+"  Ů      ");
				}
			}//end-for
//		}
		}//������else-end
		returnMenu();
		
	}//StuOutput()

//8
//	public void sortName() {
	
//�޸�
	//���ܣ�����������ѧ��������ѯ������Ϣ
	//���룺ѧ���������ַ��͡�
	//����ֵ����
	public void sortName() {
		System.out.println("���������ѯ��ѧ��������");
		
//26
//		Scanner scName = new Scanner(System.in);
		
		@SuppressWarnings("resource")
		Scanner scName = new Scanner(System.in);
		String name = scName.next();
		
		//���±�
		int index = -1;
		
//5��6��18
//		if(std[0] == null) 
//			System.out.println("��ǰ�����ݿɲ��ң����ɳ����Ȳ�����Ϣ���ٳ��Բ��Ҳ�����");
//		else {
//			//����������
//			String[] stuName = new String[100];
//			for(int n = 0; n < StuNum; n++) {
//				stuName[n] = std[n].getName();
//			}
//			
//			for(int n = 0; n < StuNum; n++) {
//				if(stuName[n].equals(name)) {
//					index = n;
//					break;
//				}
//			}
//			
//			if(index == -1) { 
//				System.out.println("ϵͳδ�ҵ���ѧ����Ϣ����˶�����Ҫ��ѯ��ѧ�������Ƿ���ȷ��");
//				sortName();
//			}
//			else {
//				System.out.println("����    " + "         ѧ��           " 
//						+ "         ��������        " + "   ��    �� ");
//				if(std[index].getGender())
//					System.out.println(std[index].getName()+"   "+std[index].getStuId()
//							+"   "+std[index].getBirDate()+"   ��      ");
//				else
//					System.out.println(std[index].getName()+"   "+std[index].getStuId()
//							+"   "+std[index].getBirDate()+"   Ů      ");
//			}
//		}
		
//�޸�
		//����ǰ���顾ϵͳ����û���κ�ѧ����Ϣ
		if(std[0] == null) {
			System.out.println("��ǰ�����ݿɲ��ң����ɳ����Ȳ�����Ϣ���ٳ��Բ��Ҳ�����");
		}
		
		//��ѧ����Ϣ
		else {
			//����������
			String[] stuName = new String[100];
			for(int n = 0; n < StuNum; n++) {
				stuName[n] = std[n].getName();
			}
			
			for(int n = 0; n < StuNum; n++) {
				if(stuName[n].equals(name)) {
					index = n;
					break;
				}
			}
			
			//�������ѧ��������δ�����顾ϵͳ��֮��
			if(index == -1) { 
				System.out.println("ϵͳδ�ҵ���ѧ����Ϣ����˶�����Ҫ��ѯ��ѧ�������Ƿ���ȷ��");
				sortName();
			}
			//���������ѧ������
			else {
				System.out.println("����    " + "         ѧ��           " 
						+ "         ��������        " + "   ��    �� ");
				//������
				if(std[index].getGender()) {
					System.out.println(std[index].getName()+"   "+std[index].getStuId()
							+"   "+std[index].getBirDate()+"   ��      ");
				}
				//��Ů��
				else {
					System.out.println(std[index].getName()+"   "+std[index].getStuId()
							+"   "+std[index].getBirDate()+"   Ů      ");
				}
			}//�������ѧ������else-end
		}//��ѧ����Ϣelse-end
		returnMenu();
	}

//8
//	public void deleteStu() {
	
//�޸�
	//���ܣ������������ѧ��������ɾ������������Ϣ
	//���룺ѧ���������ַ��͡�
	//�޷���ֵ
	public void deleteStu() {
		System.out.println("��������ɾ����ѧ��������");
		
//		26
//		Scanner scName = new Scanner(System.in);
		
		@SuppressWarnings("resource")
		Scanner scName = new Scanner(System.in);
		String name = scName.next();
		
		//���±�
		int index = -1;
		

//	6��8
//	public void changeStu() {
	
//�޸�
	//���ܣ���������ѧ���������޸ĸ������ֻ�ȫ����Ϣ
	//���룺ѧ�����������޸���Ϣ
	//�޷���ֵ
	public void changeStu() {
		System.out.println("���������޸ĵ�ѧ��������");
		
//		26
//		Scanner scName = new Scanner(System.in);
		
		@SuppressWarnings("resource")
		Scanner scName = new Scanner(System.in);
		String name = scName.next();
		
		//���±�
		int index = -1;
		
//5��6��18
//		if(std[0] == null) 
//			System.out.println("��ǰ�����ݿ��޸ģ����ɳ����Ȳ�����Ϣ���ٳ����޸Ĳ�����");
//		else {
//			//����������
//			String[] stuName = new String[100];
//			for(int n = 0; n < StuNum; n++) {
//				stuName[n] = std[n].getName();
//			}
//			
//			for(int n = 0; n < StuNum; n++) {
//				if(stuName[n].equals(name)) {
//					index = n;
//					break;
//				}
//			}
//			
//			if(index == -1) { 
//				System.out.println("ϵͳδ�ҵ���ѧ����Ϣ����˶����������ѧ�������Ƿ���ȷ��");
//				sortName();
//			}
//			else {
//				System.out.println("����    " + "         ѧ��           " 
//						+ "         ��������        " + "   ��    �� ");
//				
//				if(std[index].getGender())
//					System.out.println(std[index].getName()+"   "+std[index].getStuId()
//							+"   "+std[index].getBirDate()+"   ��      ");
//				else
//					System.out.println(std[index].getName()+"   "+std[index].getStuId()
//							+"   "+std[index].getBirDate()+"   Ů      ");
//				
//				System.out.println("�����������޸���Ϣ (��ʽ������ ѧ�� �������� �Ա������޸�����֮һ���������޸���Ϣ�س�����)");
//				Scanner scChange = new Scanner(System.in);
//				String changeImfor = scChange.nextLine();
//				
//				if(changeImfor.indexOf(" ") != -1) { //������޸���Ϣ�а����ո�
//					//���������м����ո�
//					int emptyNum = 0;
//					for(int i = 0; i < changeImfor.length(); i++) {
//						char tmp = changeImfor.charAt(i); //���ض�Ӧ�±��ϵ��ַ���
//						if(tmp == ' ') 
//							emptyNum++;
//					}
//					
//					//���ո�����������ݴ��޸���Ϣ������
//					String[] changeTmp = new String[emptyNum+1];
//					changeTmp = changeImfor.split(" ");
//					
//					//��ÿ������Ԫ���ж�����������ѧ�š��������»����Ա�
//					for(int i = 0; i < changeTmp.length; i++) {
//						changeImple(index, changeTmp[i]);
//					}	
//				}
//				else { //�޿ո�
//					changeImple(index, changeImfor);
//				}
//			}
//			System.out.println("��Ϊ���޸���ϣ��볢��������ѯ�����鿴��");
//		}
		
//	�޸�
		//ϵͳ��û������
		if(std[0] == null) 
			System.out.println("��ǰ�����ݿ��޸ģ����ɳ����Ȳ�����Ϣ���ٳ����޸Ĳ�����");
		//������
		else {
			//����������
			String[] stuName = new String[100];
			for(int n = 0; n < StuNum; n++) {
				stuName[n] = std[n].getName();
			}
			
			for(int n = 0; n < StuNum; n++) {
				if(stuName[n].equals(name)) {
					index = n;
					break;
				}
			}
			
			//�����������û����������
			if(index == -1) { 
				System.out.println("ϵͳδ�ҵ���ѧ����Ϣ����˶����������ѧ�������Ƿ���ȷ��");
				sortName();
			}
			//�����������������
			else {
				System.out.println("����    " + "         ѧ��           " 
						+ "         ��������        " + "   ��    �� ");
				//�������ѧ����������Ϣ
				if(std[index].getGender()) {
					System.out.println(std[index].getName()+"   "+std[index].getStuId()
							+"   "+std[index].getBirDate()+"   ��      ");
				}
				else {
					System.out.println(std[index].getName()+"   "+std[index].getStuId()
							+"   "+std[index].getBirDate()+"   Ů      ");
				}
				
				System.out.println("�����������޸���Ϣ (��ʽ������ ѧ�� �������� �Ա������޸�����֮һ���������޸���Ϣ�س�����)");
//26
//				Scanner scChange = new Scanner(System.in);
				
				@SuppressWarnings("resource")
				Scanner scChange = new Scanner(System.in);
				String changeImfor = scChange.nextLine();
				
				//������޸���Ϣ�а����ո�
				if(changeImfor.indexOf(" ") != -1) { 
					//���������м����ո�
					int emptyNum = 0;
					for(int i = 0; i < changeImfor.length(); i++) {
						char tmp = changeImfor.charAt(i); //���ض�Ӧ�±��ϵ��ַ���
						if(tmp == ' ') {
							emptyNum++;
						}
					}
					
					//���ո�����������ݴ��޸���Ϣ������
					String[] changeTmp = new String[emptyNum+1];
					changeTmp = changeImfor.split(" ");
					
					//��ÿ������Ԫ���ж�����������ѧ�š��������»����Ա�
					for(int i = 0; i < changeTmp.length; i++) {
						changeImple(index, changeTmp[i]);
					}	
				}//������޸���Ϣ�а����ո�if-end
				//�޿ո�
				else { 
					changeImple(index, changeImfor);
				}
			}//�������ѧ������else-end
			System.out.println("��Ϊ���޸���ϣ��볢��������ѯ�����鿴��");
		}//������else-end
		
		returnMenu();
	}//changeStu()-end
//	6��8
//	private void changeImple(int index, String str) {
	
//�޸�
	//���ܣ�����������޸���Ϣ�����Ӧ������λ����
	//���룺ѧ�����������޸���Ϣ
	//�޷���ֵ
	private void changeImple(int index, String str) {
		//�Ƿ���������ַ�
		int n = 0;
		boolean flag = false; //�ǲ����������Ա�
		for(int  j= 0; j < str.length(); j++) {
			n = (int)str.charAt(j);
			//�������ַ����뷶Χ�ڣ��������ַ�
			if(19968 <= n && n <= 40869) { 
				//���Ա�
				if(str.equals("��") || str.equals("Ů")) {
//					18
//					if(str.equals("��")) 
//						std[index].setGender(true);
//					else
//						std[index].setGender(false);
					
					if(str.equals("��")) {
						std[index].setGender(true);
					}
					else {
						std[index].setGender(false);
					}
				}
				//������
				else {
					std[index].setName(str);
				}
				flag = true; //���ˣ�
				break;
			} 
		}
		//������ǳ������»���ѧ�Ż���Ӣ����
		if(!flag) {
			int judge = 0;
			judge = (int)str.charAt(0);
//			18
//			//��������
//			if(str.contains("."))
//				std[index].setBirData(str);
//			//ѧ��:���ַ�Ϊ����
//			else if(48 <= judge && judge <= 57)
//				std[index].setStuId(Integer.parseInt(str));
//			//Ӣ����
//			else 
//				std[index].setName(str);
			
			//��������
			if(str.contains(".")) {
				std[index].setBirData(str);
			}
			//ѧ��:���ַ�Ϊ����
			else if(48 <= judge && judge <= 57) {
				std[index].setStuId(Integer.parseInt(str));
			}
			//Ӣ����
			else {
				std[index].setName(str);
			}
			
		} 
	}//changeImple-end

//	6��8
//	public void returnMenu() {
	
//�޸�
	//���ܣ�����˵���������������Ĳ˵�ѡ����ö�Ӧ�Ĺ��ܺ���
	//���룺�˵�ѡ��
	//�޷���ֵ
	public void returnMenu() {
		System.out.println("********************");
		System.out.printf("%-8s", "*");
		System.out.printf("%s", "1.����");
		System.out.printf("%18s", "*");
		System.out.println();
		
		System.out.printf("%-8s", "*");
		System.out.printf("%s", "2.���");
		System.out.printf("%18s", "*");
		System.out.println();
		
		System.out.printf("%-8s", "*");
		System.out.printf("%s", "3.��ѯ");
		System.out.printf("%18s", "*");
		System.out.println();
		
		System.out.printf("%-8s", "*");
		System.out.printf("%s", "4.�˳�");
		System.out.printf("%18s", "*");
		System.out.println();
		
		System.out.printf("%-8s", "*");
		System.out.printf("%s", "5.ɾ��");
		System.out.printf("%18s", "*");
		System.out.println();
		
		System.out.printf("%-8s", "*");
		System.out.printf("%s", "6.�޸�");
		System.out.printf("%18s", "*");
		System.out.println();
		System.out.println("********************");
		
//		26
//		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ�������");
		String num = sc.next();

//		5
//		if(num.equals("1")) {
//			StuInsert();
//		}
//		else if(num.equals("2")) {
//			StuOutput();
//		}
//		else if(num.equals("3")) {
//			sortName();
//		}
//		else if(num.equals("4")) {
//			Scanner yn = new Scanner(System.in);
//			System.out.println("��ȷ��Ҫ�˳��y/n");
//			if(yn.nextLine().contentEquals("y")) {
//				System.out.println("��Ϊ���˳�����");
//				return;
//			}
//			else 
//				returnMenu();
//		}
//		else if(num.equals("5")) {
//			deleteStu();
//		}
//		else if(num.equals("6")) {
//			changeStu();
//		}
//		else {
//			System.out.println("�������������ѡ��");
//			returnMenu();
//		}
		
//	�޸�
		//ѡ����롪�����ò��빦�ܺ���
		if(num.equals("1")) {
			StuInsert();
		}
		//ѡ�������������������ܺ���
		else if(num.equals("2")) {
			StuOutput();
		}
		//ѡ���ѯ�������ò�ѯ���ܺ���
		else if(num.equals("3")) {
			sortName();
		}
		//ѡ���˳�
		else if(num.equals("4")) {
//			26
//			Scanner yn = new Scanner(System.in);
			
			@SuppressWarnings("resource")
			Scanner yn = new Scanner(System.in);
			System.out.println("��ȷ��Ҫ�˳��y/n");
			//ȷ��Ҫ�˳�
			if(yn.nextLine().contentEquals("y")) {
				System.out.println("��Ϊ���˳�����");
				return;
			}
			else 
				returnMenu();
		}
		//ѡ��ɾ����������ɾ�����ܺ���
		else if(num.equals("5")) {
			deleteStu();
		}
		//ѡ���޸ġ��������޸Ĺ��ܺ���
		else if(num.equals("6")) {
			changeStu();
		}
		//�����������֮��������ַ���������������ٵ��ò˵�����������
		else {
			System.out.println("�������������ѡ��");
			returnMenu();
		}
	}//returnMenu()-end
//}
}//class-end
