package com.kisti.osp.spyglass.constant;

public enum OSPScienceAppActionKeys {
	CREATE("CREATE"),
	RUN("RUN"),
	COPY("COPY"),
	DELETE("DELETE"),
	UPDATE("UPDATE"),
	PUBLISH("PUBLISH"),
	DOWNLOAD("DOWNLOAD");
	
	public boolean equal( String type ){
		return this.toString().equalsIgnoreCase(type);
	}
	
	public String value(){
		return this.value;
	}
	
	private String value;
	
	private OSPScienceAppActionKeys( String value ){
		this.value = value;
	}
}
