package com.averageprice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.averageprice.controller.ShareControl;
import com.averageprice.model.Share;

public class App{

	public static void main( String[] args ) throws ParserConfigurationException, SAXException, IOException{    	
		Share share = new Share();
    	ArrayList<Double> sharePrice = new ArrayList<>();
    	ArrayList<Integer> quantityPurchased = new ArrayList<>();
    	
		Scanner scan = new Scanner(System.in);
		
		ShareControl shareControl = new ShareControl();
    	    	
		System.out.println("Quantas operações você realizou ?");
		Integer op = scan.nextInt();
		
		if(op > 1) {
			for(int i = 1; i <= op; i++) {
				System.out.println("\nOperação "+i);
				System.out.println("================\n");
				System.out.println("Preço da ação: ");
				share.setSharePrice(scan.nextDouble());
				sharePrice.add(share.getSharePrice());
				
				System.out.println("================\n");
				System.out.println("Quantidade de ações: ");
				share.setQuantityPurchased(scan.nextInt());
				quantityPurchased.add(share.getQuantityPurchased());
			}
			shareControl.multiplyQuantityByPrice(quantityPurchased, sharePrice, op);
		}else {
			System.out.println("Não é possivel ter um valor médio com apenas 1 operação.");
		}
    }
}
