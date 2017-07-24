package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Collect;
import org.fkit.domain.Shop;



public interface CollectMapper {
	@Select("select * from collect")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "book_id", property = "book", many = @Many(select = "org.fkit.mapper.CollectMapper.selectByBookId", fetchType = FetchType.LAZY)),		
		@Result(column = "book_id", property = "book_id")})
	List<Collect> findAll();
	
	 //加入收藏夹
    @Insert("insert into collect(book_id) values(#{book_id})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveCollect(Collect collect);
     //通过ID寻找商品
    @Select("select * from collect where book_id=#{book_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "book_id", property = "book", many = @Many(select = "org.fkit.mapper.BookMapper.selectByBookId", fetchType = FetchType.LAZY)),				
			 @Result(column = "book_id", property = "book_id") })
	Collect findWithId(@Param("book_id") int book_id);
    
    
   
    //删除商品
    @Delete("delete from collect where book_id=#{book_id}")
	void removeCollect(Collect collect);
}
