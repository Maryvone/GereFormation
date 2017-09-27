
package com.maryvone.gereformation.dao;

import com.maryvone.gereformation.model.ECF;
import com.maryvone.gereformation.model.Formation;

import java.sql.*;
import java.util.ArrayList;

public class ECFDAO {

   //**************** CREATE *******************************

    public static void create(ECF ecf) throws Exception {
        Connection c = DBConnect.getConnection();
        PreparedStatement stm;

        stm = c.prepareStatement("INSERT INTO ECF ( nom,note) VALUES (?,?) ");
        stm.setString(1,ecf.getNom());
        stm.setInt(2,ecf.getNote());

        stm.execute();
        stm.close();


    }

    //**************** READ ********************

    public static ArrayList<ECF> findAll () throws SQLException {
        ArrayList<ECF> ecfs = new ArrayList<>();
        Connection c = DBConnect.getConnection();
        Statement stm;
        String sql = "SELECT * FROM ECF";
        stm = c.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        while (rs.next()) {

            int id = rs.getInt("id");
            String nom= rs.getString("nom");
            int note = rs.getInt("note");
            ArrayList

            ArrayList<ECF> modules = getModules(id);
            Personnel formateur = PersonnelDAO.findById(rs.getInt("idFormateur"));
            int codeFormation = rs.getInt("codeFormation");


            Formation formation = new Formation(libelle,description,lieu,id,nbheures,codeFormation,modules,formateur,dateDebut);
            formations.add(formation);
        }
        return formations;
    }
}
