/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.go.rd.tcl.ejb;
import java.util.HashMap;
/**
 *
 * @author siamwhale
 */
public class LtoIndex {
    private HashMap<String,String> ltoinx; 
            
    public LtoIndex() {
        ltoinx = new HashMap<>();
        ltoinx.put("","");
    }
    
    public boolean isLTO(String nid) {
        if (ltoinx.containsKey(nid)) return true;
        else return false;
    }
}
