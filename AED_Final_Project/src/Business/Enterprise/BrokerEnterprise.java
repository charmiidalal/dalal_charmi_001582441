/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;
import Business.Role.AgentRole;

/**
 *
 * @author Dinesh
 */
public class BrokerEnterprise extends Enterprise {

    public BrokerEnterprise(String name) {
        super(name, EnterpriseType.Broker);
    }

    @Override

    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new AgentRole());
        return roles;
    }

}
