package com.kisti.osp.spyglass.constant;

public enum OSPScienceAppStatus {
	INIT(0),
	GENERAL(1),
	EXCUTE(2),
	PORTS(3),
	LAYOUT(4),
	PUBLISH(5),
	PENDDING(6),
	PUBLISHED(7);
	
	public boolean equal( int type ){
		return this.value == type; 
	}
	
	public boolean equal( String type ){
		return this.toString().equalsIgnoreCase(type);
	}
	
	public int value(){
		return this.value;
	}
	
	public boolean isRunnable(){
		switch( this ){
			case INIT:
			case GENERAL:
			case EXCUTE:
			case PORTS:	return false;
			case LAYOUT:
			case PUBLISH:
			case PENDDING:
			case PUBLISHED:	return true;
		}
		
		return false;
	}
	
	private int value;
	private OSPScienceAppStatus( int value){
		this.value = value;
	}
}
