/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softplan.aplication.as;

import br.com.softplan.aplication.entidades.Pessoa;
import br.com.softplan.aplication.repostory.PessoaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author moquiuti
 */
@Service
public class PessoaAS {

    private PessoaRepository repository;

    public PessoaAS(PessoaRepository repository) {
        this.repository = repository;
    }

    public Pessoa create(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public Pessoa update(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pessoa delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pessoa findId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
