package oopilk.inheritance;

public class Computer extends Parent{
	   private String ram;
	   private String cpu;	
	      public String getRam() {
	    	  return ram;
	      }
	      public void setRam(String ram) {
	    	  this.ram=ram;
	      }
	      public String getCpu() {
	    	  return cpu;
	      }
	      public void setCpu(String cpu) {
	    	  this.cpu=cpu;
	      }
		public Computer(String name, int price, String ram, String cpu) {
			super(name, price);
			this.ram = ram;
			this.cpu = cpu;
			
		}
	    
	
}
