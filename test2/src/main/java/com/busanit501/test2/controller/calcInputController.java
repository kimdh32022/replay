package com.busanit501.test2.controller;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calcInputController" , urlPatterns = "/calc/input")
public class calcInputController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet을 호출함.");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/calc/calc_input.jsp");
        dispatcher.forward(request, response);
    }
}
