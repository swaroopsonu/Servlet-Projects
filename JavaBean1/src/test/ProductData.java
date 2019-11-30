package test;
import java.io.*;
public class ProductData implements Serializable{
	private String pcode,pname;
	private int qty;
	public ProductData() {}
	public String getCode() {
		return pcode;
	}
	public void setCode(String pcode)
	{
		this.pcode=pcode;
		
	}
	public String getName() {
		return pname;
	}
	public void setName(String pname) {
		this.pname=pname;
	}
	public int getQty() {
		return qty;
		
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
}
