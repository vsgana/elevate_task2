package com.example.feedback;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class FeedbackServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String name = request.getParameter("name");
    String message = request.getParameter("message");

    System.out.println("Feedback received from " + name + ": " + message);

    response.setContentType("text/plain");
    response.getWriter().write("Thank you, " + name + "! Your feedback has been received.");
  }
}

