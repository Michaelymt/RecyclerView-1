package com.nanddgroup.recyclerview;

/**
 * Created by Nikita on 22.02.2016.
 */
public class Information {
    protected String sName;
    protected String sSurname;
    protected String sEmail;
    protected String sTitle;
    protected String sData;

    public Information(String sData, String sEmail, String sName, String sSurname, String sTitle) {
        this.sData = sData;
        this.sEmail = sEmail;
        this.sName = sName;
        this.sSurname = sSurname;
        this.sTitle = sTitle;
    }
}
