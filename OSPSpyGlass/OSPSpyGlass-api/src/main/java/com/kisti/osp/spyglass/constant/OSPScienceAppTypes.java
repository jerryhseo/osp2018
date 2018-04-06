package com.kisti.osp.spyglass.constant;

public enum OSPScienceAppTypes {
	SS("Static Solver"),
	DS("Dynamic Solver"),
	SC("Static Converter"),
	DC("Dynamic Converter"),
	ED("Editor"),
	AN("Analyzer"),
	WF("Workflow");
	
	@Override
	public String toString(){
		return this.value;
	}
	
	public boolean equal( String type ){
		return this.value.equalsIgnoreCase(type);
	}
	
	public String value(){
		return this.value;
	}
	
	private String value;
	
	private OSPScienceAppTypes( String value ){
		this.value = value;
	}
}
