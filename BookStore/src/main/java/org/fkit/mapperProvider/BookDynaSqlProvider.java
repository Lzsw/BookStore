package org.fkit.mapperProvider;

import org.apache.ibatis.jdbc.SQL;
import org.fkit.domain.Book;

public class BookDynaSqlProvider {
				// 动态插入
				public String insertBook(Book book){
					
					return new SQL(){
						{
							INSERT_INTO("book");
							if(book.getName() != null && !book.getName().equals("")){
								VALUES("name", "#{name}");
							}
							if(book.getAuthor() != null && !book.getAuthor().equals("")){
								VALUES("author", "#{author}");
							}
							if(book.getPrice() != null && !book.getPrice().equals("")){
								VALUES("price", "#{price}");
							}
							if(book.getPublication() != null && !book.getPublication().equals("")){
								VALUES("publication", "#{publication}");
							}
							if(book.getRemark() != null && !book.getRemark().equals("")){
								VALUES("remark", "#{remark}");
							}
							if(book.getCategory_sn() != null && !book.getCategory_sn().equals("")){
								VALUES("category_sn", "#{category_sn}");
							}
							if(book.getBook_sn() != null && !book.getBook_sn().equals("")){
								VALUES("book_sn", "#{book_sn}");
							}
							if(book.getImage() != null && !book.getImage().equals("")){
								VALUES("image", "#{image}");
							}
							if(book.getPicture() != null && !book.getPicture().equals("")){
								VALUES("picture", "#{picture}");
							}
						}
					}.toString();
				}
				// 动态更新
					public String updateBook(Book book){
						
						return new SQL(){
							{
								UPDATE("book");
								if(book.getName() != null){
									SET(" name = #{name} ");
								}
								if(book.getAuthor() != null){
									SET(" author = #{author} ");
								}
								if(book.getPrice() != null){
									SET(" price = #{price} ");
								}
								if(book.getPublication() != null){
									SET(" publication = #{publication} ");
								}
								if(book.getRemark() != null){
									SET("remark = #{remark} ");
								}
								if(book.getCategory_sn() != null){
									SET("category_sn = #{category_sn} ");
								}
								if(book.getBook_sn() != null){
									SET("book_sn = #{book_sn} ");
								}
								if(book.getImage() != null){
									SET("image = #{image} ");
								}
								
								if(book.getPicture() != null){
									SET("picture = #{picture} ");
								}
								
								
								WHERE(" id = #{id} ");
							}
						}.toString();
					}
}
