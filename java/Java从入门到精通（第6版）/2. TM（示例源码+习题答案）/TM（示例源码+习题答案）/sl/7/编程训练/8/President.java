
public class President extends PublicServant //����һ��President��̳�PublicServant
{
	@Override
	public void handleAffairs() {//��дhandleAffairs()����
		super.handleAffairs(); //���ø���PublicServant��handleAffairs()����
		System.out.println("��ͳ�ƿط��롢���ߺͷ��򣬴���������������֮�������"); //����̨���
	}
}
