package com.yizhouyuan.web.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.yizhouyuan.domain.Category;
import com.yizhouyuan.domain.Order;
import com.yizhouyuan.service.AdminService;
import com.yizhouyuan.service.impl.AdminServiceImpl;
import com.yizhouyuan.utils.BeanFactory;

public class AdminServlet extends BaseServlet {

	// 根据订单id查询订单项和商品信息
	public void findOrderInfoByOid(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 获得oid
		String oid = request.getParameter("oid");

		AdminService service = (AdminService) BeanFactory
				.getBean("adminService");

		List<Map<String, Object>> mapList = service.findOrderInfoByOid(oid);

		Gson gson = new Gson();
		String json = gson.toJson(mapList);
		System.out.println(json);

		response.setContentType("text/html;charset=UTF-8");

		response.getWriter().write(json);

	}

	// 获得所有的订单
	public void findAllOrders(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		AdminService service = (AdminService) BeanFactory
				.getBean("adminService");
		List<Order> orderList = service.findAllOrders();

		request.setAttribute("orderList", orderList);

		request.getRequestDispatcher("/admin/order/list.jsp").forward(request,response);

	}
 //获得所有商品的种类
	public void findAllCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// 提供一个List<Category> 转成json字符串
		AdminService service = (AdminService) BeanFactory.getBean("adminService");
		List<Category> categoryList = service.findAllCategory();

		Gson gson = new Gson();
		String json = gson.toJson(categoryList);

		response.setContentType("text/html;charset=UTF-8");

		response.getWriter().write(json);

	}

}
