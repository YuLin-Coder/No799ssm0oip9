package com.entity.view;

import com.entity.BaosunshenbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报损申报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 19:05:57
 */
@TableName("baosunshenbao")
public class BaosunshenbaoView  extends BaosunshenbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaosunshenbaoView(){
	}
 
 	public BaosunshenbaoView(BaosunshenbaoEntity baosunshenbaoEntity){
 	try {
			BeanUtils.copyProperties(this, baosunshenbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
