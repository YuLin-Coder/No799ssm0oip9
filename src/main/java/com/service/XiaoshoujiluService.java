package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshoujiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoshoujiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshoujiluView;


/**
 * 销售记录
 *
 * @author 
 * @email 
 * @date 2021-04-12 19:05:57
 */
public interface XiaoshoujiluService extends IService<XiaoshoujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshoujiluVO> selectListVO(Wrapper<XiaoshoujiluEntity> wrapper);
   	
   	XiaoshoujiluVO selectVO(@Param("ew") Wrapper<XiaoshoujiluEntity> wrapper);
   	
   	List<XiaoshoujiluView> selectListView(Wrapper<XiaoshoujiluEntity> wrapper);
   	
   	XiaoshoujiluView selectView(@Param("ew") Wrapper<XiaoshoujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshoujiluEntity> wrapper);
   	
}

