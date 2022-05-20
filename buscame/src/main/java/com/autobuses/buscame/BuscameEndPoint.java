package com.autobuses.buscame;

import java.util.ArrayList;

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
    ArrayList<ListarCarrosResponse.Carro> listaCarros = new ArrayList<ListarCarrosResponse.Carro>();

    @PayloadRoot(localPart = "CrearRequest", namespace = "https://buscame.autobuses.com/buscame")
    @ResponsePayload
    public CrearResponse Crearautobus(@RequestPayload CrearRequest request)
    {
        CrearResponse response = new CrearResponse();
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
        for(ListarCarrosResponse.Carro carro : listaCarros)
        {
            if(carro.getId() == request.getId())
            {
                listaCarros.remove(carro);
            }
        }
        response.setResponse(true);
        return response;
    }
}