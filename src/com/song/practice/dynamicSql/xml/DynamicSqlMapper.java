package com.song.practice.dynamicSql.xml;

import java.util.List;
import java.util.Map;

import com.song.practice.dynamicSql.common.GoodsDTO;
import com.song.practice.dynamicSql.common.SearchCriteria;

public interface DynamicSqlMapper {

	List<GoodsDTO> selectGoodsList(Map<String, Integer> map);

	List<GoodsDTO> searchMenu(SearchCriteria searchCriteria);

}
