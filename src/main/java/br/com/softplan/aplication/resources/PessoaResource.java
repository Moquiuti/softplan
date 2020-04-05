/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softplan.aplication.resources;

import br.com.softplan.aplication.as.PessoaAS;
import br.com.softplan.aplication.entidades.Pessoa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author moquiuti
 */
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/"})
public class PessoaResource {

    @Autowired
    private PessoaAS pessoaService;
    
    @RequestMapping(value = "/pessoa", method = RequestMethod.POST)
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return pessoaService.create(pessoa);
    }

    @GetMapping(path = {"/pessoa/{id}"}, produces = "application/json")
    public Pessoa findOne(@PathVariable("id") int id){
        return pessoaService.findId(id);
    }

    @PutMapping
    public Pessoa update(@RequestBody Pessoa pessoa){
        return pessoaService.update(pessoa);
    }

    @DeleteMapping(path ={"/{id}"})
    public Pessoa delete(@PathVariable("id") int id) {
        return pessoaService.delete(id);
    }

    @GetMapping
    public List findAll(){
        return pessoaService.findAll();
    }
}
