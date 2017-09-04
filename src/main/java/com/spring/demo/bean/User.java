package com.spring.demo.bean;

import java.io.Serializable;

public class User implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String name;



    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}

