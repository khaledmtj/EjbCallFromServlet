package com.example.EjbCallFromServlet;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@LocalBean
@Stateless
public class HelloSessionBean implements HelloBusiness {
    String page = "";

    @Override
    public String helloWorld() {
        page += "<html><body>";
        page += "<h1>Hello From Bean!</h1>";
        page += "</body></html>";

        return page;
    }
}