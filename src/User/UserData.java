/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Rizky
 */
public class UserData {
    private String email;
    // Anda dapat menambahkan properti lainnya seperti kata sandi, dsb.

    public String getEmail() {
        System.out.println("Yang tersimpan"+email);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}