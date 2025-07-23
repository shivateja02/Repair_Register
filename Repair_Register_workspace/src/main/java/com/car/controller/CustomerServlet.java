package com.car.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.car.dao.CarDetailsDao;
import com.car.model1.customer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CarDetailsDao carDao;

    public void init() {
        carDao = new CarDetailsDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        customer car = new customer();
        car.setCustomerId(Integer.parseInt(request.getParameter("customerId")));
        car.setName(name);
        car.setCarNo(request.getParameter("carNo"));
        car.setCarBrand(request.getParameter("carBrand"));
        car.setCarIssue(request.getParameter("carIssue"));
        car.setAddress(request.getParameter("address"));
        car.setContact(request.getParameter("contact"));

        try {
            int result = carDao.registerCarDetails(car);
            if (result > 0) {
                out.println("<html><body style='text-align:center;'>");
                out.println("<h2>Mr. " + name + ", your car issue got registered.</h2>");
                out.println("<p>We will intimate you after repair/service.</p>");
                out.println("<p>Thank you for choosing us!</p>");
                out.println("</body></html>");
            } else {
                out.println("<html><body><h2>Submission failed. Try again later.</h2></body></html>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<html><body><h2>Error: " + e.getMessage() + "</h2></body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
}
