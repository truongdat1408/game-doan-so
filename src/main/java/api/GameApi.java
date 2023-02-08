package api;

import com.google.gson.Gson;
import payload.BasicResponse;
import service.GameService;
import service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GameApi", urlPatterns = {"/api/game"})
public class GameApi extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BasicResponse basicResponse = new BasicResponse();

        HttpSession session = req.getSession();
        int userId = (int) session.getAttribute("userId");
        int number = Integer.parseInt(req.getParameter("number"));

        GameService gameService = new GameService();
        String result = gameService.checkNumber(number);
        UsersService usersService = new UsersService();
        usersService.updatePointAndChart(userId); //update point of user and chart

        basicResponse.setStatusCode(200);
        basicResponse.setData(result);

        Gson gson= new Gson();
        String dataJson = gson.toJson(basicResponse);

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(dataJson);
        out.flush();
        out.close();
    }
}
