/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.cargo;

import interfaces.Cargo;

/**
 *
 * @author alunoces
 */
public class CargoAdministrativo implements Cargo {

    @Override
    public void exibirInfo() {
        System.out.println("Cargo: Administrador de Sistemas");
    }
    
}
