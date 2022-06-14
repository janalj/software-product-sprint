package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get t3he value entered in the form.
    String textValue = request.getParameter("text-input");
    // get name 
    String name = request.getParameter("Name");

    // get email 

    String email = request.getParameter("Email");

    //String textValue = request.getParameter("data");
    // Print the value so you can see it in the server logs.
    System.out.println("Name: " +name + "Email: " + email +"You submitted: " + textValue);

    // Write the value to the response so the user can see it.
    response.getWriter().println("Name: " +name + "Email: " + email +"You submitted: " + textValue);
    response.sendRedirect("/index.html");
  }
}