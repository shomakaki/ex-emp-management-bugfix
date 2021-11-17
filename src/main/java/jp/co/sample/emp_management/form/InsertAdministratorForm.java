package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@Size(min=1,max=20,message="名前は20文字以内でご入力ください")
	private String name;
	/** メールアドレス */
	@Email(message="Ｅメールの形式が不正です")
	private String mailAddress;
	/** パスワード */
	@Pattern(regexp = "^[0-9a-zA-Z]+$",message="パスワードは英数字を含めご入力ください")
	@Size(min=8,message="パスワードは8文字以上です。")
	private String password;
	@Pattern(regexp = "^[0-9a-zA-Z]+$",message="パスワードは英数字を含めご入力ください")
	@Size(min=8,message="パスワードは8文字以上です。")
	private String password2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", password2=" + password2 + "]";
	}

	
	
}
