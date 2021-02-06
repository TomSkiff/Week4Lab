
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author thoma
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       
       String path = getServletContext().getRealPath("/WEB-INF/note.txt");
       Note current;
       
       
       
       BufferedReader br = new BufferedReader(new FileReader(new File(path)));
       
        current= new Note(br.readLine(),br.readLine());
        br.close();
       
        request.setAttribute("title",current.getTitle());
        request.setAttribute("content",current.getContent());
       
       if(request.getParameter("edit") == null){
           getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
       }
       else{
           getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
       }
       
              
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        Note editCurrent;
        
        editCurrent = new Note(request.getParameter("title"),request.getParameter("content"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
        
        pw.println(editCurrent.getTitle());
        pw.println(editCurrent.getContent());
        pw.close();
        
        request.setAttribute("title",editCurrent.getTitle());
        request.setAttribute("content",editCurrent.getContent());
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }
    
 }




