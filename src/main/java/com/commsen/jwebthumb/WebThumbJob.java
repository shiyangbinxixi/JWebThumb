/*
 * Copyright (c) 2010 Commsen International. All rights reserved.
 * 
 * This file is part of JWebThumb library.
 *	
 * JWebThumb library is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * JWebThumb library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JWebThumb library.  If not, see <http://www.gnu.org/licenses/lgpl.html>.
 */
package com.commsen.jwebthumb;

import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * This class represents 'jobs' part of webthumb's response to "request" API call. See
 * http://webthumb.bluga.net/apidoc#request for details
 * 
 * @author <a href="mailto:MilenDyankov@gmail.com">Milen Dyankov</a>
 * 
 */
public class WebThumbJob {
	private int estimate;
	private Date time;
	private String url;
	private int cost;
	private String id;


	/**
	 * @return the estimate
	 */
	public int getEstimate() {
		return this.estimate;
	}


	/**
	 * @param estimate the estimate to set
	 */
	void setEstimate(int estimate) {
		this.estimate = estimate;
	}


	/**
	 * @return the time
	 */
	public Date getTime() {
		return this.time;
	}


	/**
	 * @param time the time to set
	 */
	void setTime(Date time) {
		this.time = time;
	}


	/**
	 * @return the url
	 */
	public String getUrl() {
		return this.url;
	}


	/**
	 * @param url the url to set
	 */
	void setUrl(String url) {
		this.url = url;
	}


	/**
	 * @return the cost
	 */
	public int getCost() {
		return this.cost;
	}


	/**
	 * @param cost the cost to set
	 */
	void setCost(int cost) {
		this.cost = cost;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}


	/**
	 * @param id the id to set
	 */
	void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return new ReflectionToStringBuilder(this).toString();
	}
}
