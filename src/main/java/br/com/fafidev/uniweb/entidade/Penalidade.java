/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafidev.uniweb.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dell
 */
@Entity
public class Penalidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double valorPorDia;
    private Integer suspensaoPorDia;
    private String nome;
    private String descricao;

    public Penalidade() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValorPorDia() {
        return valorPorDia;
    }

    public void setValorPorDia(Double valorPorDia) {
        this.valorPorDia = valorPorDia;
    }

    public Integer getSuspensaoPorDia() {
        return suspensaoPorDia;
    }

    public void setSuspensaoPorDia(Integer suspensaoPorDia) {
        this.suspensaoPorDia = suspensaoPorDia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Penalidade)) {
            return false;
        }
        Penalidade other = (Penalidade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fafidev.uniweb.entidade.Penalidade[ id=" + id + " ]";
    }
    
}
