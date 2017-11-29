/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agas;

import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class InputNama {

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the Alamat
     */
    public String getAlamat() {
        return Alamat;
    }

    /**
     * @param Alamat the Alamat to set
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    /**
     * @return the Tanggungan
     */
    public int getTanggungan() {
        return Tanggungan;
    }

    /**
     * @param Tanggungan the Tanggungan to set
     */
    public void setTanggungan(int Tanggungan) {
        this.Tanggungan = Tanggungan;
    }

    /**
     * @return the Salary
     */
    public int getSalary() {
        return Salary;
    }

    /**
     * @param Salary the Salary to set
     */
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    /**
     * @return the Nohp
     */
    public String getNohp() {
        return Nohp;
    }

    /**
     * @param Nohp the Nohp to set
     */
    public void setNohp(String Nohp) {
        this.Nohp = Nohp;
    }
    private String Nama;
    private String Alamat;
    private int Tanggungan;
    private int Salary;
    private String Nohp;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public void setNama(JTextField nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAlamat(JTextField alamat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTanggungan(JTextField tanggungan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSalary(JTextField salary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNohp(JTextField nohandphone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
