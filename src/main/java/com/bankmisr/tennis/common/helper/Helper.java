package com.bankmisr.tennis.common.helper;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Aya Yasser
 */
@Service
public class Helper {

    public String convertStringToDate(Date indate,String dateFormat)
    {
        String dateString = null;
        SimpleDateFormat sdfr = new SimpleDateFormat(dateFormat);

        try{
            dateString = sdfr.format( indate );
        }catch (Exception ex ){
            ex.printStackTrace();
        }
        return dateString;
    }
}
