package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.fkit.domain.Book;
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
    
    @Select("select * from book where id=#{id}")
    @Results({@Result(id = true,column="id",property="id"),@Result(column="id",property="id"),
    @Result(column="name",property="name"),@Result(column="price",property="price"),
    @Result(column="image",property="image"),@Result(column="count",property="count")})
    List<Book> selectByBookId(int id);
    
    //动态插入物品
    @SelectProvider(type=BookDynaSqlProvider.class,method="insertBook")
	void save(Book book);
    //动态修改物品
    @SelectProvider(type=BookDynaSqlProvider.class,method="updateBook")
	void update(Book book);
    //根据id删除书本
    @Delete("delete from book where id=#{id}")
    void removeBook(Book book);
    
    
	
}
