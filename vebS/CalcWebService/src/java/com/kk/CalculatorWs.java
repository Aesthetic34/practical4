/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kk;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author rakes
 */
@WebService(serviceName = "CalculatorWs")
public class CalculatorWs {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Add")
    public int Add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int k = i + j;
        return k;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sub")
    public String sub(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int sub = a-b;
        return "Subtraction of "+a+" and "+b+" is "+sub;
    }
}
