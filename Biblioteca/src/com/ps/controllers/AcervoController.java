package com.ps.controllers;
import com.ps.controllers.ImpressoController;
import com.ps.models.services.AcervoService;
import com.ps.models.services.ImpressoService;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafallis
 */
public class AcervoController {
    
     public void adicionaAoAcervo(int id, String titulo, String editora, Date dataPublicacao, String autores, String tipo){
        ImpressoService impresso = new ImpressoService(id, titulo, editora, dataPublicacao, autores, tipo);
    }
    
}
