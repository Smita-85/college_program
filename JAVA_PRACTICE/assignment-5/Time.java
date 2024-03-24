class Time
{
	int hr,min,sec;
	Time()
	{
		hr=0;
		min=0;
		sec=0;
	}
	Time(int h,int m,int s)
	{
		hr = h;
		min = m;
		sec = s;
	}
	void display()
	{
		System.out.println( hr + ":" + min + ":" + sec );
	}
	void addTime(Time t1, Time t2)
	{
		sec=(t1.sec+t2.sec)%60;
		min=((t1.min+t2.min)+((t1.sec+t2.sec)/60))%60;
		hr=(t1.hr+t2.hr+((t1.min+t2.min)/60))%60;
	}
}
class TimeAdd
{
	public static void main(String ar[])
	{
		Time t1=new Time(11,34,56);
		t1.display();
		Time t2=new Time(16,45,22);
		t2.display();
		Time t3=new Time();
		t3.addTime(t1,t2);
		t3.display();
	}
}