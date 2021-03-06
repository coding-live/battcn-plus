package com.battcn.framework.mybatis.mapper;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassName: BaseMapper
 * @Description:封装了通用Mybatis的操作,针对Mysql的BaseMapper  <br/>
 * 详情请参考具体代码
 * @author fly
 * @date 2017年2月22日
 */
@SuppressWarnings("rawtypes")
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T>, ConditionMapper {
}
