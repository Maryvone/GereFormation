package com.maryvone.gereformation.dao;

import com.maryvone.gereformation.model.Formation;

import java.sql.*;

public class FormationDAO {

    //******************** CREATE ***************************

    public static void create(Formation formation) throws Exception {
        Connection c = DBConnect.getConnection();
        PreparedStatement stm;

        stm = c.prepareStatement("INSERT INTO formation( libelle,description, nbHeures,lieu,dateDebut, codeFormation) VALUES (?,?,?,?,?,?) ");
        stm.setString(1,formation.getLibelle());
        stm.setString(2,formation.getDescription());
        stm.setInt(3,formation.getNbheures());
        stm.setString(4,formation.getLieu());
        stm.setDate(5,formation.getDateDebut());
        stm.setInt(6,formation.getCodeFormation());
        stm.execute();
        stm.close();


    }

    // ***************** READ

    public static Formation findonebyID (int id) throws SQLException {
        Formation formation = null;
        Connection c = DBConnect.getConnection();
        Statement stm;
        try {
            stm = c.createStatement();

            String sql = "select * from formation WHERE id=" + id;
            ResultSet rs = stm.executeQuery(sql);

            if (rs.next()) {
                String nom= rs.getString("nom");
                String description = rs.getString("description");

               formation = new Formation(id, nom , description);


            }
            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException();
        }

        return sequence;
    }
}
