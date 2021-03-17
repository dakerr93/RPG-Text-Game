package rpg.game;
public class RpgPlayer {

String user_screenname;
String user_first;
String user_last;
String user_password;
Integer type_id;  // might not need integer
String type_name;


//Model for user constructor and model

public RpgPlayer(String user_screenname, String user_first, String user_last, String user_password, Integer type_id) {
	super();
	this.user_screenname = user_screenname;
	this.user_first = user_first;
	this.user_last = user_last;
	this.user_password = user_password;
	this.type_id = type_id;


}
public String getUser_screenname() {
	return user_screenname;
}
public void setUser_screenname(String user_screenname) {
	this.user_screenname = user_screenname;
}
public String getUser_first() {
	return user_first;
}
public void setUser_first(String user_first) {
	this.user_first = user_first;
}
public String getUser_last() {
	return user_last;
}
public void setUser_last(String user_last) {
	this.user_last = user_last;
}
public String getUser_password() {
	return user_password;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
public Integer getType_id() {
	return type_id;
}
public void setType_id(Integer type_id) {
	this.type_id = type_id;
}
public String getType_name() {
	return type_name;
}
public void setType_name(String type_name) {
	this.type_name = type_name;
}

}



