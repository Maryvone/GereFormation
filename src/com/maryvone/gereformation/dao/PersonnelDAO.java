package com.maryvone.gereformation.dao;

import com.maryvone.gereformation.model.Personnel;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PersonnelDAO {

    public static void CreatePersonnel(String nom, String prenom, String utilisateur, String motDePasse,String role, String email){
        Personnel personnel = new Personnel(nom,prenom,utilisateur,motDePasse,role,email);
        Connection c = DBConnect.getConnection();
        PreparedStatement stm;
        stm = c.prepareStatement("INSERT INTO personnel( nom,prenom,utilisateur,motDePasse,role,email) VALUES (?,?,?,?,?,?) ");



    }
}
