/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author alonso
 */
public interface ISeccionDAO {
    public ArrayList<Seccion> obtenerSeccionPorModulo(String idModulo);
}
