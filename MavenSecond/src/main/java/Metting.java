//����
public class Metting {
	//����
	private String theme;
	//�μӵ��ϰ�
		private Boss boss;
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public Boss getBoss() {
		return boss;
	}
	public void setBoss(Boss boss) {
		this.boss = boss;
	}
	//��ӡ�����ϰ���Ϣ
	public String getBossInfo(){
		return "�ϰ���Ϣ:������"+boss.getName()+"  ��˾��"+boss.getCompany()+"  ����"+boss.getCar().toString()+"  ����"+boss.getHobby()+"\n";
	}
}
