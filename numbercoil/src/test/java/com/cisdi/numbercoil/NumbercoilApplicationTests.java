package com.cisdi.numbercoil;

import com.cisdi.numbercoil.bean.CoilInfo;
import com.cisdi.numbercoil.bean.coilDetail.*;
import com.cisdi.numbercoil.config.ConditionsConfig;
import com.cisdi.numbercoil.dao.CoilInfoDao;
import com.cisdi.numbercoil.service.ConditionsService;
import com.cisdi.numbercoil.util.ConditionsHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
class NumbercoilApplicationTests {

	@Autowired
	CoilInfoDao coilInfoDaoImp;

	@Autowired
	ConditionsService conditionsService;

	@Autowired
	private ConditionsConfig conditionSConfig;

	@Test
	void contextLoads() {

	}

	@Test
	void test111(){
		System.out.println("---test");
		String[] ids = {"92122527","92122528","92122529"};
		//System.out.println(coilInfoDaoImp.findById("92122527"));
		System.out.println(coilInfoDaoImp.findByIds(ids));
		String rmr22_act_entemp = "test111";
		System.out.println(rmr22_act_entemp+"!!!");
	}

	@Test
	void testShowToString(){
		DCRef dcRef = new DCRef();
		dcRef.setMy_type_string("aaa");
		String[] astrs = {"sss","bbb"};
		String[] astrs2 = {"sssbbb","bbbsss"};
//		dcRef.setC1_ma_tension_ref(astrs);
//		dcRef.setC3_ma_tension_ref(astrs2);
		System.out.println(dcRef);
	}

	@Test
	void testMath(){
		Map<String,Object> a = new HashMap<>();
		a.put("aaa","aaa");
		ArrayList<Double> arrayList = new ArrayList<>();
		arrayList.add(1.0);
		arrayList.add(2.0);
		a.put("ccc",arrayList);
		System.out.println(a.get("ccc") instanceof String);
		System.out.println(null == a.get("aaaaa"));
	}

//	@Test
//	void testInvoke() throws Exception{
//		DCRef dcRef = new DCRef();
//		Method method = dcRef.getClass().getMethod("setC3_ma_tension_ref",String[].class);
//		Method method1 = dcRef.getClass().getMethod("setMy_type_string",Class.forName("java.lang.String"));
//
//		method1.invoke(dcRef,"nicedd");
//		String[] astrs2 = {"sssbbb","bbbsss"};
//		ArrayList<String> astrs3 = new ArrayList<>();
//		int[] aaaint = {999,888,777};
//		astrs3.add("ss");
//		astrs3.add("bb");
//		method.invoke(dcRef,(Object) astrs2);
//		System.out.println(dcRef);
//
//		Method method2 = dcRef.getClass().getMethod("getC3_ma_tension_ref");
//		Method method3 = dcRef.getClass().getMethod("getMy_type_string");
//		String s = method2.invoke(dcRef).getClass().getName();
//		String s2 = method3.invoke(dcRef).getClass().getName();
//		String s3 = ((Object) astrs3).getClass().getName();
//		String s4 = aaaint.getClass().getName();
//		System.out.println("----s----"+s);
//		System.out.println("----s2----"+s2);
//		System.out.println("----s3----"+s3);
//		System.out.println("----s4----"+s4);
//		System.out.println("!!!!!!!!!!!!!!!");
//		//CoilInfoDao coilInfoDao = new CoilInfoDaoImp();
//		CoilInfo coilInfo = coilInfoDaoImp.findById("92122527");
//		System.out.println(coilInfo.toString());
//		Map<String,Object> map = coilInfo.getCoilDetail();
//		if(null == map.get("rmr1")){
//			System.out.println("nicedddd");
//		}
//		System.out.println(map.get("rmr1").getClass().getName());
//		//String[] my = (String[]) map.get("rmr1_act_power");
//		List mymy = (List) map.get("rmr1_act_power");
//		System.out.println(mymy.toString());
//
//
//	}

