
package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;

import java.io.Serializable;

@Entity
public class Produit implements Serializable{
    @Id @GeneratedValue
    private Long id;
    @Size(min=4,max=70)
    @Column(length = 70)
    @NotNull
    private String designation;
    @NonNull
    private double prix;
    @NotNull
    private int quantite;
    @ManyToOne
    @JoinColumn(name="ID_CAT")
    private Categorie categorie;
    

    public Produit() {
    }

    public Produit(@NonNull String designation,@NonNull double prix,@NonNull int quantite) {
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }  

    public Produit(String designation, double prix, int quantite, Categorie categorie) {
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
}