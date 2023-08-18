package Test;
import java.io.*;

@SuppressWarnings("serial")
public class Productbean implements Serializable{
	private String pcode,name;
	private float price;
	private int qty;
    public Productbean(){}	
    public String getPcode(){
    	return pcode;
    }
    
	
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	


	public int getQty() {
		return qty;
	}
	public void setQty(int i) {
		this.qty = qty;
	}



	{
}



	
	

}
