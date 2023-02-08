package servlet;


import model.UrlName;
import model.Users;
import service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UsersServlet", urlPatterns = {"/login"})
public class UsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello");
        req.getRequestDispatcher(UrlName.HOME.getValue()).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Users user = new Users();
        user.setName(name);

        UsersService usersService = new UsersService();
        int userId = usersService.addUsers(user);

        HttpSession session = req.getSession();
        session.setAttribute("userId", userId);
        session.setAttribute("username", name);

        resp.sendRedirect(UrlName.GAME.getValue());
    }
}
