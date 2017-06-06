package com.nicolas.eBoutique.entities;

import java.io.Serializable;

public class Produit implements Serializable{
	
	private Long idProduit;
	private String designation;
	private String description;
	private double price;
	private boolean selected;
	private String photo;
	private int quantite;
	private Categorie categorie;
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String designation, String description, double price, boolean selected, String photo, int quantite) {
		super();
		this.designation = designation;
		this.description = description;
		this.price = price;
		this.selected = selected;
		this.photo = photo;
		this.quantite = quantite;
	}
	
	
}
