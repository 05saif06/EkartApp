package org.ekartapp.springcore.prac.dto;

import org.ekartapp.springcore.prac.model.OrderTable;

public class OrderRequest {
	
	private OrderTable order;

	public OrderRequest(OrderTable order) {
		super();
		this.order = order;
	}

	public OrderRequest() {
		super();
	}

	public OrderTable getOrder() {
		return order;
	}

	public void setOrder(OrderTable order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderRequest [order=" + order + "]";
	}
	
	

}
