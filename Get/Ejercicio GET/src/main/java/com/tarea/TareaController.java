package com.tarea;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> obtenerTodas(){
        return tareaService.obtenerTodas();
    }

    @PostMapping
    public Tarea guardarTarea(@RequestBody Tarea tarea){
        return tareaService.guardarTarea(tarea);
    }
}
