package com.api.treinamento.actuator;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "customEndPoint")
public class CustomEndPoint {
    private Map<String, String> atividades = new HashMap<>();

    public CustomEndPoint(){
        this.atividades.put("atividade", "Teste 1");
    }

    @ReadOperation
    public Map<String, String> atividades() {
        return atividades;
    }

    @ReadOperation
    public String atividade(@Selector String nome) {
        return atividades.get(nome);
    }

    @WriteOperation
    public void configuraAtividade(@Selector String nome, @Selector String atividade) {
        atividades.put(nome, atividade);
    }

    @DeleteOperation
    public void deleteAtividade(@Selector String nome) {
        atividades.remove(nome);
    }
}
