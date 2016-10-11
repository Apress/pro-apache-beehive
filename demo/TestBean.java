package demo;

import org.apache.beehive.netui.pageflow.FormData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping; 
import java.util.Map;


public class TestBean extends FormData{
    
        private String name=null;
        private String type=null;
	    private String[] studentsMap ={"John","Peter","Taylor","Robert"};
	    private String [] selectedStudents;
        

    public TestBean()
    {
      
      
       
    }

    public String getName() {
        return this.name;
    }

    public void setName(String id) {
        this.name = id;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String id) {
        this.type = id;
    }  
    
    public void setStudentsMap(String[] aMap)
    {
    	studentsMap = aMap;
    }
    public String[] getStudentsMap()
    {
    	return studentsMap ;
    }
    public void setSelectedStudents(String[] students)
    {
    	this.selectedStudents = students;
    }
    public String[] getSelectedStudents()
    {
    	return this.selectedStudents ;
    }
}