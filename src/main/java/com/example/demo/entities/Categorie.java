
package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.Collection;
@Entity
public class Categorie implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String nomCategorie;
    @OneToMany(mappedBy="categorie",fetch=FetchType.LAZY)
    private Collection<Produit> produits;

    public Categorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public Categorie() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
    
    
    
}
