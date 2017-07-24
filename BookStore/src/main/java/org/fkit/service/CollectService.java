package org.fkit.service;

import java.util.List;

import org.fkit.domain.Collect;
import org.fkit.domain.Shop;

public interface CollectService {
	List<Collect> getAll();
	Shop findCollect(int book_id);
	Shop saveCollect(int book_id);
	Shop addCollect(int book_id);
	Shop removeCollect(int book_id);

}
