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


import com.dao.BaosunshenbaoDao;
import com.entity.BaosunshenbaoEntity;
import com.service.BaosunshenbaoService;
import com.entity.vo.BaosunshenbaoVO;
import com.entity.view.BaosunshenbaoView;

@Service("baosunshenbaoService")
public class BaosunshenbaoServiceImpl extends ServiceImpl<BaosunshenbaoDao, BaosunshenbaoEntity> implements BaosunshenbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaosunshenbaoEntity> page = this.selectPage(
                new Query<BaosunshenbaoEntity>(params).getPage(),
                new EntityWrapper<BaosunshenbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaosunshenbaoEntity> wrapper) {
		  Page<BaosunshenbaoView> page =new Query<BaosunshenbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaosunshenbaoVO> selectListVO(Wrapper<BaosunshenbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaosunshenbaoVO selectVO(Wrapper<BaosunshenbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaosunshenbaoView> selectListView(Wrapper<BaosunshenbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaosunshenbaoView selectView(Wrapper<BaosunshenbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
