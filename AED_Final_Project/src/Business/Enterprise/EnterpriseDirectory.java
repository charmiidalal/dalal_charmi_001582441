/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Dinesh
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (null != type) {
            switch (type) {
                case ServiceProvider:
                    enterprise = new ServiceProviderEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case Property:
                    enterprise = new PropertyEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case Broker:
                    enterprise = new BrokerEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case QualityAssurance:
                    enterprise = new QualityAssuranceEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                default:
                    break;
            }
        }
        return enterprise;
    }
}
