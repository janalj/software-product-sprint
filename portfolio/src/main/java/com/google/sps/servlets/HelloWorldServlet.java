package com.google.sps.servlets;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
   
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
     //Create a Greeting Object
    Greeting greeting = new Greeting( "a","b","c");

    ArrayList<String> mylist = new ArrayList<String> ();
    mylist.add("abc");
    mylist.add("cfd");
    mylist.add("ert");
    mylist.add("fg");
    mylist.add("ujk");
    String json = new Gson().toJson(mylist);
    //Gson gson = new Gson();
    //String json = gson.toJson(greeting);

    // Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }

    
  
  // create an Greeting class
  public class Greeting {
      private String first;
      private String second;
      private String third;
  
      // constructor 
      public Greeting(String first,String second, String third){
          this.first = first;
          this.second = second;
          this.third = third;
      }
  
  }


}