	@Test
	void testCon() throws Exception{
		DCRef dcRef = new DCRef();
		FMRef fmRef = new FMRef();
		ArrayList<Double> one = new ArrayList<>();
		one.add(1.0);
		one.add(0.2);
		ArrayList<Double> onee = new ArrayList<>();
		one.add(11.0);
		one.add(0.22);
		String str = "sss";
		dcRef.setMy_type_string(str);
		dcRef.setC1_ma_tension_ref(one);
		dcRef.setC3_ma_tension_ref(onee);

		ConditionsHelper conditionsHelper = new ConditionsHelper();
		System.out.println(conditionsHelper.getObjectFields(dcRef,fmRef));
	}

	@Test
	void  testPage(){
		//coilInfoDaoImp.findAll(8,3);
		coilInfoDaoImp.getAllCoilCount();
	}

	@Test
	void setTestData(){
		CoilInfo coilInfo = new CoilInfo();
		String coilNo = "999999999";//钢卷号

		Map<String, Object> coilDetail = new HashMap<>();//钢卷明细
		coilDetail.put("test","test");

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");

		Date createTime = new Date(System.currentTimeMillis());//创建时间
		coilInfo.setCoilDetail(coilDetail);
		coilInfo.setCoilNo(coilNo);
		coilInfo.setCreateTime(createTime);
		//coilInfoDaoImp.saveCoil(coilInfo);

		String str = "3333";
		ArrayList<Double> doubles = new ArrayList<>();
		for(int x=0;x<10;x++){
			Double y = 1.0;
			doubles.add(y);
			y++;
		}
		ArrayList<String> files = conditionsService.getAllCoilConditions();

	}
//  数据库添加测试数据
//	@Test
//	void saveTest() throws Exception{
//		Integer coilNo = 929222500;//钢卷号
//		String value = "stringvalue";
//		Double y = 1.0;
//		Double dou = 100.0;
//		for(int i = 0;i<50;i++) {
//			CoilInfo coilInfo = new CoilInfo();
//			//String coilNo = "929222500";//钢卷号
//
//			Map<String, Object> coilDetail = new HashMap<>();//钢卷明细
//
//			CoilMeasurementData coilMeasurementData = new CoilMeasurementData();
//			CoilStatistics coilStatistics = new CoilStatistics();
//			CoilTargetInformation coilTargetInformation = new CoilTargetInformation();
//			DCAct dcAct = new DCAct();
//			DCRef dcRef = new DCRef();
//			FMAct fmAct = new FMAct();
//			FMRef fmRef = new FMRef();
//			Heating heating = new Heating();
//			InstrumentTestResults instrumentTestResults = new InstrumentTestResults();
//			ProductBasicInformation productBasicInformation = new ProductBasicInformation();
//			RawMaterialsBasicInformation rawMaterialsBasicInformation = new RawMaterialsBasicInformation();
//			RMAct rmAct = new RMAct();
//			RMRef rmRef = new RMRef();
//			TestResult testResult = new TestResult();
//
//			coilDetail = ConditionsHelper.getObjectFieldsAndInit(value, y,dou, coilMeasurementData, coilStatistics, coilTargetInformation, dcAct
//					, dcRef, fmRef, fmAct, heating, instrumentTestResults, productBasicInformation, rawMaterialsBasicInformation
//					, rmAct, rmRef, testResult);
//
//			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
//
//			Date createTime = new Date(System.currentTimeMillis());//创建时间
//			coilInfo.setCoilDetail(coilDetail);
//			coilInfo.setCoilNo(coilNo.toString());
//			coilInfo.setCreateTime(createTime);
//			coilInfoDaoImp.saveCoil(coilInfo);
//			coilNo = coilNo + 1;
//			y = y + 1;
//			dou = dou + 1;
//
//		}
//	}

	@Test
	public void cc(){
		Map<String,String> ss = conditionSConfig.getCondition();
		System.out.println(ss.toString());
	}
}
