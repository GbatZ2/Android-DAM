/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondelibros;

import java.util.Comparator;

/**
 *
 * @author usumaniana1
 */
public class ordenarPorTitulo implements Comparator<Libro> {

    @Override
    public int compare(Libro l1, Libro l2) 
    {
        return l1.getTitulo().compareToIgnoreCase(l2.getTitulo());
    }
    
}
