package controller;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LogOutController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("uname") != null) {
            req.getSession().invalidate();
            System.out.println("user name from session  ");
        }
//
//        String username = (String) req.getSession().getAttribute("username");
//        System.out.println("user name from session " + username);
//        req.getSession().removeAttribute(username);
//        req.getSession().invalidate();
//        resp.sendRedirect("admin");


        resp.setContentType("text/html");
        Cookie loginCookie = null;
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("user")){
                    loginCookie = cookie;
                    break;
                }
            }
        }
        if(loginCookie != null){
            loginCookie.setMaxAge(0);
            resp.addCookie(loginCookie);
        }


        HttpServletResponse httpResponse = (HttpServletResponse) resp;

        httpResponse.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
        resp.addHeader("Cache-Control", "post-check=0, pre-check=0");
        httpResponse.setHeader("Pragma","no-cache");
        httpResponse.setDateHeader ("Expires", 0);

        HttpSession session = req.getSession();
        if (session.getAttribute("uid") == null || session.getAttribute("username") == null ) {
            resp.sendRedirect("admin");
            return;
        }
        resp.sendRedirect("admin");
    }




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post log out");
    }
}
