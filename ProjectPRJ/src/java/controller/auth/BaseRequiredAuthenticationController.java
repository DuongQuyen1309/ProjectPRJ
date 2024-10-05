/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.humanresource.User;

/**
 *
 * @author Duong Minh Quyen
 */
public abstract class BaseRequiredAuthenticationController extends HttpServlet{

    private boolean isAuthenticated(HttpServletRequest req){
        User user = (User) req.getSession().getAttribute("account");
        return (user != null);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(isAuthenticated(req)){
            User user = (User) req.getSession().getAttribute("account");
            doPost(req, resp, user);
        }
        else{
            resp.sendError(403, "You must login to access!");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(isAuthenticated(req)){
            User user = (User) req.getSession().getAttribute("account");
            doPost(req, resp, user);
        }
        else{
            resp.sendError(403, "You must login to access!");
        }
    }
    protected abstract void doGet(HttpServletRequest req, HttpServletResponse resp, User account) throws ServletException, IOException;
    protected abstract void doPost(HttpServletRequest req, HttpServletResponse resp, User account) throws ServletException, IOException;
}
