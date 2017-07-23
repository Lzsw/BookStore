package org.fkit.service.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.fkit.mapper.ShopMapper;
import org.fkit.domain.Shop;
import org.fkit.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("shopService")
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopMapper shopMapper;

	@Override
	public List<Shop> getAll() {
		// TODO Auto-generated method stub
		return shopMapper.findAll();
	}
	
	@Override
	public Shop findShop(int book_id) {
		// TODO Auto-generated method stub
		return shopMapper.findWithId(book_id);
	}

	@Override
	public Shop saveShop(int book_id) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		shop.setBook_id(book_id);
		final int i = 1;
		shop.setCount(i);
		shopMapper.saveShop(shop);
		return shop;
	}
	@Override
	public Shop addShop(int book_id) {
		// TODO Auto-generated method stub
		Shop shop = shopMapper.findWithId(book_id);
		shopMapper.addShop(shop);
		return shop;
	}

	@Override
	public Shop reduceShop(int book_id) {
		// TODO Auto-generated method stub
		
				Shop shop = shopMapper.findWithId(book_id);
				if (shop.getCount() >= 1) {
					shopMapper.reduceShop(shop);
				} else {
					Error e = null;
					throw new RuntimeErrorException(e);
				}
				return shop;
	}
	@Override
	public Shop increaseShop(int book_id) {
		// TODO Auto-generated method stub
		
				Shop shop = shopMapper.findWithId(book_id);
				if (shop.getCount() >= 1) {
					shopMapper.increaseShop(shop);
				} else {
					Error e = null;
					throw new RuntimeErrorException(e);
				}
				return shop;
	}

	@Override
	public void clearShop() {
		// TODO Auto-generated method stub
		shopMapper.clearShop();
	}

	@Override
	public Shop removeShop(int book_id) {
		// TODO Auto-generated method stub
		Shop shop = shopMapper.findWithId(book_id);
		shopMapper.removeShop(shop);
		return shop;
	}

}
