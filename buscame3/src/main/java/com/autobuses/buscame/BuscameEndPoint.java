package com.autobuses.buscame;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.buscame_autobuses_com.buscame.CrearRequest;
import https.buscame_autobuses_com.buscame.CrearResponse;
import https.buscame_autobuses_com.buscame.ListarCarrosResponse;
import https.buscame_autobuses_com.buscame.QuitarCarroRequest;
import https.buscame_autobuses_com.buscame.QuitarCarroResponse;
@Endpoint
public class BuscameEndPoint
{
    @Autowired
    private ClienteEndPoint cliente;
    ArrayList<ListarCarrosResponse.Carro> listaCarros = new ArrayList<ListarCarrosResponse.Carro>();

    @PayloadRoot(localPart = "CrearRequest", namespace = "https://buscame.autobuses.com/buscame")
    @ResponsePayload
    
    public CrearResponse Crearautobus(@RequestPayload CrearRequest request)
    {
        

        com.autobuses.wsdl.QuitarCarroResponse respuesta = cliente.eliminarCarro(request.getId());

        CrearResponse response = new CrearResponse();
        if(respuesta.isResponse())
        {
            ListarCarrosResponse.Carro carro = new ListarCarrosResponse.Carro();
            carro.setId(request.getId());
            carro.setConductor(request.getConductor());
            carro.setEmpresa(request.getEmpresa());
            carro.setRuta(request.getRuta());
            carro.setPlaca(request.getPlaca());
            listaCarros.add(carro);

            response.setResponse(true);
            return response;
        }
        else
        {
            response.setResponse(false);
            return response;
        }
        
    }

    @PayloadRoot(localPart = "ListarCarrosRequest", namespace = "https://buscame.autobuses.com/buscame")
    @ResponsePayload
    public ListarCarrosResponse getAutobuses()
    {
        ListarCarrosResponse response = new ListarCarrosResponse();
        for (ListarCarrosResponse.Carro carro : listaCarros) 
        {
            response.getCarro().add(carro);
        }
        return response;
    }

    @PayloadRoot(localPart = "QuitarCarroRequest", namespace = "https://buscame.autobuses.com/buscame")
    @ResponsePayload
    public QuitarCarroResponse deleteAutobus(@RequestPayload QuitarCarroRequest request)
    {
        QuitarCarroResponse response = new QuitarCarroResponse();
        ArrayList<ListarCarrosResponse.Carro> listaCarros2 = new ArrayList<ListarCarrosResponse.Carro>();
        for(ListarCarrosResponse.Carro carro : listaCarros)
        {
            if(carro.getId() != request.getId())
            {
                listaCarros2.add(carro);
            }
        }
        listaCarros = listaCarros2;
        response.setResponse(true);
        return response;
    }
}