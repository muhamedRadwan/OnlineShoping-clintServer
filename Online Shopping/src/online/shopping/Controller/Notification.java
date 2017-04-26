/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping.Controller;

/**
 *
 * @author Mohamed-A.Radwan
 */
public class Notification implements Inotify{

    private boolean flage;

    public void setFlage(boolean flage) {
        this.flage = flage;
    }

    public boolean isFlage() {
        return flage;
    }
    
    
    @Override
    public boolean AddtoRecevers(int personID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteFromRecevers(int personID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean notifyObservers(Offer offer,Feedback feedback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
