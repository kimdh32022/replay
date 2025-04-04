package com.busanit501.test2.controller;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="loginResultController", urlPatterns = "/login/result")
public class loginResultController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> username : "+ username +"</h1>");
        out.println("<h2> password : "+ password +"</h2>");
        out.println("<h1> Login Success!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
