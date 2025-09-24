package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UsuarioDao;
import com.example.demo.model.Usuarios;




@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
   @Autowired     
   private UsuarioDao usuarioDao;

   @GetMapping
   public List<Usuarios> listar(){
    return usuarioDao.findAll();
    
   }
      @PostMapping
      public void inserta(@RequestBody Usuarios usuarios){
         usuarioDao.save(usuarios);

      }
      @PutMapping
      public void modificar(@RequestBody Usuarios usuarios){
         usuarioDao.save(usuarios);
      

      }
      @DeleteMapping(value="/{id}")
      public void eliminar(@PathVariable("id") long id){
         usuarioDao.deleteById(id);

      }

}
