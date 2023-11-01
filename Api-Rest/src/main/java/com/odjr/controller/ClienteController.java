package com.odjr.controller;

import com.odjr.model.entity.Cliente;
import com.odjr.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {
    @Autowired
    private ICliente clienteservice;

    @PostMapping("cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente  create (@RequestBody Cliente cliente ){
            return  clienteservice.save(cliente);
    }

    @PutMapping("cliente")
    @ResponseStatus(HttpStatus.CREATED)

    public Cliente  update(@RequestBody Cliente cliente) {
        return clienteservice.save(cliente);
    }

    @DeleteMapping("cliente/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)

    public void delete(@PathVariable Integer id) {

            Cliente clientedelete = clienteservice.findById(id);
            clienteservice.delete(clientedelete);

    }

    @GetMapping("cliente/{id}")
    @ResponseStatus(HttpStatus.OK)

    public  Cliente showById(@PathVariable Integer id){
        return clienteservice.findById(id);

    }
}
