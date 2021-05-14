package com.song.practice.dynamicSql.xml;

import static com.song.practice.dynamicSql.common.Template.getSqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.song.practice.dynamicSql.common.GoodsDTO;
import com.song.practice.dynamicSql.common.SearchCriteria;
public class MenuService {

	public void showMenu(int price) {

		//sqlSession 연결
		SqlSession sqlSession  = getSqlSession();
		//DynamicSqlMapper를  sqlSession을 이용해 getMapper로 mapperRegistry로부터 불러온다
		DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

		/*기본 자료형으로는 동적쿼리르 비교할 수 없다*/
		//동적쿼리를 이용할 떄 주의할점 if태그는 조건식이 필요하다, 기본자료형은 동적쿼리에서 비교할 수 없다, 그래서 HashMap에 key값, 혹은 DTO에 getter를 이용해서 조건식의 값을 확인하므로
		//Map혹은 DTO로 전환해서 해야한다.
		Map<String, Integer> map = new HashMap<>();
		map.put("price", price);

		List<GoodsDTO> goodsList = mapper.selectGoodsList(map);

		if(goodsList != null && goodsList.size() > 0) {
			for(GoodsDTO goods : goodsList) {
				System.out.println(goods);
			}
		}else {
			System.out.println("존재하지않습니다");
		}

		sqlSession.close();

	}

	public void searchMenu(SearchCriteria SearchCriteria) {

		SqlSession sqlSession = getSqlSession();

		DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

		List<GoodsDTO> goodsList = mapper.searchMenu(SearchCriteria);

		if(goodsList != null && goodsList.size() > 0) {
			for(GoodsDTO goods : goodsList) {
				System.out.println(goods);
			}
		}else {
			System.out.println("검색기준에 없습니다. 다시한번 확인해주세요~");
		}
		
		sqlSession.close();
	}

	public void selectMenuBySupCategory(SearchCriteria inputSupCategory) {
		
		SqlSession sqlSession = getSqlSession();
		DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
		
		List<GoodsDTO> menuList = mapper.selectMenuBySupCategory(inputSupCategory);
		
		if(menuList != null && menuList.size() > 0 ) {
			for(GoodsDTO menu : menuList) {
				System.out.println("menu: " + menu);
			}
		} else {
			System.out.println("존재하지않습니다");
		}
		sqlSession.close();
		
	}

}
