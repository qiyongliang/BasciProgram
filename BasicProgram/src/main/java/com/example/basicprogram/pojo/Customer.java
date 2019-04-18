package com.example.basicprogram.pojo;

/**
 * @author qiyongliang
 * @date 2019/4/8-17:19
 */
public class Customer {
    private String strName;
    private String strSex;
    private int nAge;

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrSex() {
        return strSex;
    }

    public void setStrSex(String strSex) {
        this.strSex = strSex;
    }

    public int getnAge() {
        return nAge;
    }

    public void setnAge(int nAge) {
        this.nAge = nAge;
    }


    @Override
    public String toString() {

        return this.getStrName()+(this.getStrSex().equals("男")?"先生":"女士")+"年龄是"+this.getnAge();
    }
}
