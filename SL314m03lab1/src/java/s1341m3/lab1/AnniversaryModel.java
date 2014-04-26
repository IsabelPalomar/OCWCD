/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s1341m3.lab1;

/**
 *
 * @author isabelpalomar
 */
public class AnniversaryModel {
    
    private Integer theYear;
    
    static private class AnniversaryRecord{
    
        int year;
        String material;

        public AnniversaryRecord(int year, String material) {
            this.year = year;
            this.material = material;
        }
        
        
    }
    
    
    static private AnniversaryRecord[] anniversaryData = {
       new AnniversaryRecord(1, "Paper"),
       new AnniversaryRecord(2, "Cotton"),
       new AnniversaryRecord(3, "Leather"),
       new AnniversaryRecord(4, "Wood"),
       new AnniversaryRecord(5, "Ivory"),
       new AnniversaryRecord(6, "Pearl"),
      
       
    };
    
    
    public String getMaterial(){
        String rv = "a lie";
        
        for(AnniversaryRecord anniversaryRecord : anniversaryData){
            
            if(anniversaryRecord.year == theYear){
                rv = anniversaryRecord.material;
                break;
            }else if(anniversaryRecord.year > theYear){
                break;
            }
            
        }
        
        return rv;
        
    }

    public Integer getTheYear() {
        return theYear;
    }

    public void setTheYear(Integer theYear) {
        this.theYear = theYear;
    }

}
