/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.controllers;

import com.ps.models.ClienteService;
import com.ps.views.InterfacePesquisa;
import javax.swing.JOptionPane;

/**
 *
 * @author rafallis
 */
public class ClienteController {
    
    public void fazerLogin(int matricula, String senha) {
        //verificação de integridade
        ClienteService service = new ClienteService(matricula, senha);
        
        Boolean state = service.validaCliente();
        System.out.println(state);
        if(state != null && state) {
            //chamar tela principal
            
            JOptionPane.showMessageDialog(null, "LOGIN REALIZADO COM SUCESSO!");
            
            //InterfacePesquisa newInterface = new InterfacePesquisa();
        }
        
    }
}
