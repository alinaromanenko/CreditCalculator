package Servlets;

import ru.nsu.flowerstore.Data;
import ru.nsu.flowerstore.DataBaseImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/admin")
public class AdminServlets extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int minSum = Integer.parseInt(req.getParameter("minSum"));
        int maxSum = Integer.parseInt(req.getParameter("maxSum"));
        int minMonth = Integer.parseInt(req.getParameter("minMonth"));
        int maxMonth = Integer.parseInt(req.getParameter("maxMonth"));
        double intRate = Double.parseDouble(req.getParameter("intRate"));
        Data data = new Data(minSum,maxSum,minMonth,maxMonth,intRate);
        try{
            DataBaseImpl database = new DataBaseImpl();
            database.changeData(data);
        }catch (Exception e){
            e.printStackTrace();
        }
        String nextJSP = "index.jsp";
        RequestDispatcher dispatcher = req.getRequestDispatcher(nextJSP);
        dispatcher.forward(req,resp);

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

}
