/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.models;
import java.sql.*;

/**
 *
 * @author rafallis
 */
public class ClienteData {
    
    private Statement st;
    private ResultSet rs;
    
    public boolean validaUsuario(ClienteService cService) {
        //vazer pesquisa no banco
        try {
            
            DBConnect.getConnection();
            String query = "SELECT * FROM Cliente";
            rs = st.executeQuery(query);
            

            System.out.println("Procurando usuário.....");
            while(rs.next()) {
                if(Integer.parseInt(rs.getString("Matrícula")) == cService.getMatricula()) {
                    if(rs.getString("Senha") == cService.getSenha()){
                        return true;
                    }
                }
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
