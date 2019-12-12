package servlet;

import bean.User;
import dao.RegesisterUserDAO;
import dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author leaper
 * @description 这是RegesisterUserServlet类
 * @date 2019年 11月27日 14:33:57
 */
public class RegesisterUserServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        User user = new UserDAO().getUser(name, password);
        if (null != user) {
            response.sendRedirect("/registerfailed.jsp");
        } else {
            new RegesisterUserDAO().setUser(name, password);
            response.sendRedirect("/registeredSucceed.jsp");
        }
    }
}
