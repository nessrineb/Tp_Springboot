package com.Tp.Back_Tp_prog6.model;

import javax.persistence.*;

@Entity
public class Produit {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private int Quantité;
    private float prixAchat;
    private float prixVente;
    @ManyToOne
    @JoinColumn(name="mag_id")
    private Magasin magasin;

    public Produit() {
    }

    public Produit(int id, String description, int quantité, float prixAchat, float prixVente, Magasin magasin) {
        this.id = id;
        this.description = description;
        Quantité = quantité;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.magasin = magasin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantité() {
        return Quantité;
    }

    public void setQuantité(int quantité) {
        Quantité = quantité;
    }

    public float getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(float prixAchat) {
        this.prixAchat = prixAchat;
    }

    public float getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(float prixVente) {
        this.prixVente = prixVente;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }
}
