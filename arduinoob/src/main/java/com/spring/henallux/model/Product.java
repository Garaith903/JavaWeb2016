package com.spring.henallux.model;

public class Product {

	private String idproduct;
	private String name;
	private String microcontroller;
	private double operatingvoltage;
	private double inputvoltagerec;
	private double inputvoltagemax;
	private int nbdigitaliopin;
	private int nbanaloginputpin;
	private int nbpwmdigitaliopin;
	private int dccurrentperiopin;
	private double flashmemory;
	private double sram;
	private int clockspeed;
	private String ethernet;
	private String wifi;
	private String usboutput;
	private double lenght;
	private double width;
	private double weight;
	private double priceu;
	private String idcateg;
	
	//CONSTRUCTORS
	public Product(){}
	
	public Product(String id, String na, String micro, double operVolt, double inputVoltRec, double inputVoltMax, int nbDigitalPin, int nbaAnalogPin, int nbPwmDigitalPin, int dcCurrent, double flash, double sramIn, int clockSp, String eth, String wifiIn, String Usb, double lngt, double widthIn, double weightIn, double price, String idCat)
	{
		idproduct = id;
		name = na;
		microcontroller = micro;
		operatingvoltage = operVolt;
		inputvoltagerec = inputVoltRec;
		inputvoltagemax = inputVoltMax;
		nbdigitaliopin = nbDigitalPin;
		nbanaloginputpin = nbaAnalogPin;
		nbpwmdigitaliopin = nbPwmDigitalPin;
		dccurrentperiopin = dcCurrent;
		flashmemory = flash;
		sram = sramIn;
		clockspeed = clockSp;
		ethernet = eth;
		wifi = wifiIn;
		usboutput = Usb;
		lenght = lngt;
		width = widthIn;
		weight = weightIn;
		priceu = price;
		idcateg = idCat;
	}
	
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
	
	public void setNbdigitaliopin(int nbDigitaIlO)
	{
		nbdigitaliopin = nbDigitaIlO;
	}
	
	public void setNbanaloginputpin(int nbAnalogIn)
	{
		nbanaloginputpin = nbAnalogIn;
	}
	
	public void setNbpwmdigitaliopin(int nbpwmd)
	{
		nbpwmdigitaliopin = nbpwmd;
	}
	
	public void setDccurrentperiopin(int dcc)
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
	
	public void setClockspeed(int clockSp)
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
	
	public int getNbdigitaliopin()
	{
		return nbdigitaliopin;
	}
	
	public int getNbanaloginputpin()
	{
		return nbanaloginputpin;
	}
	
	public int getNbpwmdigitaliopin()
	{
		return nbpwmdigitaliopin;
	}
	
	public int getDccurrentperiopin()
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
	
	public int getClockspeed()
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

