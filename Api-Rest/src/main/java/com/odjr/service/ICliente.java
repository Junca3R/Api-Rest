package com.odjr.service;

import com.odjr.model.entity.Cliente;

public interface ICliente {
    Cliente save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);
}
