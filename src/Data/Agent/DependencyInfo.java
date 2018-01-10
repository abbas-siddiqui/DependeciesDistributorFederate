/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Agent;

/**
 *
 * @author abbas
 */
public class DependencyInfo {

    
    private String federateName;
    private int probability;
    public DependencyInfo() {
        setDefaults();
    }
    public void setDefaults()
    {
    federateName="";
    probability = 100;
    }


    public String getFederateName() {
        return federateName;
    }

    public void setFederateName(String federateName) {
        this.federateName = federateName;
    }
    

    public int getProbablity() {
        return probability;
    }

    public void setProbablity(int probablity) {
        this.probability = probablity;
    }
    
    

}

