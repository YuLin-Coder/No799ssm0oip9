package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopinfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopinfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopinfenleiView;


/**
 * 药品分类
 *
 * @author 
 * @email 
 * @date 2021-04-12 19:05:57
 */
public interface YaopinfenleiService extends IService<YaopinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopinfenleiVO> selectListVO(Wrapper<YaopinfenleiEntity> wrapper);
   	
   	YaopinfenleiVO selectVO(@Param("ew") Wrapper<YaopinfenleiEntity> wrapper);
   	
   	List<YaopinfenleiView> selectListView(Wrapper<YaopinfenleiEntity> wrapper);
   	
   	YaopinfenleiView selectView(@Param("ew") Wrapper<YaopinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopinfenleiEntity> wrapper);
   	
}

