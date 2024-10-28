package com.dao;

import com.entity.BaosunshenbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaosunshenbaoVO;
import com.entity.view.BaosunshenbaoView;


/**
 * 报损申报
 * 
 * @author 
 * @email 
 * @date 2021-04-12 19:05:57
 */
public interface BaosunshenbaoDao extends BaseMapper<BaosunshenbaoEntity> {
	
	List<BaosunshenbaoVO> selectListVO(@Param("ew") Wrapper<BaosunshenbaoEntity> wrapper);
	
	BaosunshenbaoVO selectVO(@Param("ew") Wrapper<BaosunshenbaoEntity> wrapper);
	
	List<BaosunshenbaoView> selectListView(@Param("ew") Wrapper<BaosunshenbaoEntity> wrapper);

	List<BaosunshenbaoView> selectListView(Pagination page,@Param("ew") Wrapper<BaosunshenbaoEntity> wrapper);
	
	BaosunshenbaoView selectView(@Param("ew") Wrapper<BaosunshenbaoEntity> wrapper);
	
}
