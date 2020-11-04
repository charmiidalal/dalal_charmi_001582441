/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public abstract class UserAccount {

    private int id;
    private String username;
    private String password;
    private Role role;
    private WorkQueue workQueue;
    private static int counter = 0;
    
    public UserAccount(String username, String password, Role role) {
        this.id = counter;
        counter++;
        this.username = username;
        this.password = password;
        this.role = role;
        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public WorkQueue getWorkQueue() {
        return this.workQueue;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return username;
    }
}
