package com.autobuses.buscame;


import com.autobuses.wsdl.QuitarCarroRequest;
import com.autobuses.wsdl.QuitarCarroResponse;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;



public class ClienteEndPoint extends WebServiceGatewaySupport
{
    public QuitarCarroResponse eliminarCarro(Integer id)
    {
        QuitarCarroRequest eliminarRequest = new QuitarCarroRequest();
        eliminarRequest.setId(id);

        QuitarCarroResponse eliminarResponse = (QuitarCarroResponse) getWebServiceTemplate().marshalSendAndReceive(
            "https://buscame2.herokuapp.com/autobuses/buscame.wsdl",
            eliminarRequest,
            new SoapActionCallback("https://buscame2.herokuapp.com")
        );

        return eliminarResponse;
    }
}
