/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafidev.uniweb.entidade;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Dell
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Aluno extends PessoaFisica {
    
    private String registroacademico;

    public Aluno() {
    }

    public String getRegistroacademico() {
        return registroacademico;
    }

    public void setRegistroacademico(String registroacademico) {
        this.registroacademico = registroacademico;
    }
    
    
}
