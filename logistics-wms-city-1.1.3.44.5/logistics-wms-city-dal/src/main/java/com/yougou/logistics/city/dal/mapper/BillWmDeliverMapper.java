package com.yougou.logistics.city.dal.mapper;

import java.util.List;
import java.util.Map;

import com.yougou.logistics.base.common.exception.DaoException;
import com.yougou.logistics.base.dal.database.BaseCrudMapper;
import com.yougou.logistics.city.common.model.BillWmDeliverKey;

/**
 * 请写出类的用途 
 * @author zuo.sw
 * @date  2013-10-16 10:44:50
 * @version 1.0.0
 * @copyright (C) 2013 YouGou Information Technology Co.,Ltd 
 * All Rights Reserved. 
 * 
 * The software for the YouGou technology development, without the 
 * company's written consent, and any other individuals and 
 * organizations shall not be used, Copying, Modify or distribute 
 * the software.
 * 
 */
public interface BillWmDeliverMapper extends BaseCrudMapper {
	
	public List<String>  selectLabelListByDeliverNo(BillWmDeliverKey billWmDeliverKey)throws DaoException;
	
	/**
	 * 审核退厂确认单
	 * @param maps
	 * @throws DaoException
	 */
	public void procWmDeliverAuditCar(Map<String, String> maps) throws DaoException;
	
}