package api;

import service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GameApi", urlPatterns = {"/api/chart/reset"})
public class ChartApi extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getServletPath();

        if ("/api/chart/reset".equals(url)) {
            resetChart();
        }
    }

    private void resetChart() {
        UsersService usersService = new UsersService();
        usersService.resetUsers();
    }
}
