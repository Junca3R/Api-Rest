package com.odjr.service.impl;

import com.odjr.model.dao.ClienteDao;
import com.odjr.model.entity.Cliente;
import com.odjr.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteImpl implements ICliente {
    // se envia esta informacion hacia el dao

    @Autowired // se indica para la injeccion de dependencia
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Transactional(readOnly = true)// para que diga que es solo una consulta
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);

    }
}
