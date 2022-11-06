package com.PDW.ProyectoDW.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class AbstractEntity implements Serializable{
	
	private static final long serialVersionUID = 1263876128L;
	
	@JsonIgnore
	@Embedded
	private Audit audit;

	public Audit getAudit() {
		return audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}
	
	

}
