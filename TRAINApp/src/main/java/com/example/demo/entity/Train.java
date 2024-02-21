package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Train {
	@Id
	String train_number;
	String train_name, departure_station, arrival_station, departure_time, arrival_time;
	int seat_capacity, ticket_price;
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Train(String train_number, String train_name, String departure_station, String arrival_station,
			String departure_time, String arrival_time, int seat_capacity, int ticket_price) {
		super();
		this.train_number = train_number;
		this.train_name = train_name;
		this.departure_station = departure_station;
		this.arrival_station = arrival_station;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.seat_capacity = seat_capacity;
		this.ticket_price = ticket_price;
	}
	public String getTrain_number() {
		return train_number;
	}
	public void setTrain_number(String train_number) {
		this.train_number = train_number;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getDeparture_station() {
		return departure_station;
	}
	public void setDeparture_station(String departure_station) {
		this.departure_station = departure_station;
	}
	public String getArrival_station() {
		return arrival_station;
	}
	public void setArrival_station(String arrival_station) {
		this.arrival_station = arrival_station;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public int getSeat_capacity() {
		return seat_capacity;
	}
	public void setSeat_capacity(int seat_capacity) {
		this.seat_capacity = seat_capacity;
	}
	public int getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(int ticket_price) {
		this.ticket_price = ticket_price;
	}
	@Override
	public String toString() {
		return "Train [train_number=" + train_number + ", train_name=" + train_name + ", departure_station="
				+ departure_station + ", arrival_station=" + arrival_station + ", departure_time=" + departure_time
				+ ", arrival_time=" + arrival_time + ", seat_capacity=" + seat_capacity + ", ticket_price="
				+ ticket_price + "]";
	}
}