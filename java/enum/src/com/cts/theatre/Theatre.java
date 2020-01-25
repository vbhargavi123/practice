package com.cts.theatre;

public enum Theatre {
	PLATINUM,
	
	GOLD,
	
	SILVER;
	private  int rate;
	private Theatre() {
		
	}
	
	public int getRate() {
	if(this==PLATINUM)
	
    return 130;
	
	 if(this==GOLD)
	
		return 200;
	
	if(this==SILVER)
		
	return 100;
	return 0;
	}
}

	
	


	




	


