package com.jobpost.utility;

import org.springframework.lang.Nullable;

import com.jobpost.exceptions.JobPostingException;
/*************************************************************************************************************
*
* purpose:PreConditions
* 
* @author sowjanya467
* @version 1.0
* @since 10-07-18
*
**************************************************************************************************/
public class PreConditions {

	public static <T> T checkNotNull(T reference,@Nullable Object message) throws JobPostingException {
		if(reference==null) {
			throw new JobPostingException(String.valueOf(message));
		}
		return reference;
		
	}

    public static boolean isPresentInDb(boolean reference,@Nullable Object errorMessage) throws JobPostingException {
        if (!reference) {
            throw new JobPostingException(String.valueOf(errorMessage));
        }
        return reference;
    }
}