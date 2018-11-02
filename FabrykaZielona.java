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
public class FabrykaZielona implements Fabryka{
    private Integer punkty;

    @Override
    public Czekolada createCzekolada() {
        return new ZOrzechami();
    }

    @Override
    public Batonik createBatonik() {
        return new Wafelek();
    }

    @Override
    public Integer getPunkty() {
        return punkty;
    }

    @Override
    public void setPunkty(Integer punkty) {
        this.punkty = punkty;
    }
    
}
