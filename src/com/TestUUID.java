package com;

import java.util.UUID;

public class TestUUID {
	public static void main(String []args){
		byte[] buff = "icasc2018".getBytes();
		UUID uuid = UUID.nameUUIDFromBytes(buff);
		System.out.println(uuid.toString().replace("-",""));
	}
}
