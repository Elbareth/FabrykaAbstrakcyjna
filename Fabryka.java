/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrykaabstrakcyjna;

/**
 *
 * @author lenovo
 */
public interface Fabryka {
    public abstract Czekolada createCzekolada();
    public abstract Batonik createBatonik();
    public abstract Integer getPunkty();
    public abstract void setPunkty(Integer punkty);
}
