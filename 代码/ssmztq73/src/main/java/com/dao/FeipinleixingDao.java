package com.dao;

import com.entity.FeipinleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeipinleixingVO;
import com.entity.view.FeipinleixingView;


/**
 * 废品类型
 * 
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
public interface FeipinleixingDao extends BaseMapper<FeipinleixingEntity> {
	
	List<FeipinleixingVO> selectListVO(@Param("ew") Wrapper<FeipinleixingEntity> wrapper);
	
	FeipinleixingVO selectVO(@Param("ew") Wrapper<FeipinleixingEntity> wrapper);
	
	List<FeipinleixingView> selectListView(@Param("ew") Wrapper<FeipinleixingEntity> wrapper);

	List<FeipinleixingView> selectListView(Pagination page,@Param("ew") Wrapper<FeipinleixingEntity> wrapper);
	
	FeipinleixingView selectView(@Param("ew") Wrapper<FeipinleixingEntity> wrapper);
	

}
