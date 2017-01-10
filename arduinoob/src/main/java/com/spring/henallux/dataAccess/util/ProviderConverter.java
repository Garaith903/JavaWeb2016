package com.spring.henallux.dataAccess.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.spring.henallux.dataAccess.entity.TranslationCategoryEntity;
import com.spring.henallux.dataAccess.entity.CartEntity;
import com.spring.henallux.dataAccess.entity.LineProductEntity;
import com.spring.henallux.dataAccess.entity.NationalityEntity;
import com.spring.henallux.dataAccess.entity.PictureEntity;
import com.spring.henallux.dataAccess.entity.ProductEntity;
import com.spring.henallux.dataAccess.entity.PromotionEntity;
import com.spring.henallux.dataAccess.entity.TranslationProductEntity;
import com.spring.henallux.dataAccess.entity.UserInscriptionFormEntity;
import com.spring.henallux.model.TranslationCategory;
import com.spring.henallux.model.Cart;
import com.spring.henallux.model.LineProduct;
import com.spring.henallux.model.Nationality;
import com.spring.henallux.model.Picture;
import com.spring.henallux.model.Product;
import com.spring.henallux.model.Promotion;
import com.spring.henallux.model.TranslationProduct;
import com.spring.henallux.model.UserInscriptionForm;

@Component
public class ProviderConverter {

	public UserInscriptionFormEntity ConvertUserModelToUserEntity (UserInscriptionForm userModel)
	{
		UserInscriptionFormEntity userEntity = new UserInscriptionFormEntity();
		
		userEntity.setPseudo(userModel.getPseudo());
		userEntity.setPassword(userModel.getPassword());
		userEntity.setFirstName(userModel.getFirstName());
		userEntity.setLastName(userModel.getLastName());
		userEntity.setAddress(userModel.getAddress());
		userEntity.setBirthdate(convertStringDateToJavaUtilDate(userModel.getBirthdate()));
		//userEntity.setBirthdate(userModel.getBirthdate());
		userEntity.setSex(userModel.getSex());
		userEntity.setCount(userModel.getCount());
		userEntity.setEmail(userModel.getEmail());
		userEntity.setMobileNumber(userModel.getMobileNumber());
		
		return userEntity;
	}
	
	public UserInscriptionForm ConvertUserEntityToUserModel (UserInscriptionFormEntity userEntity)
	{
		UserInscriptionForm userModel = new UserInscriptionForm();
		
		userModel.setPseudo(userEntity.getPseudo());
		userModel.setPassword(userEntity.getPassword());
		userModel.setPasswordCheck(userEntity.getPassword());
		userModel.setFirstName(userEntity.getFirstName());
		userModel.setLastName(userEntity.getLastName());
		userModel.setAddress(userEntity.getAddress());
		userModel.setBirthdate(converJavaUtilDatetToStringDate(userEntity.getBirthdate()));
		//userModel.setBirthdate(userEntity.getBirthdate());
		userModel.setSex(userEntity.getSex());
		userModel.setCount(userEntity.getCount());
		userModel.setEmail(userEntity.getEmail());
		userModel.setMobileNumber(userEntity.getMobileNumber());
		
		return userModel;
	}
	

	public NationalityEntity ConvertNationalityModelToNationalityEntity (Nationality nationalityModel)
	{
		NationalityEntity nationalityEntity = new NationalityEntity();
		
		nationalityEntity.seIdTranslationNameNationality(nationalityModel.getId());
		nationalityEntity.setTranslationNameNationality(nationalityModel.getTranslation());
		nationalityEntity.setidLang(nationalityModel.getIdlang());
		nationalityEntity.setIdNationalityTr(nationalityModel.getIdnationality());
		
		return nationalityEntity;
	}
	
	public Nationality ConvertNationalityEntityToNationalityModel (NationalityEntity nationalityEntity)
	{
		Nationality nationalityModel = new Nationality();
		
		nationalityModel.setId(nationalityEntity.getidTranslationNameNationality());
		nationalityModel.setTranslation(nationalityEntity.getTranslationNameNationality());
		nationalityModel.setIdlang(nationalityEntity.getidLang());
		nationalityModel.setIdnationality(nationalityEntity.getIdNationalityTr());
		
		return nationalityModel;
	}
	
	public TranslationCategoryEntity ConvertCategoryModelToCategoryEntity (TranslationCategory categoryModel)
	{
		TranslationCategoryEntity categoryEntity = new TranslationCategoryEntity();
		
		categoryEntity.setId(categoryModel.getIdTranslationCategory());
		categoryEntity.setTranslation(categoryModel.getTranslationName());
		categoryEntity.setIdLang(categoryModel.getIdLang());
		categoryEntity.setIdCateg(categoryModel.getIdCategory());
		
		return categoryEntity;
	}
	
