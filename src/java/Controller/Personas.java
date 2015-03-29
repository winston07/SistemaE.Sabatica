/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.PersonaDao;
import Dao.PersonaDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Persona;

/**
 *
 * @author SAMUEL
 */
public class Personas extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void list(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PersonaDao aO = new PersonaDaoImpl();
        HttpSession session=request.getSession(true);
        session.setAttribute("list", aO.list2());
        response.sendRedirect("Vistas/Personas.jsp");
        
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opc=request.getParameter("opc");
        if(opc.equals("Eliminar")){
        PersonaDao pd=new PersonaDaoImpl();
        String id=request.getParameter("id");
        pd.delete(id);
        this.list(request, response);
        }
     }
    
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         processRequest(request, response);
        String opc=request.getParameter("opc");
        if(opc.equals("list"))
        {
        this.list(request, response);
        }
        
    }
    

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opc=request.getParameter("opc");
        if(opc.equals("Insertar"))
        {
        PersonaDao pd=new PersonaDaoImpl();
        Persona p=new Persona();
        p.setId_persona(request.getParameter("id"));
        p.setPer_nombres(request.getParameter("nombre"));
        p.setPer_apell_pat(request.getParameter("ap"));
        p.setPer_apell_mat(request.getParameter("am"));
        p.setPer_dni(request.getParameter("dni"));
        p.setPer_direccion(request.getParameter("dir"));
        p.setPer_cumple(Date.valueOf(request.getParameter("cumple")));
        p.setPer_telefono(request.getParameter("telef"));
        p.setPer_correo(request.getParameter("correo"));
        pd.save(p);
        this.list(request, response);
        }
        if(opc.equals("Modificar"))
        {
        PersonaDao pd=new PersonaDaoImpl();
        Persona p=new Persona();
        p.setPer_nombres(request.getParameter("nombre"));
        p.setPer_apell_pat(request.getParameter("ap"));
        p.setPer_apell_mat(request.getParameter("am"));
        p.setPer_dni(request.getParameter("dni"));
        p.setPer_direccion(request.getParameter("dir"));
        p.setPer_cumple(Date.valueOf(request.getParameter("cumple")));
        p.setPer_telefono(request.getParameter("telef"));
        p.setPer_correo(request.getParameter("correo"));
        p.setId_persona(request.getParameter("id"));
        pd.edit(p);
        this.list(request, response);
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
