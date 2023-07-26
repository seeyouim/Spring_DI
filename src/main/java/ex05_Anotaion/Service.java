package ex05_Anotaion;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sic")
public class Service {
	@Autowired 		// 변수이름과 참조되는 클래스의 아이디가 같을 때 사용
//	@Inject			// 변수이름과 참조되는 클래스의 아이디가 같을 때 사용
	// 변수이름과 참되는 클래스의 아이디가 다를 때 사용
	@Qualifier("mySQLDAO")
	private DAO dao;
	public Service() {}
	
	// 생성자를 이용해서 dao 주입
	public Service(DAO dao) {
		
		this.dao = dao;
	}
	// setter를 이용
	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public DAO getDao() {
		return dao;
	}
	
	// 실행 하고자 하는 메서드
	public void biz() {
		dao.prn();
	}
}
