package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaosunshenbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaosunshenbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaosunshenbaoView;


/**
 * 报损申报
 *
 * @author 
 * @email 
 * @date 2021-04-12 19:05:57
 */
public interface BaosunshenbaoService extends IService<BaosunshenbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaosunshenbaoVO> selectListVO(Wrapper<BaosunshenbaoEntity> wrapper);
   	
   	BaosunshenbaoVO selectVO(@Param("ew") Wrapper<BaosunshenbaoEntity> wrapper);
   	
   	List<BaosunshenbaoView> selectListView(Wrapper<BaosunshenbaoEntity> wrapper);
   	
   	BaosunshenbaoView selectView(@Param("ew") Wrapper<BaosunshenbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaosunshenbaoEntity> wrapper);
   	
}

