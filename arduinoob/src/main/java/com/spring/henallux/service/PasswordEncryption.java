package com.spring.henallux.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Service;

@Service
public class PasswordEncryption {
	
	public String cryptPwd(String password) throws NoSuchAlgorithmException
    {
        MessageDigest md;
        String message = password;
        String pwdOut = "";
        try
        {
            md = MessageDigest.getInstance("SHA-512");

            md.update(message.getBytes());

            byte[] mb = md.digest();

            for (int i = 0; i < mb.length; i++)
            {
                byte temp = mb[i];
                String s = Integer.toHexString(new Byte(temp));
                while (s.length() < 2) {
                    s = "0" + s;
                }
                s = s.substring(s.length() - 2);
                pwdOut += s;
            }
        }
        catch (NoSuchAlgorithmException e)
        {
            System.out.println(e.getMessage());
        }
        return pwdOut;
    }
}
