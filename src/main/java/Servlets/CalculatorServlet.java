package Servlets;

import ru.nsu.flowerstore.Data;
import ru.nsu.flowerstore.DataBase;
import ru.nsu.flowerstore.DataBaseImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
        /*DataBase dataBase = new DataBaseImpl();
        Data data = dataBase.getData();
        int minSum = data.getMinSum();
        int maxSum = data.getMaxSum();
        int avg = (minSum + maxSum)/2;
        int minTime = data.getMinTime();
        int maxTime = data.getMaxTime();
        int avgTime = (minTime + maxTime)/2;*/
        int minSum = 1000;
        int maxSum = 10000;
        int minTime = 1;
        int maxTime = 24;
        Object sum = req.getParameter("sum");
        Object time = req.getParameter("time");
        System.out.println(sum);
        if(sum == null){
            sum = (minSum + maxSum)/2;
        }
        if(time == null){
            time = (maxTime+minTime)/2;
        }
        req.setAttribute("minSum", minSum);
        req.setAttribute("maxSum", maxSum);
        req.setAttribute("sum", sum);
        req.setAttribute("minTime", minTime);
        req.setAttribute("maxTime", maxTime);
        req.setAttribute("time", time);
        getServletContext().getRequestDispatcher("/index/index.jsp").forward(req, resp);

        } catch (Exception ex){
            PrintWriter writer = resp.getWriter();
            writer.println("<h1> Oops, something went wrong </h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
