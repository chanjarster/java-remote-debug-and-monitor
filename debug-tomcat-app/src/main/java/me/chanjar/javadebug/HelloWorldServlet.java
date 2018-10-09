package me.chanjar.javadebug;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(name="helloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

  private final AtomicInteger count = new AtomicInteger(0);

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.addHeader("content-type", "text/plain");
    resp.getWriter().println("Hello World. count: " + count.incrementAndGet());
  }

}
