package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/api/vanzari-masini/statistici/name")
public class CorsFilter extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Adaugă anteturile pentru CORS
        response.addHeader("Access-Control-Allow-Origin", "http://localhost:63342/SAD_MusicProject/SAD_MusicProject/src/main/java/WebPage/StatisticsPage.html?_ijt=g1obo1qunhho3at83a9nd3pu80&_ij_reload=RELOAD_ON_SAVE");
        response.addHeader("Access-Control-Allow-Methods", "GET, OPTIONS, HEAD, PUT, POST");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");

        // Alte operațiuni...

        // Răspunde cu datele tale
        response.getWriter().write("Datele tale");
    }
}