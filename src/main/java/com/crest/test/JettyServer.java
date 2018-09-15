package com.crest.test;

import com.crest.test.http.XmlParserServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class JettyServer {
    public static void start(int port) throws Exception {
        Server server = new Server(port);

        ServletContextHandler context = new ServletContextHandler(
                ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        context.setResourceBase("src/main/resources/pages");
        server.setHandler(context);

        // Add dump servlet
        context.addServlet(XmlParserServlet.class, "/dump");
        // Add default servlet
        context.addServlet(DefaultServlet.class, "/");

        server.start();
        server.join();
    }
}
