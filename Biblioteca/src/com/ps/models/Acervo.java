package com.ps.models;

import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Acervo {

	private LinkedList<Impresso> impressos;

	private Impresso impresso;

	public void addImpresso(int id, String titulo, Editora editora, Date datapublicacao, LinkedList<Autor> autores, int tipo) {
            switch(tipo){
                case 1: //se for livro
                    impresso = new Livro(id, titulo, editora, datapublicacao, autores);
                    break;
                    
                case 2: //se for periódico
                    impresso = new Periodico(id, titulo, editora, datapublicacao, autores);
                    break;
                    
                case 3: //se for revista
                    impresso = new Revista(id, titulo, editora, datapublicacao, autores);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de impresso inválido!", "Erro de inserção", JOptionPane.ERROR_MESSAGE);
            }
            impressos.add(impresso);
	}
        
        public void removeImpresso(int id) {
            // buscar no banco
            // retirar impresso
        }
}
