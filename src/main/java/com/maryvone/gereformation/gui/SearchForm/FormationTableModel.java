/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maryvone.gereformation.gui.SearchForm;

import com.maryvone.gereformation.model.Formation;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import com.maryvone.gereformation.dao.FormationDAO;

/**
 *
 * @author david
 */
public class FormationTableModel extends AbstractTableModel {
    private final String[] entetes= {"libelle","date début","formateur","code formation"};
    private ArrayList<Formation>formations;
  
    
    public FormationTableModel(){
       
       formations=FormationDAO.findAll();
   }
    
    @Override
    public String getColumnName(int column){
        return entetes[column];
    }
    
    
    @Override
    public int getRowCount() {
        return formations.size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
        
    }
    
    public Formation getFormation(int rowIndex){
        return formations.get(rowIndex);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           
           case 0:
               return formations.get(rowIndex).getLibelle();
               
           case 1:
               return formations.get(rowIndex).getDateDebut();
           
           case 2:
               return formations.get(rowIndex).getFormateur().getPrenom() +" " + formations.get(rowIndex).getFormateur().getNom();
               
           case 3:
               return formations.get(rowIndex).getCodeFormation();
               
           default:
               throw new IllegalArgumentException();
       }
    }
    
}
