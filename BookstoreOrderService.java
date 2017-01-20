/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it410.gmu.edu;

import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author david
 */
@Path("generic")
public class BookstoreOrderService {
    
    private static ArrayList<Customer> custJsonList = new ArrayList();
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BookstoreOrderService
     */
    public BookstoreOrderService() {
    }
    
    @POST
    @Path("addOrderJSON")
    @Consumes("application/json")
    @Produces(MediaType.TEXT_PLAIN)
    public String addCustomerJSON(Customer customer) {
           //System.out.println(" Customer = " + customer);
           custJsonList.add(customer);
           return "Customer successfully added!";
    }
    
    @GET
    @Path("getOrdersJSON")
    @Produces("application/json")
    public Customers getCustomerJSON() {
         Customers list = new Customers();
         list.setCustomersJSON(custJsonList);
         return list;
    }

    
}
