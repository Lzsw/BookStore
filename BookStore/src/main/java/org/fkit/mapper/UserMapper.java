package org.fkit.mapper;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.fkit.domain.User;
import org.fkit.mapperProvider.UserDynaSqlProvider;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from user where loginname = #{loginname} and password = #{password}")
	User findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	
	
	/**
	 * 动态SQL
	 * @InsertProvider
	 * @UpateProvider
	 * @DeleteProvider
	 * */
	
	
	// 动态插入用户
			@SelectProvider(type=UserDynaSqlProvider.class,method="insertUser")
			void save(User user);
		// 动态修改用户
			@SelectProvider(type=UserDynaSqlProvider.class,method="updateUser")
			void update(User user);
	
	  /*
		 * 修改密码
	  */
		    @Update("update user set password=#{password} where username=#{username}")
			void updatePassword(User user);	
     
		    /*
			 * 找回密码
		  */
			@Select("select password from user where loginname = #{loginname}")
			User findPassword(@Param("loginname") String loginname);
			
			@Select("select * from user where loginname = #{loginname} and mail = #{mail}")
			User findPasswordEmail1(@Param("loginname") String loginname,@Param("mail") String mail);

}

