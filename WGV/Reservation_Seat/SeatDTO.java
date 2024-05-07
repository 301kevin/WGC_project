package Reservaion;

import java.sql.Connection;
import java.sql.DriverManager;

public class SeatDTO {
	String image;
	String mvname;
	String cal;
	String time;
	String room;
	int count;
	String name;
	String id;
	String phone;
	String adress;
	
	public SeatDTO() {

	}
	
	
	public SeatDTO(String image, String mvname, String cal, String time, String room,int count,String id) {
		super();
		this.image = image;
		this.mvname = mvname;
		this.cal = cal;
		this.time = time;
		this.room = room;
		this.count = count;
		this.id = id;
	}
	
	public SeatDTO(String image, String mvname, String cal, String time, String room, int count, String name, String id,
			String phone, String adress) {
		super();
		this.image = image;
		this.mvname = mvname;
		this.cal = cal;
		this.time = time;
		this.room = room;
		this.count = count;
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.adress = adress;
	}
	
	
	

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getMvname() {
		return mvname;
	}
	public void setMvname(String mvname) {
		this.mvname = mvname;
	}
	public String getCal() {
		return cal;
	}
	public void setCal(String cal) {
		this.cal = cal;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "SeatDTO [image=" + image + ", mvname=" + mvname + ", cal=" + cal + ", time=" + time + ", room=" + room
				+ ", count=" + count + ", name=" + name + ", id=" + id + ", phone=" + phone + ", adress=" + adress
				+ "]";
	}

}