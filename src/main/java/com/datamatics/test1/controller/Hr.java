package com.datamatics.test1.controller;

public class Hr {

	private int hrId;
	private String hrName;
	private String hrAddress;
	private String hrCode;
	private String hrDescription;
	
	
	
	public Hr(int hrId, String hrName, String hrAddress, String hrCode, String hrDescription) {
		super();
		this.hrId = hrId;
		this.hrName = hrName;
		this.hrAddress = hrAddress;
		this.hrCode = hrCode;
		this.hrDescription = hrDescription;
	}
	
	
	public Hr() {
	}
	public int getHrId() {
		return hrId;
	}
	public void setHrId(int hrId) {
		this.hrId = hrId;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public String getHrAddress() {
		return hrAddress;
	}
	public void setHrAddress(String hrAddress) {
		this.hrAddress = hrAddress;
	}
	public String getHrCode() {
		return hrCode;
	}
	public void setHrCode(String hrCode) {
		this.hrCode = hrCode;
	}
	public String getHrDescription() {
		return hrDescription;
	}
	public void setHrDescription(String hrDescription) {
		this.hrDescription = hrDescription;
	}

	
	
}
