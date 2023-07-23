package oopilk.inheritance;

public class Phone extends Parent{
      private String color;
      private String system;	
      public String getColor() {
    	  return color;
      }
      public void setColor(String color) {
    	  this.color=color;
      }
      public String getSystem() {
    	  return system;
      }
      public void setSystem(String system) {
    	  this.system=system;
      }
      
	public Phone(String name, int price, String color, String system) {
		super(name, price);
		this.color = color;
		this.system = system;
	
	}
	
	
    
}
