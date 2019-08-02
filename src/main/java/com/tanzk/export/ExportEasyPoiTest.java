/**
 * Copyright (C), 2012-2019, www.shopin.net
 * FileName: ExportEasyPoiTest
 * Author:   pengweiqiang
 * Date:     2019/7/31 17:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tanzk.export;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.tanzk.export.bean.MsgClient;
import com.tanzk.export.bean.MsgClientGroup;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * easypoi导出大数据功能.
 *
 * @author pengweiqiang
 * @version V1.0 2019/7/31
 */
public class ExportEasyPoiTest {

    public static void main(String[] args) throws Exception{
        ExecutorService executors = Executors.newFixedThreadPool(10);
        final CountDownLatch countDownLatch = new CountDownLatch(10);
        for(int i =0 ;i<10;i++) {
            Runnable runnable = new Runnable() {
                public void run() {
                    ExportEasyPoiTest exportEasyPoiTest = new ExportEasyPoiTest();
                    try {
                        exportEasyPoiTest.bigDataExport();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    countDownLatch.countDown();
                }
            };
            executors.execute(runnable);
        }
        countDownLatch.await();


    }

    public void bigDataExport() throws Exception {
        List<MsgClient> list = new ArrayList<MsgClient>();
        Workbook workbook = null;
        Date start = new Date();
        ExportParams params = new ExportParams();
        params.setSheetName("测试数据");
        //一百万数据量
        for (int i = 0; i < 100000; i++) {
            MsgClient client = new MsgClient();
            client.setBirthday(new Date());
            client.setClientName("小明" + i);
            client.setClientPhone("18797" + i);
            client.setCreateBy("JueYue");
            client.setId("1" + i);
            client.setRemark("测试" + i);
            client.setEmail("123123");
            client.setHouseholdAddress("水电费水电费水电费");
            client.setIdcardAdress("颇尔快了呢打开你率是镂空打发开连锁的");
            client.setPhoneA("s123123s23");
            client.setPhoneB("120398123123");
            client.setPhoneC("1239493556");
            client.setTelephone("123123123123");
            client.setIdentifyType("!23dfsd ");
            client.setWorkAddress("破损代付款水电费4的烦恼是快递费可适当减肥");
            client.setLiveAddress("s水电费水电费了是的覅而");
            MsgClientGroup group = new MsgClientGroup();
            group.setGroupName("测试" + i);
            client.setGroup(group);
            list.add(client);
            if(list.size() == 10000){
                workbook = ExcelExportUtil.exportBigExcel(params, MsgClient.class, list);
                list.clear();
            }
        }
        ExcelExportUtil.closeExportBigExcel();

        File savefile = new File("/Users/pengweiqiang/tanzhou/export/file/");
        if (!savefile.exists()) {
            savefile.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream("/Users/pengweiqiang/tanzhou/export/file/ExcelExportBigData.bigDataExport.xls");
        workbook.write(fos);
        fos.close();
        System.out.println(new Date().getTime() - start.getTime()+"ms");
    }

}