package demo2.contactapp.com.contactappdemo2.model;

public class Contact {
    //getter and setter alt+insert
    private String mName;
    private String mPhone;
    private boolean isMale;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
//khoi tao bien A ( o day la Contact )
    public Contact (boolean isMale, String mName , String mPhone){
        //Bien Contact gom co 3 thanh phan this.isMale tuc la context nay tro den bien isMale = isMale (bien co the su dung )
        this.isMale=isMale;
        this.mName=mName;
        this.mPhone=mPhone;

    }
}
