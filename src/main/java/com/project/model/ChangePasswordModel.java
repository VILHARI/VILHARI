package com.project.model;

public class ChangePasswordModel {
private String newpass;
private String oldpass;
private String confirmpass;
public String getNewpass() {
	return newpass;
}
public void setNewpass(String newpass) {
	this.newpass = newpass;
}
public String getOldpass() {
	return oldpass;
}
public void setOldpass(String oldpass) {
	this.oldpass = oldpass;
}
public String getConfirmpass() {
	return confirmpass;
}
public void setConfirmpass(String confirmpass) {
	this.confirmpass = confirmpass;
}
@Override
public String toString() {
	return "ChangePasswordModel [newpass=" + newpass + ", oldpass=" + oldpass + ", confirmpass=" + confirmpass + "]";
}

}
