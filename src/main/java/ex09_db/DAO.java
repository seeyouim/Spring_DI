package ex09_db;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class DAO {
	// 실제 사용할 클래스 : SqlSessionTemplate
	// JSP에서 사용한 SplSession과 사용법이 같다.
	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public List<VO> getList() {
		List<VO> list = sqlSessionTemplate.selectList("members.list");
		return list;
	}
}
