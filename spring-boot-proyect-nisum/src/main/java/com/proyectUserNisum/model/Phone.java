package com.proyectUserNisum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "phones")
public class Phone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@Column(name = "number")
    private Long number;
	@Column(name = "citycode")
    private Integer citycode;
	@Column(name = "contrycode")
    private Integer contrycode;
	@ManyToOne
    @JoinColumn(name="user_id")
	private User user;
	
	public Phone() {
	}

	public Phone(Long id, Long number, Integer citycode, Integer contrycode) {
		this.id = id;
		this.number = number;
		this.citycode = citycode;
		this.contrycode = contrycode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Integer getCitycode() {
		return citycode;
	}

	public void setCitycode(Integer citycode) {
		this.citycode = citycode;
	}

	public Integer getContrycode() {
		return contrycode;
	}

	public void setContrycode(Integer contrycode) {
		this.contrycode = contrycode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
