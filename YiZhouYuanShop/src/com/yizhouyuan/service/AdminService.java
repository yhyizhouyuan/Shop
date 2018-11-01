package com.yizhouyuan.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.yizhouyuan.dao.AdminDao;
import com.yizhouyuan.domain.Category;
import com.yizhouyuan.domain.Order;
import com.yizhouyuan.domain.Product;

public interface AdminService {

	public List<Category> findAllCategory();

	public void saveProduct(Product product) throws SQLException;

	public List<Order> findAllOrders();

	public List<Map<String, Object>> findOrderInfoByOid(String oid);

}
