/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maryvone.gereformation.gui.SearchForm;

import com.maryvone.gereformation.model.Stagiaire;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author david
 */
public class StagiaireTableModel extends AbstractTableModel {
    
    private final String[] entetes= {"matricule","prénom","nom"};
    private ArrayList<Stagiaire>stagiaires;

    public StagiaireTableModel() throws SQLException{
       
   }
    @Override
    public String getColumnName(int column){
        return entetes[column];
    }
    
    @Override
    public int getRowCount() {
        return stagiaires.size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }
    
    public Stagiaire getStagiaire(int rowIndex){
        return stagiaires.get(rowIndex);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
           
           case 0:
               return stagiaires.get(rowIndex).getId();
               
           case 1:
               return stagiaires.get(rowIndex).getPrenom();
           
           case 2:
               return stagiaires.get(rowIndex).getNom();
               
               
           default:
               throw new IllegalArgumentException();
       }
    }
    
    public ArrayList<Stagiaire> setModel(ArrayList<Stagiaire> stagiaires){
        this.stagiaires=stagiaires;
        
        return stagiaires;
    }
    
    public void deleteStagiaire(Stagiaire stagiaire){
        this.stagiaires.remove(stagiaire);
        fireTableDataChanged();
    }
    public void AddStagiaire(Stagiaire stagiaire){
        this.stagiaires.add(stagiaire);
        fireTableDataChanged();
    }
}
