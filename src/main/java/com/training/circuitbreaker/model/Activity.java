package com.training.circuitbreaker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* sample message
    {
        "activity": "Start a family tree",
            "type": "social",
            "participants": 1,
            "price": 0,
            "link": "https:en.wikipedia.org/wiki/Family_tree",
            "key": "6825484",
            "accessibility": 1
    }*/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Activity {
    public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Integer getParticipants() {
		return participants;
	}
	public void setParticipants(Integer participants) {
		this.participants = participants;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getAccessibility() {
		return accessibility;
	}
	public void setAccessibility(Double accessibility) {
		this.accessibility = accessibility;
	}
	private String activity;
    private String type;
    private String link;
    private String key;
    private Integer participants;
    private Double price;
    private Double accessibility;
}
