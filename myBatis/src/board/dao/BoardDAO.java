package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import board.vo.BoardVO;

public class BoardDAO {
	
	private SqlSession session;
	
	public BoardDAO() {
		session = new MyConfig().getInstance();
	}

	public void insert() {
		
		//String title = "�̹����� ��!!!";
		BoardVO board = new BoardVO();
		board.setTitle("vo��ü");
		board.setWriter("hong");
		
		//int cnt = session.insert("board.dao.BoardDAO.insert", title);
		int cnt = session.insert("board.dao.BoardDAO.insert", board);
		session.commit();
		System.out.println("�� " + cnt + "�� �� ����...");
	}
	
	public void select() {
		//��ü�Խñ� ��ȸ
		
		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectAll2");
		for(BoardVO board : list) {
			System.out.println(board);
		}
	}
	
	public void selectOne() {
		int boardNo = 4;
		BoardVO result = session.selectOne("board.dao.BoardDAO.selectByNo", 4);
		System.out.println(result);

		BoardVO board = new BoardVO();
		board.setNo(4);
		result = session.selectOne("board.dao.BoardDAO.selectByNo2", board);
		System.out.println(result);
	}
	
	public void selectWhere() {
		//1.title�� ���� �̸鼭 writer�� ȫ�浿�� �Խù� ��ȸ
		/*BoardVO board = new BoardVO();
		board.setTitle("����");
		board.setWriter("ȫ�浿");*/
		
		//2.�۾��̰� ȫ�浿�� �Խù��� ��ȸ
		/*BoardVO board = new BoardVO();
		board.setWriter("ȫ�浿");*/
		
		//3.title�� vo��ü�� �Խù��� ��ȸ
		/*BoardVO board = new BoardVO();
		board.setTitle("vo��ü");*/
		
		//4.��ü��ȸ
		BoardVO board = new BoardVO();
		
		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectWhere", board);
		for(BoardVO boardvo : list) {
			System.out.println(boardvo);
		}
	}
	
	public void selectWhere2() {
		//titled�� ����, writer�� ȫ�浿�� �Խù���ȸ
		
		Map<String, String> board = new HashMap<>();
		board.put("title", "����");
		board.put("writer", "ȫ�浿");
		
		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectWhere2", board);
		for(BoardVO boardvo : list) {
			System.out.println(boardvo);
		}
	}
	
	public void selectWhere3() {
		
		Map<String, String> board = new HashMap<>();
		board.put("no", "4");
		
		Map<String, Object> result = session.selectOne("board.dao.BoardDAO.selectWhere3", board);
		
		Set<String> keys = result.keySet();
		for(String key : keys) {
			System.out.println("key : " + key + ", value : " + result.get(key));
		}
	}
	
	public void selectNos() {
		int[] nos = {1,2,4,5,7,10,20,21};
		
		List<BoardVO>list = session.selectList("board.dao.BoardDAO.selectNos", nos);
		
		for(BoardVO b:list) {
			System.out.println(b);
		}
	}
	
	public void work() {
		//insert();
		//select();
		//selectOne();
		//selectWhere();
		//selectWhere2();
		//selectWhere3();
		selectNos();
	}
}