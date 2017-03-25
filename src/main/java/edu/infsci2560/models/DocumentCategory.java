/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author KRodgers
 */
@Entity
public class DocumentCategory {
    private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
	protected String categoryName;

	public DocumentCategory(){
		this.id = Long.MAX_VALUE;
		this.categoryName = null;
	}

	public DocumentCategory(Long id, String name){
		this.id = id;
		this.categoryName = name;
	}

	@Override
    public String toString() {
        return "[ document category =" + this.name  + " ]";
    }

	@Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

	/**
     * @return the documentTitle
     */
    public String getDocumentCategory() {
        return categoryName;
    }

    /**
     * @param documentTitle the documentTitle to set
     */
    public void setDocumentCategory(String documentCategory) {
        this.categoryName = documentCategory;
    }
}