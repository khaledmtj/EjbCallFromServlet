package com.example.EjbCallFromServlet;

import javax.ejb.Remote;

@Remote
public interface HelloBusiness {
    public String helloWorld();
}
