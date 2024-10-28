package com.entity.vo;

import com.entity.BaosunshenbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 报损申报
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-12 19:05:57
 */
public class BaosunshenbaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 药品编号
	 */
	
	private String yaopinbianhao;
		
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 报损时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baosunshijian;
		
	/**
	 * 报损数量
	 */
	
	private Integer baosunshuliang;
		
	/**
	 * 原因说明
	 */
	
	private String yuanyinshuoming;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：药品编号
	 */
	 
	public void setYaopinbianhao(String yaopinbianhao) {
		this.yaopinbianhao = yaopinbianhao;
	}
	
	/**
	 * 获取：药品编号
	 */
	public String getYaopinbianhao() {
		return yaopinbianhao;
	}
				
	
	/**
	 * 设置：药品名称
	 */
	 
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：报损时间
	 */
	 
	public void setBaosunshijian(Date baosunshijian) {
		this.baosunshijian = baosunshijian;
	}
	
	/**
	 * 获取：报损时间
	 */
	public Date getBaosunshijian() {
		return baosunshijian;
	}
				
	
	/**
	 * 设置：报损数量
	 */
	 
	public void setBaosunshuliang(Integer baosunshuliang) {
		this.baosunshuliang = baosunshuliang;
	}
	
	/**
	 * 获取：报损数量
	 */
	public Integer getBaosunshuliang() {
		return baosunshuliang;
	}
				
	
	/**
	 * 设置：原因说明
	 */
	 
	public void setYuanyinshuoming(String yuanyinshuoming) {
		this.yuanyinshuoming = yuanyinshuoming;
	}
	
	/**
	 * 获取：原因说明
	 */
	public String getYuanyinshuoming() {
		return yuanyinshuoming;
	}
			
}
