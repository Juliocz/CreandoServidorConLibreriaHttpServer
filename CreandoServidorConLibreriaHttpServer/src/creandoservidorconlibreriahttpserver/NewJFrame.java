/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creandoservidorconlibreriahttpserver;

import Server.MyServer;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class NewJFrame extends javax.swing.JFrame {
    MyServer server;
    byte[]arrayimage;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        server=new MyServer() {
            @Override
            public void report(String msg) {
                jTextAreaReport.setText(jTextAreaReport.getText().toString()+msg+"\n");
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldsubhost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextFieldBody = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaReport = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabelimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Puerto");

        jTextField1.setText("80");

        jButton1.setText("Iniciar server");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear Contexto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Body");

        jTextFieldsubhost.setText("/hola");

        jLabel3.setText("SubHost");

        jTextFieldBody.setColumns(20);
        jTextFieldBody.setRows(5);
        jScrollPane1.setViewportView(jTextFieldBody);

        jLabel4.setText("Report");

        jTextAreaReport.setColumns(20);
        jTextAreaReport.setRows(5);
        jScrollPane2.setViewportView(jTextAreaReport);

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldsubhost)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldsubhost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelimage, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        server.setPort(Integer.parseInt(jTextField1.getText().toString()));
        server.startServer();
        //agrego contexto url host y handler codigo, donde me llamara cuando hagan peticion y yo respondere con header y body, body son los datos, tambien puedo evaluar el post
        server.addContextGet("/",new HttpHandler() {
            @Override
            public void handle(HttpExchange he) throws IOException {
                server.println(he.getRemoteAddress().toString());
                
                byte[]buff=new byte[he.getRequestBody().available()];
                he.getRequestBody().read(buff);
               /* if(he.getAttribute("fname").toString().equalsIgnoreCase("julio"))
                    JOptionPane.showMessageDialog(null,"Hola julio :)");
                
                */
                
                
                server.println("Query:\n"+he.getRequestURI().getQuery());
                server.println("BufferPOST: \n"+new String(buff));
            String respone="<h2>Hola a todos bienvenidos a mi pagina jeje :)</h2>"+
                    "<h1>METODO POST<h1>"+"<form action=\"/action_page.php\" method=\"post\">\n" +
"  <label for=\"fname\">First name:</label>\n" +
"  <input type=\"text\" id=\"fname\" name=\"fname\"><br><br>\n" +
"  <label for=\"lname\">Last name:</label>\n" +
"  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n" +
"  <input type=\"submit\" value=\"Submit\">\n" +
"</form>"+"<h1>METODO GET<h1>"+
                    "<form action=\"/action_page.php\" method=\"get\">\n" +
"  <label for=\"fname\">First name:</label>\n" +
"  <input type=\"text\" id=\"fname\" name=\"fname\"><br><br>\n" +
"  <label for=\"lname\">Last name:</label>\n" +
"  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n" +
"  <input type=\"submit\" value=\"Submit\">\n" +
"</form>"
                    ;
            he.getResponseHeaders().add("Content-Type","text/html");
            he.sendResponseHeaders(200,respone.length());
            he.getResponseBody().write(respone.getBytes());
                        
            he.getRequestBody().close();//cierro respuesta recibida
            
            he.getResponseBody().close();//cierro respuesta enviada
            }
        });
        
        
        //server file
        server.addContextGet("/file.mp4",new HttpHandler() {
            @Override
            public void handle(HttpExchange he) throws IOException {
            byte[]buff=readAllFile("C:\\Users\\Julio\\Documents\\EaseUS\\EaseUS RecExperts\\20211007_211833.mp4");
            server.println(he.getProtocol());
            server.println("byte buff: "+buff.length);
            he.getResponseHeaders().add("Content-Type","video/mp4");
            //he.getResponseHeaders().add("Content-Type","video/mp4");
            he.getResponseHeaders().add("ETag","17c0313-81a7de-542002b36d400");
            he.getResponseHeaders().add("Accept-Ranges","bytes");
            he.sendResponseHeaders(200,buff.length);
            //he.getRequestHeaders().add("Content-Length",buff.length+"");
            he.getResponseBody().write(buff);
            he.getResponseBody().close();
            }
        });
        server.addContextGet("/image",new HttpHandler() {
            @Override
            public void handle(HttpExchange he) throws IOException {
            byte[]buff=readAllFile("C:\\Users\\Julio\\Pictures\\janem pared8.png");
            server.println(he.getProtocol());
            server.println("byte buff: "+buff.length);
            he.getResponseHeaders().add("Content-Type","image/gif");
            //he.getResponseHeaders().add("Content-Type","video/mp4");

            he.getResponseHeaders().add("Accept-Ranges","bytes");
            he.sendResponseHeaders(200,buff.length);
            //he.getRequestHeaders().add("Content-Length",buff.length+"");
            he.getResponseBody().write(buff);
            he.getResponseBody().close();
            }
        });
        
        server.addContextGet("/streampantalla.jpg",new HttpHandler() {
            @Override
            public void handle(HttpExchange he) throws IOException {
                try {
   
                    Robot r=new Robot();
                    //BufferedImage imagecapture=r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                    BufferedImage imagecapture=r.createScreenCapture(new Rectangle(0, 0,350,350));
                    server.println(he.getProtocol());
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ImageIO.write(imagecapture, "jpg", baos);
                    baos.flush();
                    server.println("byte buff: "+baos.toByteArray());
                    he.getResponseHeaders().add("Content-Type","image/gif");
                    //he.getResponseHeaders().add("Content-Type","video/mp4");
                    he.getResponseHeaders().add("Accept-Ranges","bytes");
                    he.sendResponseHeaders(200,baos.toByteArray().length);
                    //he.getRequestHeaders().add("Content-Length",buff.length+"");
                    he.getResponseBody().write(baos.toByteArray());
                    he.getResponseBody().close();
                } catch (AWTException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
       /*server.addContextGet("/streampantalla.jpg",new HttpHandler() {
            @Override
            public void handle(HttpExchange he) throws IOException {
                server.println(he.getProtocol());
                server.println("byte buff: "+arrayimage.length);
                he.getResponseHeaders().add("Content-Type","image/gif");
                //he.getResponseHeaders().add("Content-Type","video/mp4");
                he.getResponseHeaders().add("Accept-Ranges","bytes");
                he.sendResponseHeaders(200,arrayimage.length);
                //he.getRequestHeaders().add("Content-Length",buff.length+"");
                he.getResponseBody().write(arrayimage);
                he.getResponseBody().close();
            }
        });*/
        
       // captureImage();//capturo imagen constantemente y guardo en array byte
       // streamImage();//hago peticion http y obtengo imagen
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void captureImage(){
         new Thread(new Runnable() {
             @Override
             public void run() {
           while(true){
                 try {
                     Robot r=new Robot();
                     //BufferedImage imagecapture=r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                     BufferedImage imagecapture=r.createScreenCapture(new Rectangle(0, 0,350,350));
                     ByteArrayOutputStream baos = new ByteArrayOutputStream();
                     ImageIO.write(imagecapture, "jpg", baos);
                     
                     baos.flush();
                     arrayimage=baos.toByteArray();
                 } catch (AWTException ex) {
                     Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (IOException ex) {
                     Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 }
             }
         }).start();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        server.addContextGet(jTextFieldsubhost.getText().toString(),new HttpHandler() {
            @Override
            public void handle(HttpExchange he) throws IOException {
              server.println(he.getProtocol());
            String respone=jTextFieldBody.getText().toString();
            he.sendResponseHeaders(200,respone.length());
            he.getResponseBody().write(respone.getBytes());
            he.getResponseBody().close();
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextAreaReport.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    public static byte[] readAllFile(String localUrlFile){
        try {
            RandomAccessFile f=new RandomAccessFile(localUrlFile, "r");
            byte[]buff=new byte[(int)f.length()];
            f.read(buff);
            return buff;
        } catch (Throwable ex) {
            ex.printStackTrace();
            return new byte[0];
        } 
    }
    
    private void streamImage(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                
                    while(true){
                        System.out.println("Pidiendo imagen...");
                        Image image = null;
                        try {
                            URL url = new URL("http://localhost/streampantalla.jpg");
                            image = ImageIO.read(url);
                        
                        jLabelimage.setIcon(new ImageIcon(image));
                        
                        
                            Thread.sleep(10);
                        } catch (Throwable ex) {
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                
               }
        }).start();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelimage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaReport;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea jTextFieldBody;
    private javax.swing.JTextField jTextFieldsubhost;
    // End of variables declaration//GEN-END:variables
}
