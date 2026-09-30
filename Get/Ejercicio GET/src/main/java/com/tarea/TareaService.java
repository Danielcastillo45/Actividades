package com.tarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    @Autowired
    private TareaRepository repo;

    public List<Tarea> obtenerTodas(){
        return repo.findAll();
    }

    public Tarea guardarTarea(Tarea tarea){
        return repo.save(tarea);
    }
}
