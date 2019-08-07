package com.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestDistinct {
	public static void main(String[] args){
		List<MessagePool> messagePoolList = new ArrayList<>();
		MessagePool pool1 = new MessagePool(6, "0", "{\"skuId\":\"AAD354\"}", 42L);
		MessagePool pool2 = new MessagePool(6, "0", "{\"skuId\":\"AAD354\"}", 42L);
		MessagePool pool3 = new MessagePool(6, "0", "{\"skuId\":\"MCJ324\",\"state\":1,\"page_num\":\"12240\"}", 42L);
		MessagePool pool4 = new MessagePool(6, "0", "{\"skuId\":\"MCJ324\",\"state\":1,\"page_num\":\"12240\"}", 42L);
		MessagePool pool5 = new MessagePool(6, "0", "{\"skuId\":\"MCJ324\",\"state\":1,\"page_num\":\"12240\"}", 42L);
		MessagePool pool6 = new MessagePool(6, "0", "{\"skuId\":\"MCJ324\",\"state\":1,\"page_num\":\"12240\"}", 42L);
		messagePoolList.add(pool1);
		messagePoolList.add(pool2);
		messagePoolList.add(pool3);
		messagePoolList.add(pool4);
		messagePoolList.add(pool5);
		messagePoolList.add(pool6);

		Set<MessagePool> messagePoolSet = new HashSet<>(messagePoolList);
		messagePoolList = new ArrayList<>(messagePoolSet);
		System.out.println(messagePoolList);
	}
}
