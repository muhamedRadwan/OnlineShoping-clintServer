/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.shopping;

/**
 *
 * @author Mohamed-A.Radwan
 */
public interface Inotify {
    public boolean AddtoRecevers(int personID);
    public boolean deleteFromRecevers(int personID);
    public boolean notifyObservers(Offer offerID,Feedback feedbackID);
}