	public TranslationCategory ConvertCategoryEntityToCategoryModel (TranslationCategoryEntity categoryEntity)
	{
		TranslationCategory categoryModel = new TranslationCategory();
		
		categoryModel.setIdTranslationCategory(categoryEntity.getId());
		categoryModel.setTranslationName(categoryEntity.getTranslation());
		categoryModel.setIdLang(categoryEntity.getIdLang());
		categoryModel.setIdCategory(categoryEntity.getIdCateg());
		
		return categoryModel;
	}
	
	public ProductEntity ConvertProductModelToProductEntity (Product productModel)
	{
		ProductEntity productEntity = new ProductEntity();
		
		productEntity.setIdproduct(productModel.getIdproduct());
		productEntity.setName(productModel.getName()); 
		productEntity.setMicrocontroller(productModel.getMicrocontroller());
		productEntity.setOperatingvoltage(productModel.getOperatingvoltage());
		productEntity.setInputvoltagerec(productModel.getInputvoltagerec());
		productEntity.setInputvoltagemax(productModel.getInputvoltagemax());
		productEntity.setNbdigitaliopin(productModel.getNbdigitaliopin());	
		productEntity.setNbanaloginputpin(productModel.getNbanaloginputpin());
		productEntity.setNbpwmdigitaliopin(productModel.getNbpwmdigitaliopin());
		productEntity.setDccurrentperiopin(productModel.getDccurrentperiopin());
		productEntity.setFlashmemory(productModel.getFlashmemory());
		productEntity.setSram(productModel.getSram());
		productEntity.setClockspeed(productModel.getClockspeed());
		productEntity.setEthernet(productModel.getEthernet());
		productEntity.setWifi(productModel.getWifi());
		productEntity.setUsboutput(productModel.getUsboutput()); 
		productEntity.setLenght(productModel.getLenght());
		productEntity.setWidth(productModel.getWidth());
		productEntity.setWeight(productModel.getWeight());
		productEntity.setPriceu(productModel.getPriceu());
		productEntity.setQuantity(productModel.getQuantity());
		productEntity.setIdcateg(productModel.getIdcateg());

		return productEntity;
	}
	
	public Product ConvertProductEntityToProductModel(ProductEntity productEntity)
	{
		Product productModel = new Product();
		
		productModel.setIdproduct(productEntity.getIdproduct());
		productModel.setName(productEntity.getName()); 
		productModel.setMicrocontroller(productEntity.getMicrocontroller());
		productModel.setOperatingvoltage(productEntity.getOperatingvoltage());
		productModel.setInputvoltagerec(productEntity.getInputvoltagerec());
		productModel.setInputvoltagemax(productEntity.getInputvoltagemax());
		productModel.setNbdigitaliopin(productEntity.getNbdigitaliopin());	
		productModel.setNbanaloginputpin(productEntity.getNbanaloginputpin());
		productModel.setNbpwmdigitaliopin(productEntity.getNbpwmdigitaliopin());
		productModel.setDccurrentperiopin(productEntity.getDccurrentperiopin());
		productModel.setFlashmemory(productEntity.getFlashmemory());
		productModel.setSram(productEntity.getSram());
		productModel.setClockspeed(productEntity.getClockspeed());
		productModel.setEthernet(productEntity.getEthernet());
		productModel.setWifi(productEntity.getWifi());
		productModel.setUsboutput(productEntity.getUsboutput()); 
		productModel.setLenght(productEntity.getLenght());
		productModel.setWidth(productEntity.getWidth());
		productModel.setWeight(productEntity.getWeight());
		productModel.setPriceu(productEntity.getPriceu());
		productModel.setQuantity(productEntity.getQuantity());
		productModel.setIdcateg(productEntity.getIdcateg());

		return productModel;
	}
	
	public TranslationProductEntity ConvertTranslationProductModelToTranslationProductEntity (TranslationProduct translationProductModel)
	{
		TranslationProductEntity translationProductEntity = new TranslationProductEntity();
		
		translationProductEntity.setIdtranslationproduct(translationProductModel.getIdtranslationproduct());
		translationProductEntity.setIdlang(translationProductModel.getIdlang());
		translationProductEntity.setIdprod(translationProductModel.getIdprod());
		translationProductEntity.setTranslationname(translationProductModel.getTranslationname());
		translationProductEntity.setTranslationdescription(translationProductModel.getTranslationdescription());
		
		return translationProductEntity;
	}
	
