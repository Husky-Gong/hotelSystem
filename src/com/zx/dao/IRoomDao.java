package com.zx.dao;

import com.zx.pojo.Room;

public interface IRoomDao {
	
	void insert(String type, String price, String info, int hotelId);

}
