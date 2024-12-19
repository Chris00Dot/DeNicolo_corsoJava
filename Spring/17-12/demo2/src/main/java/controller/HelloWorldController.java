package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Denota questa classe come un controller all'interno del modello MVC, permettendo di gestire le richieste HTTP.
@Controller 
public class HelloWorldController 
{

    // Associa questo metodo alle richieste HTTP GET inviate a "/hello", facendolo agire come gestore per tale endpoint.
    @RequestMapping("/hello") 
    // Indica che la stringa restituita dal metodo deve essere inviata come corpo della risposta HTTP, anziché interpretarla come un nome di vista.
    @ResponseBody 
    public String sayHello() 
    {
        // Questa è la logica del metodo; restituisce la stringa "Hello World", che sarà il corpo della risposta HTTP.
        return "Hello World"; 
    }
}