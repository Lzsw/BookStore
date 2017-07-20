package org.fkit.mapper;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.fkit.domain.Book;
import org.fkit.domain.User;
import org.fkit.mapperProvider.BookDynaSqlProvider;

/**
 * BookMapper接口
 * */
public interface BookMapper {

	/**
	 * 查询所有图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from book ")
	List<Book> findAll();
	
	/**
	 * 查询情感类图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from book where category_sn=20170701")
	List<Book> findAllqinggan();
	
	/**
	 * 查询励志类图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from book where category_sn=20170702")
	List<Book> findAllencouragement();
	
	/**
	 * 查询推理类图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from book where category_sn=20170703")
	List<Book> findAllreasoning();
	
	/**
	 * 查询长篇小说类图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from book where category_sn=20170704")
	List<Book> findAllnovel();
	
	@Select(" select * from book where id = #{id}" )
	Book findBookDetail(Integer id);
	
	
    @Select("select * from book where id=#{id} ")
    Book  findWithId(@Param("id") Integer id);
    
    
	
    //动态插入物品
    @SelectProvider(type=BookDynaSqlProvider.class,method="insertBook")
	void save(Book bood);
    //动态修改物品
    @SelectProvider(type=BookDynaSqlProvider.class,method="updateBook")
	void update(Book book);
    //动态查询物品
    @SelectProvider(method = "selectWhitParam", type = BookDynaSqlProvider.class)
    List<Book> selectById(Map<String, Object> params);
	
}