package com.bookstore.entities;
// Generated 9 nov. 2021 21:14:05 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * BookOrder generated by hbm2java
 */
@Entity
@Table(name = "book_order", catalog="heroku_03ee648e7239c63")
@NamedQueries({
	@NamedQuery(name="BookOrder.findAll", query="SELECT bo FROM BookOrder bo ORDER BY bo.orderDate DESC"),
	@NamedQuery(name="BookOrder.countAll", query="SELECT COUNT(*) FROM BookOrder bo"),
	@NamedQuery(name="BookOrder.findByCustomer", query="SELECT bo FROM BookOrder bo WHERE bo.customer.customerId=:customerId ORDER BY bo.orderDate DESC"),
	@NamedQuery(name="BookOrder.findByIdAndCustomer", query="SELECT bo FROM BookOrder bo WHERE bo.orderId=:orderId AND bo.customer.customerId=:customerId")
})
public class BookOrder implements java.io.Serializable {


	private static final long serialVersionUID = -9032090692165313399L;
	private Integer orderId;
	private Customer customer;
	private Date orderDate;
	private String addressLine1;
	private String addressLine2;
	private String firstname;
	private String lastname;
	private String phone;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	private String paymentMethod;
	private float subtotal;
	private float shippingFee;
	private float tax;
	private float total;
	private String status;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

	public BookOrder() {
	}

	

	public BookOrder(Customer customer, Date orderDate, String address1, String address2, String firstname,
			String lastname, String phone, String city, String state, String zipcode, String country,
			String paymentMethod, float total, String status) {
		super();
		this.customer = customer;
		this.orderDate = orderDate;
		this.addressLine1 = address1;
		this.addressLine2 = address2;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.paymentMethod = paymentMethod;
		this.total = total;
		this.status = status;
	}

	
	public BookOrder(Integer orderId, Customer customer, Date orderDate, String address1, String address2,
			String firstname, String lastname, String phone, String city, String state, String zipcode, String country,
			String paymentMethod, float total, Set<OrderDetail> orderDetails) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.orderDate = orderDate;
		this.addressLine1 = address1;
		this.addressLine2 = address2;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.paymentMethod = paymentMethod;
		this.total = total;
		this.orderDetails = orderDetails;
	}
	
	public BookOrder(Integer orderId, Customer customer, Date orderDate, String address1, String address2,
			String firstname, String lastname, String phone, String city, String state, String zipcode, String country,
			String paymentMethod, float subtotal, float shippingFee, float tax, float total, String status) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.orderDate = orderDate;
		this.addressLine1 = address1;
		this.addressLine2 = address2;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.paymentMethod = paymentMethod;
		this.subtotal = subtotal;
		this.shippingFee = shippingFee;
		this.tax = tax;
		this.total = total;
		this.status = status;
	}



	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "order_id", unique = true, nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_date", nullable = false, length = 19)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "r_address_line1", nullable = false, length = 256)
	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String address1) {
		this.addressLine1 = address1;
	}
	
	@Column(name = "r_address_line2", nullable = true, length = 256)
	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String address2) {
		this.addressLine2 = address2;
	}

	@Column(name = "r_firstname", nullable = false, length = 30)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(name = "r_lastname", nullable = false, length = 30)
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "r_phone", nullable = false, length = 15)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column(name = "r_city", nullable = false, length = 32)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "r_state", nullable = false, length = 45)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "r_zipcode", nullable = false, length = 24)
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	@Column(name = "r_country", nullable = false, length = 4)
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Transient
	public String getCountryName(){
		return new Locale("", this.country).getDisplayCountry();

	}
	
	@Column(name = "payment_method", nullable = false, length = 20)
	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	@Column(name = "subtotal", nullable = false, precision = 12, scale = 0)
	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	
	@Column(name = "shipping_fee", nullable = false, precision = 12, scale = 0)
	public float getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(float shippingFee) {
		this.shippingFee = shippingFee;
	}

	
	@Column(name = "tax", nullable = false, precision = 12, scale = 0)
	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	
	@Column(name = "total", nullable = false, precision = 12, scale = 0)
	public float getTotal() {
		return this.total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@Column(name = "status", nullable = false, length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "bookOrder", cascade = CascadeType.ALL, orphanRemoval = true)
	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	@Transient
	public int getBookCopies(){
		int total = 0;
		
		for(OrderDetail orderDetail : orderDetails) {
			total += orderDetail.getQuantity();
		}
		
		return total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
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
		BookOrder other = (BookOrder) obj;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		return true;
	}
	
}
