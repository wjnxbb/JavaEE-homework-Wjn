
public class ToMettingDaoImpl implements ToMettingDao{
	
	public void todo(Metting[] m) {
		String Info=m[0].getTheme()+"\n";
		// TODO Auto-generated method stub
		for(int i = 0;i < m.length;i++){
			Info+=m[i].getBossInfo();
		}
		System.out.println(Info);
	}

}
