//Aluna: Gabriela Sena da Silva     2ºTI

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cadastrocelebridades;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gabriela
 */
public class CelebridadeTableModel extends AbstractTableModel{
    private ArrayList<Celebridade> celebridades = new ArrayList<Celebridade>();
    String[] nomesColunas = {"Nome", "Conta", "Idade", "Área de Atuação", "Seguidores", "Rede Social"};

    @Override
    public int getRowCount() { //ver quantas linhas tem
       return celebridades.size();
    }
    
    @Override
     public String getColumnName(int column) { //definir os nomes das colunas
        return nomesColunas[column];
    }

    @Override
    public int getColumnCount() { //ver quantas colunas tem
        return nomesColunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return celebridades.get(linha).getNome();
            case 1:
                return celebridades.get(linha).getConta();
            case 2:
                return celebridades.get(linha).getIdade();
            case 3:
                return celebridades.get(linha).getAreaDeAtuacao();               
            case 4:
                return celebridades.get(linha).getNumSeguidores();
            case 5:
               return celebridades.get(linha).getRedeSocial();
            default:
                return null;   
        }
    }
    
    public void adicionarCelebridade(Celebridade celebridade){
        celebridades.add(celebridade);
        
        this.fireTableRowsInserted(celebridades.size()-1, celebridades.size()-1); //menos 1 pois é a ultima linha da tabela
    }
    
    public void removerCelebridade(int linha){
        celebridades.remove(linha);
        
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public void alterarCelebridade(Celebridade celebridade, int linha){
        celebridades.set(linha, celebridade);
        
        this.fireTableRowsUpdated(linha, linha);
    }  
    
    public void limparTabela(){
        celebridades.clear();
        
        this.fireTableDataChanged();
    }

    Celebridade getCelebridade(int linha) {
        return celebridades.get(linha);
    }

}
