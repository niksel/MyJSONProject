package com.MyJSONProject;

import java.util.Date;

public class PaymentMethod {

	@Override
	public String toString() {
		return "PaymentMethod [cardNo=" + cardNo + ", cardName=" + cardName + ", dateFrom=" + dateFrom + ", cardType="
				+ cardType + "]";
	}
	int cardNo;
	String cardName;
	Date dateFrom;
	CardType cardType;
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	
	public CardType getCardType() {
		return cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardName == null) ? 0 : cardName.hashCode());
		result = prime * result + cardNo;
		result = prime * result + ((cardType == null) ? 0 : cardType.hashCode());
		result = prime * result + ((dateFrom == null) ? 0 : dateFrom.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentMethod other = (PaymentMethod) obj;
		if (cardName == null) {
			if (other.cardName != null)
				return false;
		} else if (!cardName.equals(other.cardName))
			return false;
		if (cardNo != other.cardNo)
			return false;
		if (cardType != other.cardType)
			return false;
		if (dateFrom == null) {
			if (other.dateFrom != null)
				return false;
		} else if (!dateFrom.equals(other.dateFrom))
			return false;
		return true;
	}
	
	
	
}
