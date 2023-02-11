package servlet;

import model.UrlName;
import model.Users;
import service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ChartServlet", urlPatterns = "/chart")
public class ChartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsersService usersService = new UsersService();
        List<Users> users = usersService.getUsers();
        req.setAttribute("users", users);
        req.getRequestDispatcher(UrlName.CHART.getValue()).forward(req, resp);
    }
}
