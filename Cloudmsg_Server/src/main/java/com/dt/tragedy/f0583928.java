package com.dt.tragedy;

import org.junit.Test;

import com.dt.cloudmsg.beans.Profile;

public class ProfileTest {

	@Test
	public void testToJson(){
		Profile profile = new Profile();
		profile.setAddr("