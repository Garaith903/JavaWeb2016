package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class ProductEntity {
	
	@Id
	@Column(name="idproduct")
	private String idproduct;
	
	@Column(name="name")
	private String name;
	
	@Column(name="microcontroller")
	private String microcontroller;
	
	@Column(name="operatingvoltage")
	private double operatingvoltage;
	
	@Column(name="inputvoltagerec")
	private double inputvoltagerec;
	
	@Column(name="inputvoltagemax")
	private double inputvoltagemax;
	
	@Column(name="nbdigitaliopin")
	private Integer nbdigitaliopin;
	
	@Column(name="nbanaloginputpin")
	private Integer nbanaloginputpin;
	
	@Column(name="nbpwmdigitaliopin")
	private Integer nbpwmdigitaliopin;
	
	@Column(name="dccurrentperiopin")
	private Integer dccurrentperiopin;
	
	@Column(name="flashmemory")
	private double flashmemory;
	
	@Column(name="sram")
	private double sram;
	
	@Column(name="clockspeed")
	private Integer clockspeed;
	
	@Column(name="ethernet")
	private String ethernet;
	
	@Column(name="wifi")
	private  String wifi;
	
	@Column(name="usboutput")
	private String usboutput;
	
	@Column(name="lenght")
	private double lenght;
	
	@Column(name="width")
	private double width;
	
	@Column(name="weight")
	private double weight;
	
	@Column(name="priceu")
	private double priceu;
	
	@Column(name="idcateg")
	private String idcateg;
	
	//CONSTRUCTORS
	public ProductEntity(){}
	
	//SETTORS
	public void setIdproduct(String idp)
	{	
		idproduct = idp;
	}
	
	public void setName(String n) 
	{	
		name = n;
	}
	
	public void setMicrocontroller (String mic)
	{
		microcontroller = mic;
	}
	
	public void setOperatingvoltage (double opV)
	{
		operatingvoltage = opV;
	}
	
	public void setInputvoltagerec (double inputV)
	{
		inputvoltagerec = inputV;
	}
	
	public void setInputvoltagemax(double inputVM)
	{ 
		inputvoltagemax = inputVM;
	}
	
	public void setNbdigitaliopin(Integer nbDigitaIlO)
	{
		nbdigitaliopin = nbDigitaIlO;
	}
	
	public void setNbanaloginputpin(Integer nbAnalogIn)
	{
		nbanaloginputpin = nbAnalogIn;
	}
	
	public void setNbpwmdigitaliopin(Integer nbpwmd)
	{
		nbpwmdigitaliopin = nbpwmd;
	}
	
	public void setDccurrentperiopin(Integer dcc)
	{
		dccurrentperiopin = dcc;
	}
	
	public void setFlashmemory(double flash)
	{
		flashmemory = flash;
	}
	
	public void setSram(double sramIn)
	{
		sram = sramIn;
	}
	
	public void setClockspeed(Integer clockSp)
	{
		clockspeed = clockSp;
	}
	
	public void setEthernet(String ethernetIn)
	{
		ethernet = ethernetIn;
	}
	
	public void setWifi(String wifiIn)
	{
		wifi = wifiIn;
	}
	
	public void setUsboutput(String usbO) 
	{
		usboutput = usbO;
	}
	
	public void setLenght(double lngt)
	{
		lenght = lngt;
	}
	
	public void setWidth(double wi)
	{
		width = wi;
	}
	
	public void setWeight(double we)
	{
		weight = we;
	}
	
	public void setPriceu(double price)
	{
		priceu = price;
	}
	
	public void setIdcateg(String idCat)
	{
		idcateg = idCat;
	}
	
	//GETTORS
	public String getIdproduct()
	{	
		return idproduct;
	}
	
	public String getName() 
	{	
		return name;
	}
	
	public String getMicrocontroller()
	{
		return microcontroller;
	}
	
	public double getOperatingvoltage()
	{
		return operatingvoltage;
	}
	
	public double getInputvoltagerec()
	{
		return inputvoltagerec;
	}
	
	public double getInputvoltagemax()
	{ 
		return inputvoltagemax;
	}
	
	public Integer getNbdigitaliopin()
	{
		return nbdigitaliopin;
	}
	
	public Integer getNbanaloginputpin()
	{
		return nbanaloginputpin;
	}
	
	public Integer getNbpwmdigitaliopin()
	{
		return nbpwmdigitaliopin;
	}
	
	public Integer getDccurrentperiopin()
	{
		return dccurrentperiopin;
	}
	
	public double getFlashmemory()
	{
		return flashmemory;
	}
	
	public double getSram()
	{
		return sram;
	}
	
	public Integer getClockspeed()
	{
		return clockspeed;
	}
	
	public String getEthernet()
	{
		return ethernet;
	}
	
	public String getWifi()
	{
		return wifi;
	}
	
	public String getUsboutput() 
	{
		return usboutput;
	}
	
	public double getLenght()
	{
		return lenght;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public double getPriceu()
	{
		return priceu;
	}
	
	public String getIdcateg()
	{
		return idcateg;
	}
}
