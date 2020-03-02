package com.zx.dao.impl;

import com.zx.dao.BaseDao;
import com.zx.dao.IRoomDao;

public class RoomDaoImpl extends BaseDao implements IRoomDao{


	@Override
	public void insert(String type, String price, String info, int hotelId) {
		String sql = "INSERT INTO `room`(`id`, `type`, `price`, `info`, `hotelId`) VALUES (0, ?,?,?,?)";
		super.update(sql, type,type,info,hotelId);
	}
}


/*
 * id int(11) auto_increment,
	type int(2) not null,
	price double(6,2) not null,
	info varchar(100),
	hotelId int(11),
	foreign key (hotelId) REFERENCES hotel(id),
	primary key(id)

 */