package com.kisti.osp.spyglass.constant;

public enum OSPScienceAppActionKeys {
	CREATE("CREATE"),
	RUN("RUN"),
	COPY("COPY"),
	DELETE("DELETE"),
	UPDATE("UPDATE"),
	PUBLISH("PUBLISH"),
	DOWNLOAD("DOWNLOAD");
	
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
	
	private OSPScienceAppActionKeys( String value ){
		this.value = value;
	}
}
