package com.greatLearning.service;

public class OTPservice {

	public int generateOTP()
	{
		int random=(int)(Math.random()*9000)+1000;
		return random;
	}
}
