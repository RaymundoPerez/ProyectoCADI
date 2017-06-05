/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author alonso
 */
public interface IAulaDAO {
    public ArrayList<Aula> obtenerAulasDisponibles(Time hora, Date fecha);
}
