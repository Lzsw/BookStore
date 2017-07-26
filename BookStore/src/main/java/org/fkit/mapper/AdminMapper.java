package org.fkit.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Admin;

public interface AdminMapper {
	/**
	 * 根据登录名和密码查询管理员
	 * @param String loginname
	 * @param String password
	 * @return 找到返回Admin对象，没有找到返回null
	 * */
	@Select("select * from admin where loginname = #{loginname} and password = #{password}")
	Admin findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	
}
