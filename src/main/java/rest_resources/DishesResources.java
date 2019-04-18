/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest_resources;

import entities.Item;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;
import jsfbeans.mockData.MealPool;

/**
 * 
 * @author a19990366@gmail.com
 */
@Stateless
@Path("/dishes")
public class DishesResources {
    @EJB
    private MealPool dishStorage;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getNames(){
         // 取得所有的菜名
         List<Item> allDishes = dishStorage.queryAll();
         // 菜名存進字串
         List<String> results = new ArrayList<>();
         // 回傳 Response 物件*/
         for (int i=1;i<allDishes.size();i++){
             results.add(allDishes.get(i).getName());
         }
         return Response
                 .ok()
                 .entity(results.toString())
                 .build();
    }
    
    
    //test command:curl  http://localhost:16903/improject/rest/dishes

    /*@POST
    @Consumes(MediaType.TEXT_PLAIN)
    public Response addDish(@Context UriInfo ui
        // Inject the InputStream to read the Chinese Characters
        , InputStream requestBody) throws IOException{
  
    // Read the request body
    BufferedReader bufferReader = new BufferedReader(new InputStreamReader(requestBody));
    // 如果寫入儲存庫的資料為亂碼, 在建立 Reader 時加入 encoding 參數
    // 參考: https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html#InputStreamReader(java.io.InputStream,%20java.lang.String)
    // BufferedReader bufferReader = new BufferedReader(new InputStreamReader(requestBody, "UTF-8"));
    String inputLine;
    StringBuilder sb = new StringBuilder();
    while ( (inputLine = bufferReader.readLine()) != null){
        sb.append(inputLine);
    }
    // 取得所有的菜名
    List<Item> allDishes = dishStorage.queryAll();
    // 菜名存進字串
    List<String> results = new ArrayList<>();
    // Add the dish to the dish storage
    for (int i=1;i<allDishes.size();i++){
             results.add(allDishes.get(i).setName());
         }
    int id = dishStorage.create(results.add(allDishe;
  
    // Print out to server log
    System.out.println(ui.getAbsolutePath().toString());
    System.out.println("Content:" + sb.toString());
  
    // Create the new url for the new dish
    // The new url pattern: http://localhost:8080/unit11/rest/dishes/{newDishID}
    URI newURI = ui.getAbsolutePathBuilder().path(String.valueOf(id)).build();
  
    // Create the response use ResponseBuilder object
    // Create a ResponseBuilder object with the entity containing the new URI.
    ResponseBuilder rb = Response.created(newURI);
    return rb.status(Response.Status.OK)
            .entity("Create a new dish")
            .type(MediaType.TEXT_PLAIN_TYPE.withCharset("utf-8"))
            .build();
    }*/
    
}
