package com.dao;

import com.entity.XiaoshoujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoshoujiluVO;
import com.entity.view.XiaoshoujiluView;


/**
 * 销售记录
 * 
 * @author 
 * @email 
 * @date 2021-04-12 19:05:57
 */
public interface XiaoshoujiluDao extends BaseMapper<XiaoshoujiluEntity> {
	
	List<XiaoshoujiluVO> selectListVO(@Param("ew") Wrapper<XiaoshoujiluEntity> wrapper);
	
	XiaoshoujiluVO selectVO(@Param("ew") Wrapper<XiaoshoujiluEntity> wrapper);
	
	List<XiaoshoujiluView> selectListView(@Param("ew") Wrapper<XiaoshoujiluEntity> wrapper);

	List<XiaoshoujiluView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshoujiluEntity> wrapper);
	
	XiaoshoujiluView selectView(@Param("ew") Wrapper<XiaoshoujiluEntity> wrapper);
	
}
