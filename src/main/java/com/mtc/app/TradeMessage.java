package com.mtc.app;

public class TradeMessage {
	
	enum IdSource { ISIN, CUSIP, SEDOL, RIC }
	String tradeId;
	String account;
	String securityId;
	String IdSource;
	String isin;
	String sedol;
	String cusip;
	String ric;
	String ticker;
	Integer qty;
	Double price;


}
