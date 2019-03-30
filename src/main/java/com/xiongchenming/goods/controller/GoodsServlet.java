package com.xiongchenming.goods.controller;

import com.xiongchenming.goods.bean.WxbGood;
import com.xiongchenming.goods.service.IGoodsService;
import com.xiongchenming.goods.service.impl.IGoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GoodsServlet extends HttpServlet {
    private IGoodsService service = new IGoodsServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = req.getParameter("page");
        try {
            page = page == null ? "1" : page;
            List<WxbGood> goods = service.selectGoodsByPage(Integer.parseInt(page));
            req.setAttribute("goods",goods);
            req.getRequestDispatcher("goods_list.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
