package com.kisti.osp.spyglass.constant;

public enum OSPScienceAppTypes {
	SS("Static Solver"),
	DS("Dynamic Solver"),
	SC("Static Converter"),
	DC("Dynamic Converter"),
	ED("Editor"),
	AN("Analyzer"),
	WF("Workflow");
	
	public String value(){
		return this.value;
	}
	
	private String value;
	
	private OSPScienceAppTypes( String value ){
		this.value = value;
	}
}
