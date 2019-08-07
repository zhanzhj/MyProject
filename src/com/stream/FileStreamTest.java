package com.stream;


import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileStreamTest {
	public static void main(String[] args){
		write();
	}

	public static void write(){
		try {
			File file = new File("D:/njsc_del_0731.sql");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/njsc_0731.txt"));
			String str = null;
			while ((str = bufferedReader.readLine()) != null){
				String[] sku_cate = str.split(",");
				writer.write("INSERT INTO `supplier`.`message_pool` (`TYPE`, `STATUS`, `DATA`, `CREATE_TIME`, `UPDATE_TIME`, `DOCKING_ID`) VALUES ('6', '0', '{\"page_num\":\""+ sku_cate[1] +"\",\"state\":2,\"skuId\":\""+ sku_cate[0]+"\"}', sysdate(), sysdate(), '63');\r\n");
				writer.flush();
			}
			bufferedReader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void cate(){
		try {
			File file = new File("D:/guodian.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/cate.txt"));
			String str = null;
			Map<Integer, Integer> map = new HashMap();
			while ((str = bufferedReader.readLine()) != null){
				String[] cates = str.split(",");
				Integer cateId = Integer.valueOf(cates[0].trim());
				Integer parentId = Integer.valueOf(cates[1].trim());
				map.put(cateId, parentId);
			}
			bufferedReader.close();
			BufferedReader buffteredReader2 = new BufferedReader(new FileReader("D:/cateId.txt"));
			String str2 = null;
			while ((str2 = buffteredReader2.readLine()) != null){
				Integer cateId = Integer.valueOf(str2);
				writer.write("" + map.get(cateId) +"\r\n");
				writer.flush();
			}
			buffteredReader2.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void writeReceipt(){
		try {
			File file = new File("D:/guodianDate2.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/sendDate.txt"));
			String str = null;
			Map<Integer, Integer> map = new HashMap();
			while ((str = bufferedReader.readLine()) != null){
				String[] arrays = str.split(",");
				if(arrays.length > 3){
					System.out.println(arrays);
					continue;
				}
				String recepitNo = arrays[0];
				String sendDate = arrays[1];
				//String updateSql = "insert into order_receipt_vehsy_tem (receipt_no, send_date) values ('"+ recepitNo +"','"+ sendDate +"');\r\n";
				String updateSql = "update order_receipt_vehsy set SEND_DATE ='"+ sendDate +"' where RECEIPT_NO = '"+ recepitNo +"';\r\n";
				writer.write(updateSql);
			}
			bufferedReader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void insertTemp(){
		try {
			File file = new File("D:/hangtian.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/hangtiansku.txt"));
			String str = null;
			Map<Integer, Integer> map = new HashMap();
			while ((str = bufferedReader.readLine()) != null){
				String[] arrays = str.split(",");
				if(arrays.length > 2){
					System.out.println(arrays);
					continue;
				}
				String skuCode = arrays[0];
				String updateSql = "insert into hang_tian_tem (sku_code) values ('"+ skuCode  +"');\r\n";
				writer.write(updateSql);
			}
			bufferedReader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void updateIcascCate(){
		try {
			File file = new File("D:/update_icasc_0327.sql");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/icasc_txt.txt"));
			String str = null;
			while ((str = bufferedReader.readLine()) != null){
				String[] sku_cate = str.split(",");
				writer.write("UPDATE pc.sp_category_mapping set category1 = "+ sku_cate[1] +", category2 = "+ sku_cate[2] +", category3 = "+ sku_cate[3] +", category4 = "+ sku_cate[4] +" WHERE source = 'ICASC' and ehsy_category = "+ sku_cate[0] +";\r\n");
				writer.flush();
			}
			bufferedReader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static   void analysisMessage(){
		try {
			File file = new File("D:/icasc_add_sku_0409.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/icasc_0409.txt"));
			String str = null;
			while ((str = bufferedReader.readLine()) != null){

				writer.write("\r\n");
				writer.flush();
			}
			bufferedReader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writePriceChange(){
		try {
			File file = new File("D:/yicaitong_message_0514.sql");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/yicaitong_0514.txt"));
			String str = null;
			while ((str = bufferedReader.readLine()) != null){
				writer.write("INSERT INTO `supplier`.`message_pool` (`TYPE`, `STATUS`, `DATA`, `CREATE_TIME`, `UPDATE_TIME`, `DOCKING_ID`) VALUES ('2', '0', '{\"skuId\":\""+ str +"\"}', sysdate(), sysdate(), '45');\r\n");
				writer.flush();
			}
			bufferedReader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
