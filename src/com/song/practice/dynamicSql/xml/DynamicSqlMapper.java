package com.song.practice.dynamicSql.xml;

import java.util.List;
import java.util.Map;

import com.song.practice.dynamicSql.common.GoodsDTO;

public interface DynamicSqlMapper {

	List<GoodsDTO> selectGoodsList(Map<String, Integer> map);

}
