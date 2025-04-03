package com.busanit501.test1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="mytest1", urlPatterns = "/my")
public class test2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>test2</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>test2</h1>");
        out.println("<h2>이제 됐다 시발!</h2></body>");
        out.println("</html>");
        out.close();
    }
}
