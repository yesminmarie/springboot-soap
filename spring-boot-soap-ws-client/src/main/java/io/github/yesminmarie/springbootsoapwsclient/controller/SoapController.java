package io.github.yesminmarie.springbootsoapwsclient.controller;

import io.github.yesminmarie.springbootsoapwsclient.client.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import yesminmarie.github.io.springbootsoapws.loaneligibility.Acknowledgement;
import yesminmarie.github.io.springbootsoapws.loaneligibility.CustomerRequest;

@RestController
public class SoapController {

    @Autowired
    private SoapClient client;

    @PostMapping("/getLoanStatus")
    public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request){
        return client.getLoanStatus(request);
    }
}
