//会议
public class Metting {
	//主题
	private String theme;
	//参加的老板
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
	//打印会议老板信息
	public String getBossInfo(){
		return "老板信息:姓名："+boss.getName()+"  公司："+boss.getCompany()+"  汽车"+boss.getCar().toString()+"  爱好"+boss.getHobby()+"\n";
	}
}
