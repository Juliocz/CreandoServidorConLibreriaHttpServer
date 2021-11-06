/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julio
 */
public abstract class MyServer {
    String urlFolder="C:/xampp/htdocs/holamundo";
    int port=80;
    HttpServer server;
    public MyServer() {}
    public MyServer(int port){this.port=port;}

    public int getPort() { return port;}
    public void setPort(int port) {this.port = port;}
    
    
    public void startServer(){
        try {
            server=HttpServer.create(new InetSocketAddress(port),0);
            println("Servidor iniciado en el puerto: "+port);
        } catch (IOException ex) {
            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
            println("Error al iniciar servidor: \n"+ex.getMessage());
        }
        server.setExecutor(null);
        server.start();
    }
    //creo contexto de respuesta http Metodo GET
    public void addContextGet(String context,HttpHandler handler){//la url ej /hola y el handler, el codigo
        server.createContext(context, handler);
    }
    
    
    public void println(String msg){System.out.println(msg);report(msg);};
    public abstract void report(String msg);
    
}