	public TranslationProduct ConvertTranslationProductEntityToTranslationProductModel (TranslationProductEntity translationProductEntity)
	{
		TranslationProduct translationProductModel = new TranslationProduct();
		
		translationProductModel.setIdtranslationproduct(translationProductEntity.getIdtranslationproduct());
		translationProductModel.setIdlang(translationProductEntity.getIdlang());
		translationProductModel.setIdprod(translationProductEntity.getIdprod());
		translationProductModel.setTranslationname(translationProductEntity.getTranslationname());
		translationProductModel.setTranslationdescription(translationProductEntity.getTranslationdescription());
		
		return translationProductModel;
	}
	
	public PictureEntity ConvertPictureModelToPictureEntity(Picture pictureModel)
	{
		PictureEntity pictureEntity = new PictureEntity();
		
		pictureEntity.setIdpic(pictureModel.getIdpic());
		pictureEntity.setNamepic(pictureModel.getNamepic());
		pictureEntity.setUrlpic(pictureModel.getUrlpic());
		pictureEntity.setIdprodc(pictureModel.getIdprodc());
		
		return pictureEntity;
	}
	
	public Picture ConvertPictureEntityToPictureModel(PictureEntity pictureEntity)
	{
		Picture pictureModel = new Picture();
		
		pictureModel.setIdpic(pictureEntity.getIdpic());
		pictureModel.setNamepic(pictureEntity.getNamepic());
		pictureModel.setUrlpic(pictureEntity.getUrlpic());
		pictureModel.setIdprodc(pictureEntity.getIdprodc());
		
		return pictureModel;
	}
	
	public PromotionEntity ConvertPromotionModelToPromotionEntity(Promotion promotionModel)
	{
		PromotionEntity promotionEntity = new PromotionEntity();
		promotionEntity.setIdpromweek(promotionModel.getIdpromweek());
		promotionEntity.setPromotionofweek(promotionModel.getPromotionofweek());
		promotionEntity.setIdcategprod(promotionModel.getIdcategprod());
		
		return promotionEntity;
	}
	
	public Promotion ConvertPromotionEntityToPromotionModel(PromotionEntity promotionEntity)
	{
		Promotion promotionModel = new Promotion();
		promotionModel.setIdpromweek(promotionEntity.getIdpromweek());
		promotionModel.setPromotionofweek(promotionEntity.getPromotionofweek());
		promotionModel.setIdcategprod(promotionEntity.getIdcategprod());
		
		return promotionModel;
	}
	
	public CartEntity ConvertCartModelToCartEntity(Cart cartModel)
	{
		CartEntity cartEntity = new CartEntity();
		cartEntity.setIdcart(cartModel.getIdcart());
		cartEntity.setOrderdate(cartModel.getOrderdate());
		cartEntity.setIdperson(cartModel.getIdperson());
		return cartEntity;
	}
	
	public Cart ConvertCartEntityToCartModel(CartEntity cartEntity)
	{
		Cart cartModel = new Cart();
		cartModel.setIdcart(cartEntity.getIdcart());
		cartModel.setOrderdate(cartEntity.getOrderdate());
		cartModel.setIdperson(cartEntity.getIdperson());
		return cartModel;
	}
	
	public LineProductEntity ConvertLineProductModelToLineProductEntity(LineProduct lineProductModel)
	{
		LineProductEntity lineProductEntity = new LineProductEntity ();
		
		lineProductEntity.setIdlineproduct(lineProductModel.getIdlineproduct());
		lineProductEntity.setQuantity(lineProductModel.getQuantity());
		lineProductEntity.setDiscount(lineProductModel.getDiscount());
		lineProductEntity.setIdcartperson(lineProductModel.getIdcartperson());
		lineProductEntity.setIdproduct(lineProductModel.getIdproduct());

		return lineProductEntity;
	}
	
	public LineProduct ConvertLineProductEntityToLineProductModel(LineProductEntity lineProductEntity)
	{
		LineProduct lineProductModel = new LineProduct ();
		
		lineProductModel.setIdlineproduct(lineProductEntity.getIdlineproduct());
		lineProductModel.setQuantity(lineProductEntity.getQuantity());
		lineProductModel.setDiscount(lineProductEntity.getDiscount());
		lineProductModel.setIdcartperson(lineProductEntity.getIdcartperson());
		lineProductModel.setIdproduct(lineProductEntity.getIdproduct());

		return lineProductModel;
	}
	
	public java.util.Date convertStringDateToJavaUtilDate(String bD)
	{
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date parsed;
		try 
		{
			parsed = format.parse(bD);
			return parsed;
			
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String converJavaUtilDatetToStringDate(java.util.Date bD)
	{
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		String reportDate = df.format(bD);
		
		return reportDate;
	}
	
}
