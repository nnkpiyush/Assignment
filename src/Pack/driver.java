package Pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class driver {

	
	static Map<String,HashMap> li=new HashMap<String,HashMap>();
	
	
	
	static void data()
	{
		
		
		HashMap<String,Double> hm=new HashMap<String,Double>();
		hm.put("Monday",3.0);
		hm.put("Tuesday",3.0);
		hm.put("Wednesday",3.0);
		hm.put("Thursday",3.0);
		hm.put("Friday",3.0);
		hm.put("Saturday",5.0);
		hm.put("Sunday",6.0);
		
		HashMap<String,Double> hm1=new HashMap<String,Double>();
		hm1.put("Monday",2.5);
		hm1.put("Tuesday",2.5);
		hm1.put("Wednesday",2.5);
		hm1.put("Thursday",2.5);
		hm1.put("Friday",2.5);
		hm1.put("Saturday",4.0);
		hm1.put("Sunday",4.0);
		
		HashMap<String,Double> hm2=new HashMap<String,Double>();
		hm2.put("Monday",2.0);
		hm2.put("Tuesday",2.0);
		hm2.put("Wednesday",2.0);
		hm2.put("Thursday",2.0);
		hm2.put("Friday",2.0);
		hm2.put("Saturday",2.0);
		hm2.put("Sunday",10.0);
		
		
		HashMap<String,Double> hm3=new HashMap<String,Double>();
		hm3.put("Monday",1.5);
		hm3.put("Tuesday",1.5);
		hm3.put("Wednesday",1.5);
		hm3.put("Thursday",1.5);
		hm3.put("Friday",1.5);
		hm3.put("Saturday",1.5);
		hm3.put("Sunday",1.5);
		
		HashMap<String,Double> hm4=new HashMap<String,Double>();
		hm4.put("Monday",2.0);
		hm4.put("Tuesday",2.0);
		hm4.put("Wednesday",2.0);
		hm4.put("Thursday",2.0);
		hm4.put("Friday",2.0);
		hm4.put("Saturday",4.0);
		hm4.put("Sunday",4.0);
		
		
		li.put("TOI",hm);
		li.put("HINDU",hm1);
		li.put("ET",hm2);
		li.put("BM",hm3);
		li.put("HT",hm4);
		System.out.println(li.get("TOI"));
	}
		
		public static List calculatesubscription(List<String> lis)
		{
			
		data();
		List subs=new ArrayList();
		HashMap TargetList=new HashMap();
		for(int i=0;i<lis.size();i++)
		{
			double subscription=0,weekday=0;
			String str=lis.get(i);
			
			
			
			
		TargetList.putAll(li.get(str.toUpperCase()));
		
		subscription=subscription+ (double)TargetList.get("Sunday")+(double)TargetList.get("Monday")+(double)TargetList.get("Tuesday");
		Set s=TargetList.entrySet();
		
		Iterator i1=s.iterator();
		while(i1.hasNext())
		{
			Map.Entry m=(Map.Entry)i1.next();
			weekday=weekday+(double) m.getValue();
			
					
			
		}
		subscription=subscription+(weekday*4);
		subs.add(subscription);
		
		}
		 return subs;
	}
		
	

	}




