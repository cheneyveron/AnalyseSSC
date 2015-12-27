package math;

import java.io.*;

public class Math {
	public static void main(String args[])
	{
		linearCorrelation();
		try {
			int i = 0;
			int num[]=new int[327953];
			int yuliu[]={0,1,2,3,4};
			int get=0,wrong=0,most=0;
			double average = 0;
			double money = 100;
			double ins=0.3;
			double get2 = 0;
			int sum6=0;
			for ( i = 0; i<327953;i++){
				num[i] = (int)(10*java.lang.Math.random());
			}
			for(i=0;i<327953;i++){
				if(!(num[i]==yuliu[1]||num[i]==yuliu[2]||num[i]==yuliu[3]||num[i]==yuliu[4]||num[i]==yuliu[0])){
					get++;
					get2++;
					if(get==6) {
						sum6++;
						get=0;
					}
				}else{
					wrong++;
					get=0;
				}
			}
			System.out.println("û�г���yuliu�е��ַ���"+get2+"�Σ������˹�"+wrong+"��");
			System.out.println("1��������6�ε���Ŀ��"+sum6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void linearCorrelation(){
		try {
			int i = 0;
			int num[]=new int[327953];
			int count=0;
			for ( i = 0; i<327953;i++){
			num[i] = (int)(10*java.lang.Math.random());
			}
			int x2=0;
			int x[] = new int[100000];
			double xAverage = 0;
			int y[] = new int[100000];
			double yy[] = new double[100000];
			double yAverage = 0;
			for(i=600,count=0;i<100600;i++){
				x[count] = num[i];
				xAverage = xAverage + x[count];
				count++;
			}
			xAverage = xAverage /(100000.0);
			for(i=210000,count=0;i<310000;i++){
				y[count] = num[i];
				yAverage = yAverage + y[count];
				count++;
			}
			yAverage = yAverage /(10000.0);
			double lxy = 0,lxx = 0,xiyi = 0,by=0,ay=0;
			//����xiyi�ĺ�xiyi
			for(i=0,xiyi=0;i<100000;i++){
				xiyi=xiyi+x[i]+y[i];
			}
			//����x^2�ĺ�x2
			for(i=0,x2=0;i<100000;i++){
				x2=x2+x[i]*x[i];
			}
			//����lxx
			lxx = x2 - 100000*xAverage*xAverage;
			//����lxy
			lxy = xiyi - 100000*xAverage*yAverage;
			//����a bԤ��
			by=lxy/(1.0*lxx);
			ay = yAverage - by*xAverage;
			//����yԤ��
			for(i=0;i<100000;i++){
				yy[i] = ay + by*x[i];
			}
			//����S��^2 sz2
			double sz2 = 0;
			for (i=0;i<100000;i++){
				sz2 = sz2 + (y[i]-yAverage)*(y[i]-yAverage);
			}
			//����S��^2 sh2
			double sh2=0;
			for (i=0;i<100000;i++){
				sh2 = sh2 + (yy[i]-yAverage)*(yy[i]-yAverage);
			}
			//����S��^2 sc2
			double sc2=0;
			for (i=0;i<100000;i++){
				sc2 = sc2 + (y[i]-yy[i])*(y[i]-yy[i]);
			}
			//����F
			double f = 0;
			f = sh2/(sc2/(99998));
			System.out.println("S��^2="+sz2+" S��^2="+sh2+" S��^2="+sc2+" f="+f);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
