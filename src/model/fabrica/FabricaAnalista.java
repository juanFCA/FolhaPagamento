/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fabrica;

import interfaces.Cargo;
import interfaces.FabricaCargos;
import model.cargo.CargoAnalista;

/**
 *
 * @author douglas, jonas, juan e lucas
 */
public class FabricaAnalista implements FabricaCargos {

    @Override
    public Cargo criarCargo() {
        return new CargoAnalista();
    }

}
