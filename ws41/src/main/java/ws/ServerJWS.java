/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws;

import jakarta.xml.ws.Endpoint;


public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new Banqueservice());
        System.out.println("web service déployé sur http://0.0.0.0:9191/");
    }
}
