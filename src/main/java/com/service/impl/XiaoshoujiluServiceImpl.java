package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiaoshoujiluDao;
import com.entity.XiaoshoujiluEntity;
import com.service.XiaoshoujiluService;
import com.entity.vo.XiaoshoujiluVO;
import com.entity.view.XiaoshoujiluView;

@Service("xiaoshoujiluService")
public class XiaoshoujiluServiceImpl extends ServiceImpl<XiaoshoujiluDao, XiaoshoujiluEntity> implements XiaoshoujiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoshoujiluEntity> page = this.selectPage(
                new Query<XiaoshoujiluEntity>(params).getPage(),
                new EntityWrapper<XiaoshoujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoshoujiluEntity> wrapper) {
		  Page<XiaoshoujiluView> page =new Query<XiaoshoujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoshoujiluVO> selectListVO(Wrapper<XiaoshoujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoshoujiluVO selectVO(Wrapper<XiaoshoujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoshoujiluView> selectListView(Wrapper<XiaoshoujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoshoujiluView selectView(Wrapper<XiaoshoujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
